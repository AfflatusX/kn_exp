/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.targets.native.internal

import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.FileCollection
import org.gradle.api.file.ProjectLayout
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.provider.ProviderFactory
import org.gradle.api.provider.SetProperty
import org.gradle.api.tasks.*
import org.jetbrains.kotlin.build.report.metrics.BuildMetricsReporter
import org.jetbrains.kotlin.build.report.metrics.GradleBuildPerformanceMetric
import org.jetbrains.kotlin.build.report.metrics.GradleBuildTime
import org.jetbrains.kotlin.commonizer.*
import org.jetbrains.kotlin.compilerRunner.*
import org.jetbrains.kotlin.internal.compilerRunner.native.KotlinNativeToolRunner
import org.jetbrains.kotlin.gradle.dsl.multiplatformExtension
import org.jetbrains.kotlin.gradle.dsl.multiplatformExtensionOrNull
import org.jetbrains.kotlin.gradle.internal.UsesClassLoadersCachingBuildService
import org.jetbrains.kotlin.gradle.internal.properties.nativeProperties
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.jetbrains.kotlin.gradle.plugin.sources.DefaultKotlinSourceSet
import org.jetbrains.kotlin.gradle.plugin.sources.withDependsOnClosure
import org.jetbrains.kotlin.gradle.report.GradleBuildMetricsReporter
import org.jetbrains.kotlin.gradle.targets.native.internal.CInteropCommonizerTask.CInteropCommonizerDependencies
import org.jetbrains.kotlin.gradle.targets.native.internal.CInteropCommonizerTask.CInteropGist
import org.jetbrains.kotlin.gradle.tasks.CInteropProcess
import org.jetbrains.kotlin.gradle.utils.*
import org.jetbrains.kotlin.konan.target.KonanTarget
import java.io.File
import javax.inject.Inject

private typealias GroupedCommonizerDependencies = Map<CInteropCommonizerGroup, List<CInteropCommonizerDependencies>>


