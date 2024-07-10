/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.visibilityChecker;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.visibilityChecker.AbstractVisibilityCheckerTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/visibilityChecker/visibility")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleVisibilityCheckerTestGenerated extends AbstractVisibilityCheckerTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Ide
      )
    );
  }

  @Test
  public void testAllFilesPresentInVisibility() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/visibilityChecker/visibility"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("classTypeParameter.kt")
  public void testClassTypeParameter() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/classTypeParameter.kt");
  }

  @Test
  @TestMetadata("internalClassInBinaryLibrary.kt")
  public void testInternalClassInBinaryLibrary() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/internalClassInBinaryLibrary.kt");
  }

  @Test
  @TestMetadata("internalClassInBinaryLibraryFriendDependency.kt")
  public void testInternalClassInBinaryLibraryFriendDependency() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/internalClassInBinaryLibraryFriendDependency.kt");
  }

  @Test
  @TestMetadata("internalClassInSourceModule.kt")
  public void testInternalClassInSourceModule() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/internalClassInSourceModule.kt");
  }

  @Test
  @TestMetadata("internalClassInSourceModuleFriendDependency.kt")
  public void testInternalClassInSourceModuleFriendDependency() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/internalClassInSourceModuleFriendDependency.kt");
  }

  @Test
  @TestMetadata("internalMemberFunctionInBinaryLibrary.kt")
  public void testInternalMemberFunctionInBinaryLibrary() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/internalMemberFunctionInBinaryLibrary.kt");
  }

  @Test
  @TestMetadata("internalMemberFunctionInBinaryLibraryFriendDependency.kt")
  public void testInternalMemberFunctionInBinaryLibraryFriendDependency() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/internalMemberFunctionInBinaryLibraryFriendDependency.kt");
  }

  @Test
  @TestMetadata("internalMemberFunctionInSourceModule.kt")
  public void testInternalMemberFunctionInSourceModule() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/internalMemberFunctionInSourceModule.kt");
  }

  @Test
  @TestMetadata("internalMemberFunctionInSourceModuleFriendDependency.kt")
  public void testInternalMemberFunctionInSourceModuleFriendDependency() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/internalMemberFunctionInSourceModuleFriendDependency.kt");
  }

  @Test
  @TestMetadata("privateClassInBinaryLibrary.kt")
  public void testPrivateClassInBinaryLibrary() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/privateClassInBinaryLibrary.kt");
  }

  @Test
  @TestMetadata("privateClassInSourceModule.kt")
  public void testPrivateClassInSourceModule() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/privateClassInSourceModule.kt");
  }

  @Test
  @TestMetadata("privateMemberFunctionInBinaryLibrary.kt")
  public void testPrivateMemberFunctionInBinaryLibrary() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/privateMemberFunctionInBinaryLibrary.kt");
  }

  @Test
  @TestMetadata("privateMemberFunctionInSourceModule.kt")
  public void testPrivateMemberFunctionInSourceModule() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/privateMemberFunctionInSourceModule.kt");
  }

  @Test
  @TestMetadata("publicClassInBinaryLibrary.kt")
  public void testPublicClassInBinaryLibrary() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/publicClassInBinaryLibrary.kt");
  }

  @Test
  @TestMetadata("publicClassInSourceModule.kt")
  public void testPublicClassInSourceModule() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/publicClassInSourceModule.kt");
  }

  @Test
  @TestMetadata("publicMemberFunctionInBinaryLibrary.kt")
  public void testPublicMemberFunctionInBinaryLibrary() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/publicMemberFunctionInBinaryLibrary.kt");
  }

  @Test
  @TestMetadata("publicMemberFunctionInSourceModule.kt")
  public void testPublicMemberFunctionInSourceModule() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/publicMemberFunctionInSourceModule.kt");
  }

  @Test
  @TestMetadata("useSiteInLibraryNotVisible.kt")
  public void testUseSiteInLibraryNotVisible() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/useSiteInLibraryNotVisible.kt");
  }

  @Test
  @TestMetadata("useSiteInLibraryVisible.kt")
  public void testUseSiteInLibraryVisible() {
    runTest("analysis/analysis-api/testData/components/visibilityChecker/visibility/useSiteInLibraryVisible.kt");
  }
}
