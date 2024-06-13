/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.standalone.fir.test.cases.generated.cases.symbols;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.standalone.fir.test.configurators.AnalysisApiFirStandaloneModeTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.symbols.AbstractSymbolByFqNameTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/symbols/symbolByFqName")
@TestDataPath("$PROJECT_ROOT")
public class FirStandaloneNormalAnalysisSourceModuleSymbolByFqNameTestGenerated extends AbstractSymbolByFqNameTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFirStandaloneModeTestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fir,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Standalone
      )
    );
  }

  @Test
  public void testAllFilesPresentInSymbolByFqName() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByFqName"), Pattern.compile("^(.+)\\.kt$"), null, true, "withTestCompilerPluginEnabled");
  }

  @Test
  @TestMetadata("class.kt")
  public void testClass() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/class.kt");
  }

  @Test
  @TestMetadata("classFromJdk.kt")
  public void testClassFromJdk() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/classFromJdk.kt");
  }

  @Test
  @TestMetadata("enumEntry.kt")
  public void testEnumEntry() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/enumEntry.kt");
  }

  @Test
  @TestMetadata("fileWalkDirectionEnum.kt")
  public void testFileWalkDirectionEnum() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/fileWalkDirectionEnum.kt");
  }

  @Test
  @TestMetadata("iterator.kt")
  public void testIterator() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/iterator.kt");
  }

  @Test
  @TestMetadata("kclass.kt")
  public void testKclass() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/kclass.kt");
  }

  @Test
  @TestMetadata("listOf.kt")
  public void testListOf() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/listOf.kt");
  }

  @Test
  @TestMetadata("memberFunction.kt")
  public void testMemberFunction() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/memberFunction.kt");
  }

  @Test
  @TestMetadata("memberFunctionWithOverloads.kt")
  public void testMemberFunctionWithOverloads() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/memberFunctionWithOverloads.kt");
  }

  @Test
  @TestMetadata("nestedClass.kt")
  public void testNestedClass() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/nestedClass.kt");
  }

  @Test
  @TestMetadata("samConstructorFromInterface.kt")
  public void testSamConstructorFromInterface() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/samConstructorFromInterface.kt");
  }

  @Test
  @TestMetadata("samConstructorFromTypeAlias.kt")
  public void testSamConstructorFromTypeAlias() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/samConstructorFromTypeAlias.kt");
  }

  @Test
  @TestMetadata("typealias.kt")
  public void testTypealias() {
    runTest("analysis/analysis-api/testData/symbols/symbolByFqName/typealias.kt");
  }
}