@CacheableTask
internal abstract class CInteropCommonizerTask
@Inject constructor(
    private val objectFactory: ObjectFactory,
    private val projectLayout: ProjectLayout,
    providerFactory: ProviderFactory,
) : AbstractCInteropCommonizerTask(),
    UsesClassLoadersCachingBuildService {

    internal class CInteropGist(
        @get:Input val identifier: CInteropIdentifier,
        @get:Input val konanTarget: KonanTarget,
        sourceSets: Provider<Set<KotlinSourceSet>>,

        @get:Classpath
        val libraryFile: Provider<File>,

        @get:Classpath
        val dependencies: FileCollection,
    ) {
        @Suppress("unused") // Used for UP-TO-DATE check
        @get:Input
        val allSourceSetNames: Provider<List<String>> = sourceSets
            .map { it.withDependsOnClosure.map(Any::toString) }

        /** Autogenerated with IDEA */
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false

            other as CInteropGist

            if (identifier != other.identifier) return false
            if (konanTarget != other.konanTarget) return false
            if (libraryFile != other.libraryFile) return false
            if (dependencies != other.dependencies) return false
            if (allSourceSetNames != other.allSourceSetNames) return false

            return true
        }

        /** Autogenerated with IDEA */
        override fun hashCode(): Int {
            var result = identifier.hashCode()
            result = 31 * result + konanTarget.hashCode()
            result = 31 * result + libraryFile.hashCode()
            result = 31 * result + dependencies.hashCode()
            result = 31 * result + allSourceSetNames.hashCode()
            return result
        }

    }

    override val outputDirectory: File get() = projectLayout.buildDirectory.get().asFile.resolve("classes/kotlin/commonizer")

    @get:Internal
    internal val metrics: Provider<BuildMetricsReporter<GradleBuildTime, GradleBuildPerformanceMetric>> = objectFactory
        .property<BuildMetricsReporter<GradleBuildTime, GradleBuildPerformanceMetric>>(GradleBuildMetricsReporter())
        .chainedDisallowChanges()

    @get:Classpath
    internal val commonizerClasspath: ConfigurableFileCollection = objectFactory.fileCollection()

    @get:Input
    internal val customJvmArgs: ListProperty<String> = objectFactory
        .listProperty<String>()
        .chainedFinalizeValueOnRead()

    @get:Internal
    internal val commonizerToolRunner: Provider<KotlinNativeToolRunner> = providerFactory.provider {
        objectFactory.KotlinNativeCommonizerToolRunner(
            metrics,
            classLoadersCachingService,
            commonizerClasspath,
            customJvmArgs
        )
    }

    @get:Internal
    internal abstract val kotlinCompilerArgumentsLogLevel: Property<KotlinCompilerArgumentsLogLevel>

    private val konanHome = project.nativeProperties.actualNativeHomeDirectory
    private val commonizerLogLevel = project.commonizerLogLevel
    private val additionalCommonizerSettings = project.additionalCommonizerSettings

    data class CInteropCommonizerDependencies(
        val commonizerTarget: CommonizerTarget,
        val dependencies: FileCollection,
    )

    /**
     * For Gradle Configuration Cache support the Group-to-Dependencies relation should be pre-cached.
     * It is used during execution phase.
     */
    private val groupedCommonizerDependencies: Future<GroupedCommonizerDependencies> = project.lazyFuture {
        val multiplatformExtension = project.multiplatformExtensionOrNull ?: return@lazyFuture emptyMap()

        val sourceSetsByTarget = multiplatformExtension.sourceSets.groupBy { sourceSet -> sourceSet.commonizerTarget.getOrThrow() }
        val sourceSetsByGroup = multiplatformExtension.sourceSets.groupBy { sourceSet ->
            CInteropCommonizerDependent.from(sourceSet)?.let { findCInteropCommonizerGroup(it) }
        }

        allInteropGroups.await().associateWith { group ->
            (group.targets + group.targets.allLeaves()).map { target ->
                val externalDependencyFiles: List<FileCollection> = when (target) {
                    is LeafCommonizerTarget -> {
                        cinterops.get()
                            .filter { cinterop -> cinterop.identifier in group.interops && cinterop.konanTarget == target.konanTarget }
                            .map { cinterop -> cinterop.dependencies }
                    }

                    is SharedCommonizerTarget -> {
                        val targetSourceSets = sourceSetsByTarget[target].orEmpty()
                        val groupSourceSets = sourceSetsByGroup[group].orEmpty().toSet()
                        targetSourceSets.intersect(groupSourceSets)
                            .filterIsInstance<DefaultKotlinSourceSet>()
                            /*
                            We take dependencies just from a single matching source set!
                            This is because all source sets matching the target and group constraints
                            will provide the same dependencies (since cinterops are just based upon KonanTarget)
                             */
                            .take(1)
                            .map { sourceSet -> project.createCommonizedCInteropDependencyConfigurationView(sourceSet) }
                    }
                }

                CInteropCommonizerDependencies(
                    target, project.files(externalDependencyFiles, project.getNativeDistributionDependencies(target))
                )
            }
        }
    }

    @Suppress("unused") // Used for UP-TO-DATE check
    @get:Classpath
    protected val commonizerDependenciesClasspath: FileCollection = project.filesProvider {
        groupedCommonizerDependencies.getOrThrow().values.flatten().map { it.dependencies }
    }

    @get:Nested
    internal val cinterops: SetProperty<CInteropGist> = objectFactory.setProperty<CInteropGist>()

    @get:OutputDirectories
    val allOutputDirectories: Set<File>
        get() = allInteropGroups.getOrThrow().map { outputDirectory(it) }.toSet()

    internal fun from(task: TaskProvider<CInteropProcess>) {
        dependsOn(task)
        cinterops.add(task.map { it.toGist() })

    }

    @TaskAction
    protected fun commonizeCInteropLibraries() {
        val metricReporter = metrics.get()
        addBuildMetricsForTaskAction(metricsReporter = metricReporter, languageVersion = null) {
            allInteropGroups.getOrThrow().forEach(::commonize)
        }
    }

    private fun commonize(group: CInteropCommonizerGroup) {
        val cinteropsForTarget = cinterops.get().filter { cinterop -> cinterop.identifier in group.interops }
        val outputDirectory = outputDirectory(group)
        outputDirectory.deleteRecursively()
        if (cinteropsForTarget.isEmpty()) return

        GradleCliCommonizer(
            commonizerToolRunner.get(),
            kotlinCompilerArgumentsLogLevel.get(),
        ).commonizeLibraries(
            konanHome = konanHome.get(),
            outputTargets = group.targets,
            inputLibraries = cinteropsForTarget.map { it.libraryFile.get() }.filter { it.exists() }.toSet(),
            dependencyLibraries = getCInteropCommonizerGroupDependencies(group),
            outputDirectory = outputDirectory,
            logLevel = commonizerLogLevel,
            additionalSettings = additionalCommonizerSettings,
        )
    }

    private fun getCInteropCommonizerGroupDependencies(group: CInteropCommonizerGroup): Set<CommonizerDependency> {
        val dependencies = groupedCommonizerDependencies.getOrThrow()[group]
            ?.flatMap { (target, dependencies) ->
                dependencies.files
                    .filter { file -> file.exists() && (file.isDirectory || file.extension == "klib") }
                    .map { file -> TargetedCommonizerDependency(target, file) }
            }
            ?.toSet()
        requireNotNull(dependencies) { "Unexpected $group" }

        return dependencies
    }

    @get:Internal
    internal val allInteropGroups: Future<Set<CInteropCommonizerGroup>> = project.kotlinCInteropGroups

    @Nested
    @Suppress("unused") // UP-TO-DATE check
    protected fun getAllInteropGroupsForUpToDateCheck() = allInteropGroups.getOrThrow()
}

private fun CInteropProcess.toGist(): CInteropGist {
    return CInteropGist(
        identifier = settings.identifier,
        konanTarget = konanTarget,
        // FIXME support cinterop with PM20
        sourceSets = project.provider {
            project.multiplatformExtension.targets.getByName(targetName)
                .compilations.getByName(compilationName).kotlinSourceSets
        },
        libraryFile = outputFileProvider,
        dependencies = libraries
    )
}
