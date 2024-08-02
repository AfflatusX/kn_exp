/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.diagnostics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/diagnostics/nativeTests")
@TestDataPath("$PROJECT_ROOT")
public class DiagnosticsNativeTestGenerated extends AbstractDiagnosticsNativeTest {
  @Test
  public void testAllFilesPresentInNativeTests() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll|latestLV)\\.kts?$"), true, "specialBackendChecks");
  }

  @Test
  @TestMetadata("arrays_after.kt")
  public void testArrays_after() {
    runTest("compiler/testData/diagnostics/nativeTests/arrays_after.kt");
  }

  @Test
  @TestMetadata("cloneableInNative.kt")
  public void testCloneableInNative() {
    runTest("compiler/testData/diagnostics/nativeTests/cloneableInNative.kt");
  }

  @Test
  @TestMetadata("forwardDeclarations.kt")
  public void testForwardDeclarations() {
    runTest("compiler/testData/diagnostics/nativeTests/forwardDeclarations.kt");
  }

  @Test
  @TestMetadata("identifiers.kt")
  public void testIdentifiers() {
    runTest("compiler/testData/diagnostics/nativeTests/identifiers.kt");
  }

  @Test
  @TestMetadata("isInitialized.kt")
  public void testIsInitialized() {
    runTest("compiler/testData/diagnostics/nativeTests/isInitialized.kt");
  }

  @Test
  @TestMetadata("isInitializedError.kt")
  public void testIsInitializedError() {
    runTest("compiler/testData/diagnostics/nativeTests/isInitializedError.kt");
  }

  @Test
  @TestMetadata("nativeProtectedFunCall.kt")
  public void testNativeProtectedFunCall() {
    runTest("compiler/testData/diagnostics/nativeTests/nativeProtectedFunCall.kt");
  }

  @Test
  @TestMetadata("noIncompatibleThrowsOnSubstitutionAndIntersectionOverrides.kt")
  public void testNoIncompatibleThrowsOnSubstitutionAndIntersectionOverrides() {
    runTest("compiler/testData/diagnostics/nativeTests/noIncompatibleThrowsOnSubstitutionAndIntersectionOverrides.kt");
  }

  @Test
  @TestMetadata("noObjcOverrideConflictingOverloadsDisabled.kt")
  public void testNoObjcOverrideConflictingOverloadsDisabled() {
    runTest("compiler/testData/diagnostics/nativeTests/noObjcOverrideConflictingOverloadsDisabled.kt");
  }

  @Test
  @TestMetadata("noObjcOverrideConflictingOverloadsEnabled.kt")
  public void testNoObjcOverrideConflictingOverloadsEnabled() {
    runTest("compiler/testData/diagnostics/nativeTests/noObjcOverrideConflictingOverloadsEnabled.kt");
  }

  @Test
  @TestMetadata("objCName.kt")
  public void testObjCName() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName.kt");
  }

  @Test
  @TestMetadata("objCName2.kt")
  public void testObjCName2() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName2.kt");
  }

  @Test
  @TestMetadata("objCName3.kt")
  public void testObjCName3() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName3.kt");
  }

  @Test
  @TestMetadata("objCName4.kt")
  public void testObjCName4() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName4.kt");
  }

  @Test
  @TestMetadata("objCName5.kt")
  public void testObjCName5() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName5.kt");
  }

  @Test
  @TestMetadata("objCName6.kt")
  public void testObjCName6() {
    runTest("compiler/testData/diagnostics/nativeTests/objCName6.kt");
  }

  @Test
  @TestMetadata("objCNameWIthDifferentSwiftName.kt")
  public void testObjCNameWIthDifferentSwiftName() {
    runTest("compiler/testData/diagnostics/nativeTests/objCNameWIthDifferentSwiftName.kt");
  }

  @Test
  @TestMetadata("objCNameWithTwoModules.kt")
  public void testObjCNameWithTwoModules() {
    runTest("compiler/testData/diagnostics/nativeTests/objCNameWithTwoModules.kt");
  }

  @Test
  @TestMetadata("objCRefinement.kt")
  public void testObjCRefinement() {
    runTest("compiler/testData/diagnostics/nativeTests/objCRefinement.kt");
  }

  @Test
  @TestMetadata("objcOverrideApplicability.kt")
  public void testObjcOverrideApplicability() {
    runTest("compiler/testData/diagnostics/nativeTests/objcOverrideApplicability.kt");
  }

  @Test
  @TestMetadata("resolveToDelegatedProperty.kt")
  public void testResolveToDelegatedProperty() {
    runTest("compiler/testData/diagnostics/nativeTests/resolveToDelegatedProperty.kt");
  }

  @Test
  @TestMetadata("sharedImmutable.kt")
  public void testSharedImmutable() {
    runTest("compiler/testData/diagnostics/nativeTests/sharedImmutable.kt");
  }

  @Test
  @TestMetadata("stdClassAndTypealiasAmbiguity.kt")
  public void testStdClassAndTypealiasAmbiguity() {
    runTest("compiler/testData/diagnostics/nativeTests/stdClassAndTypealiasAmbiguity.kt");
  }

  @Test
  @TestMetadata("threadLocal.kt")
  public void testThreadLocal() {
    runTest("compiler/testData/diagnostics/nativeTests/threadLocal.kt");
  }

  @Test
  @TestMetadata("throws.kt")
  public void testThrows() {
    runTest("compiler/testData/diagnostics/nativeTests/throws.kt");
  }

  @Test
  @TestMetadata("throwsClash.kt")
  public void testThrowsClash() {
    runTest("compiler/testData/diagnostics/nativeTests/throwsClash.kt");
  }

  @Test
  @TestMetadata("topLevelSingleton.kt")
  public void testTopLevelSingleton() {
    runTest("compiler/testData/diagnostics/nativeTests/topLevelSingleton.kt");
  }

  @Nested
  @TestMetadata("compiler/testData/diagnostics/nativeTests/multiplatform")
  @TestDataPath("$PROJECT_ROOT")
  public class Multiplatform {
    @Test
    public void testAllFilesPresentInMultiplatform() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/diagnostics/nativeTests/multiplatform"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.(reversed|fir|ll|latestLV)\\.kts?$"), true);
    }

    @Test
    @TestMetadata("objCAction_expectAnnotation.kt")
    public void testObjCAction_expectAnnotation() {
      runTest("compiler/testData/diagnostics/nativeTests/multiplatform/objCAction_expectAnnotation.kt");
    }

    @Test
    @TestMetadata("objCName_expectAnnotation.kt")
    public void testObjCName_expectAnnotation() {
      runTest("compiler/testData/diagnostics/nativeTests/multiplatform/objCName_expectAnnotation.kt");
    }

    @Test
    @TestMetadata("objCOutlet_expectAnnotation.kt")
    public void testObjCOutlet_expectAnnotation() {
      runTest("compiler/testData/diagnostics/nativeTests/multiplatform/objCOutlet_expectAnnotation.kt");
    }

    @Test
    @TestMetadata("objCRefinement_expectAnnotation.kt")
    public void testObjCRefinement_expectAnnotation() {
      runTest("compiler/testData/diagnostics/nativeTests/multiplatform/objCRefinement_expectAnnotation.kt");
    }

    @Test
    @TestMetadata("overrideInit_expectAnnotation.kt")
    public void testOverrideInit_expectAnnotation() {
      runTest("compiler/testData/diagnostics/nativeTests/multiplatform/overrideInit_expectAnnotation.kt");
    }

    @Test
    @TestMetadata("sharedImmutable_expectAnnotation.kt")
    public void testSharedImmutable_expectAnnotation() {
      runTest("compiler/testData/diagnostics/nativeTests/multiplatform/sharedImmutable_expectAnnotation.kt");
    }

    @Test
    @TestMetadata("threadLocal_expectAnnotation.kt")
    public void testThreadLocal_expectAnnotation() {
      runTest("compiler/testData/diagnostics/nativeTests/multiplatform/threadLocal_expectAnnotation.kt");
    }
  }
}
