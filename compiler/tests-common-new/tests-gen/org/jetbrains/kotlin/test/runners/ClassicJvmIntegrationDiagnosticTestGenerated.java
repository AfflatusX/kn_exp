/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/jvmIntegration")
@TestDataPath("$PROJECT_ROOT")
public class ClassicJvmIntegrationDiagnosticTestGenerated extends AbstractClassicJvmIntegrationDiagnosticTest {
  @Test
  public void testAllFilesPresentInJvmIntegration() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
  }

  @Nested
  @TestMetadata("compiler/testData/diagnostics/jvmIntegration/classpath")
  @TestDataPath("$PROJECT_ROOT")
  public class Classpath {
    @Test
    public void testAllFilesPresentInClasspath() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration/classpath"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("classFromJdkInLibrary.kt")
    public void testClassFromJdkInLibrary() {
      runTest("compiler/testData/diagnostics/jvmIntegration/classpath/classFromJdkInLibrary.kt");
    }

    @Test
    @TestMetadata("dependencyOnItself.kt")
    public void testDependencyOnItself() {
      runTest("compiler/testData/diagnostics/jvmIntegration/classpath/dependencyOnItself.kt");
    }

    @Test
    @TestMetadata("prohibitNestedClassesByDollarName.kt")
    public void testProhibitNestedClassesByDollarName() {
      runTest("compiler/testData/diagnostics/jvmIntegration/classpath/prohibitNestedClassesByDollarName.kt");
    }

    @Test
    @TestMetadata("sameLibraryTwiceInClasspath.kt")
    public void testSameLibraryTwiceInClasspath() {
      runTest("compiler/testData/diagnostics/jvmIntegration/classpath/sameLibraryTwiceInClasspath.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/diagnostics/jvmIntegration/dataClassNonPublicConstructor")
  @TestDataPath("$PROJECT_ROOT")
  public class DataClassNonPublicConstructor {
    @Test
    public void testAllFilesPresentInDataClassNonPublicConstructor() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration/dataClassNonPublicConstructor"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("dataClassInternalConstructorUsageWillBecomeInaccessible.kt")
    public void testDataClassInternalConstructorUsageWillBecomeInaccessible() {
      runTest("compiler/testData/diagnostics/jvmIntegration/dataClassNonPublicConstructor/dataClassInternalConstructorUsageWillBecomeInaccessible.kt");
    }

    @Test
    @TestMetadata("dataClassNonPublicConstructorIrrelevantCopyFunctions.kt")
    public void testDataClassNonPublicConstructorIrrelevantCopyFunctions() {
      runTest("compiler/testData/diagnostics/jvmIntegration/dataClassNonPublicConstructor/dataClassNonPublicConstructorIrrelevantCopyFunctions.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/diagnostics/jvmIntegration/inline")
  @TestDataPath("$PROJECT_ROOT")
  public class Inline {
    @Test
    public void testAllFilesPresentInInline() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration/inline"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("wrongInlineTarget.kt")
    public void testWrongInlineTarget() {
      runTest("compiler/testData/diagnostics/jvmIntegration/inline/wrongInlineTarget.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/diagnostics/jvmIntegration/internal")
  @TestDataPath("$PROJECT_ROOT")
  public class Internal {
    @Test
    public void testAllFilesPresentInInternal() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration/internal"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("internalFromForeignModule.kt")
    public void testInternalFromForeignModule() {
      runTest("compiler/testData/diagnostics/jvmIntegration/internal/internalFromForeignModule.kt");
    }

    @Test
    @TestMetadata("internalFromFriendModule.kt")
    public void testInternalFromFriendModule() {
      runTest("compiler/testData/diagnostics/jvmIntegration/internal/internalFromFriendModule.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/diagnostics/jvmIntegration/jvmDefault")
  @TestDataPath("$PROJECT_ROOT")
  public class JvmDefault {
    @Test
    public void testAllFilesPresentInJvmDefault() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration/jvmDefault"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("annotationsFromBinariesWithNonTrivialJvmDefaultConfiguration.kt")
    public void testAnnotationsFromBinariesWithNonTrivialJvmDefaultConfiguration() {
      runTest("compiler/testData/diagnostics/jvmIntegration/jvmDefault/annotationsFromBinariesWithNonTrivialJvmDefaultConfiguration.kt");
    }

    @Test
    @TestMetadata("clashWithNoCompatibility.kt")
    public void testClashWithNoCompatibility() {
      runTest("compiler/testData/diagnostics/jvmIntegration/jvmDefault/clashWithNoCompatibility.kt");
    }

    @Test
    @TestMetadata("clashWithOld.kt")
    public void testClashWithOld() {
      runTest("compiler/testData/diagnostics/jvmIntegration/jvmDefault/clashWithOld.kt");
    }

    @Test
    @TestMetadata("compatibilityAgainstJava.kt")
    public void testCompatibilityAgainstJava() {
      runTest("compiler/testData/diagnostics/jvmIntegration/jvmDefault/compatibilityAgainstJava.kt");
    }

    @Test
    @TestMetadata("nonDefaultInheritanceSuperCall.kt")
    public void testNonDefaultInheritanceSuperCall() {
      runTest("compiler/testData/diagnostics/jvmIntegration/jvmDefault/nonDefaultInheritanceSuperCall.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/diagnostics/jvmIntegration/modules")
  @TestDataPath("$PROJECT_ROOT")
  public class Modules {
    @Test
    public void testAllFilesPresentInModules() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration/modules"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("dependOnManyModules.kt")
    public void testDependOnManyModules() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/dependOnManyModules.kt");
    }

    @Test
    @TestMetadata("internalJdkPackageUsage.kt")
    public void testInternalJdkPackageUsage() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/internalJdkPackageUsage.kt");
    }

    @Test
    @TestMetadata("jdkModulesFromNamed.kt")
    public void testJdkModulesFromNamed() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkModulesFromNamed.kt");
    }

    @Test
    @TestMetadata("jdkModulesFromUnnamed.kt")
    public void testJdkModulesFromUnnamed() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkModulesFromUnnamed.kt");
    }

    @Test
    @TestMetadata("nonTransitiveDoesNotAffectExplicitDependency.kt")
    public void testNonTransitiveDoesNotAffectExplicitDependency() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/nonTransitiveDoesNotAffectExplicitDependency.kt");
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/simple.kt");
    }

    @Test
    @TestMetadata("simpleUseNonExportedPackage.kt")
    public void testSimpleUseNonExportedPackage() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/simpleUseNonExportedPackage.kt");
    }

    @Test
    @TestMetadata("sourcelessSmartcastSourcefulOriginalExpression.kt")
    public void testSourcelessSmartcastSourcefulOriginalExpression() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/sourcelessSmartcastSourcefulOriginalExpression.kt");
    }

    @Test
    @TestMetadata("unnamedDependsOnNamed.kt")
    public void testUnnamedDependsOnNamed() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/unnamedDependsOnNamed.kt");
    }

    @Test
    @TestMetadata("unnamedDoesNotReadNotAdded.kt")
    public void testUnnamedDoesNotReadNotAdded() {
      runTest("compiler/testData/diagnostics/jvmIntegration/modules/unnamedDoesNotReadNotAdded.kt");
    }

    @Nested
    @TestMetadata("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag")
    @TestDataPath("$PROJECT_ROOT")
    public class JdkReleaseFlag {
      @Test
      public void testAllFilesPresentInJdkReleaseFlag() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
      }

      @Test
      @TestMetadata("conflictWithJvmTarget.kt")
      public void testConflictWithJvmTarget() {
        runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag/conflictWithJvmTarget.kt");
      }

      @Test
      @TestMetadata("jdk11.kt")
      public void testJdk11() {
        runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag/jdk11.kt");
      }

      @Test
      @TestMetadata("jdk11Release12.kt")
      public void testJdk11Release12() {
        runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag/jdk11Release12.kt");
      }

      @Test
      @TestMetadata("jdk17.kt")
      public void testJdk17() {
        runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag/jdk17.kt");
      }

      @Test
      @TestMetadata("unknownReleaseVersion.kt")
      public void testUnknownReleaseVersion() {
        runTest("compiler/testData/diagnostics/jvmIntegration/modules/jdkReleaseFlag/unknownReleaseVersion.kt");
      }
    }
  }

  @Nested
  @TestMetadata("compiler/testData/diagnostics/jvmIntegration/rawTypes")
  @TestDataPath("$PROJECT_ROOT")
  public class RawTypes {
    @Test
    public void testAllFilesPresentInRawTypes() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration/rawTypes"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() {
      runTest("compiler/testData/diagnostics/jvmIntegration/rawTypes/simple.kt");
    }
  }

  @Nested
  @TestMetadata("compiler/testData/diagnostics/jvmIntegration/sealed")
  @TestDataPath("$PROJECT_ROOT")
  public class Sealed {
    @Test
    public void testAllFilesPresentInSealed() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/jvmIntegration/sealed"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("sealedClassesAndInterfaces.kt")
    public void testSealedClassesAndInterfaces() {
      runTest("compiler/testData/diagnostics/jvmIntegration/sealed/sealedClassesAndInterfaces.kt");
    }

    @Test
    @TestMetadata("sealedInheritorInDifferentModule.kt")
    public void testSealedInheritorInDifferentModule() {
      runTest("compiler/testData/diagnostics/jvmIntegration/sealed/sealedInheritorInDifferentModule.kt");
    }
  }
}
