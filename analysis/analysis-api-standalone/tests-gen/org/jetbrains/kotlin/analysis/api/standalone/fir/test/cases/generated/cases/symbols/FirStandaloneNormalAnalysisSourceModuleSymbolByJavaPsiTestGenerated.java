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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.symbols.AbstractSymbolByJavaPsiTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/symbols/symbolByJavaPsi")
@TestDataPath("$PROJECT_ROOT")
public class FirStandaloneNormalAnalysisSourceModuleSymbolByJavaPsiTestGenerated extends AbstractSymbolByJavaPsiTest {
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
  public void testAllFilesPresentInSymbolByJavaPsi() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/symbols/symbolByJavaPsi"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("javaField.kt")
  public void testJavaField() {
    runTest("analysis/analysis-api/testData/symbols/symbolByJavaPsi/javaField.kt");
  }

  @Test
  @TestMetadata("javaFieldFromSuperclass.kt")
  public void testJavaFieldFromSuperclass() {
    runTest("analysis/analysis-api/testData/symbols/symbolByJavaPsi/javaFieldFromSuperclass.kt");
  }

  @Test
  @TestMetadata("javaStaticField.kt")
  public void testJavaStaticField() {
    runTest("analysis/analysis-api/testData/symbols/symbolByJavaPsi/javaStaticField.kt");
  }

  @Test
  @TestMetadata("javaStaticFieldFromSuperclass.kt")
  public void testJavaStaticFieldFromSuperclass() {
    runTest("analysis/analysis-api/testData/symbols/symbolByJavaPsi/javaStaticFieldFromSuperclass.kt");
  }

  @Test
  @TestMetadata("packagePrivateProtectedClass.kt")
  public void testPackagePrivateProtectedClass() {
    runTest("analysis/analysis-api/testData/symbols/symbolByJavaPsi/packagePrivateProtectedClass.kt");
  }

  @Test
  @TestMetadata("packagePrivateProtectedField.kt")
  public void testPackagePrivateProtectedField() {
    runTest("analysis/analysis-api/testData/symbols/symbolByJavaPsi/packagePrivateProtectedField.kt");
  }

  @Test
  @TestMetadata("packagePrivateProtectedMethod.kt")
  public void testPackagePrivateProtectedMethod() {
    runTest("analysis/analysis-api/testData/symbols/symbolByJavaPsi/packagePrivateProtectedMethod.kt");
  }

  @Test
  @TestMetadata("packagePrivateProtectedStaticClass.kt")
  public void testPackagePrivateProtectedStaticClass() {
    runTest("analysis/analysis-api/testData/symbols/symbolByJavaPsi/packagePrivateProtectedStaticClass.kt");
  }

  @Test
  @TestMetadata("packagePrivateProtectedStaticField.kt")
  public void testPackagePrivateProtectedStaticField() {
    runTest("analysis/analysis-api/testData/symbols/symbolByJavaPsi/packagePrivateProtectedStaticField.kt");
  }

  @Test
  @TestMetadata("packagePrivateProtectedStaticMethod.kt")
  public void testPackagePrivateProtectedStaticMethod() {
    runTest("analysis/analysis-api/testData/symbols/symbolByJavaPsi/packagePrivateProtectedStaticMethod.kt");
  }
}
