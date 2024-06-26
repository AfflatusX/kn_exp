/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.gradle.targets.js.npm

import org.gradle.api.tasks.Internal
import org.jetbrains.kotlin.gradle.targets.js.RequiredKotlinJsDependency
import org.jetbrains.kotlin.gradle.targets.js.ir.KotlinJsIrCompilation

interface RequiresNpmDependencies {
    val compilation: KotlinJsIrCompilation
    val requiredNpmDependencies: Set<RequiredKotlinJsDependency>

    @Internal
    fun getPath(): String
}