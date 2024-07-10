/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.file.structure;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/inBlockModification")
@TestDataPath("$PROJECT_ROOT")
public class ScriptDanglingFileInBlockModificationTestGenerated extends AbstractScriptDanglingFileInBlockModificationTest {
  @Test
  public void testAllFilesPresentInInBlockModification() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/inBlockModification"), Pattern.compile("^(.+)\\.(kts)$"), null, false);
  }

  @Test
  @TestMetadata("assignment.kts")
  public void testAssignment() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/assignment.kts");
  }

  @Test
  @TestMetadata("contractScript.kts")
  public void testContractScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/contractScript.kts");
  }

  @Test
  @TestMetadata("entireContractScript.kts")
  public void testEntireContractScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/entireContractScript.kts");
  }

  @Test
  @TestMetadata("entireFunctionBodyScript.kts")
  public void testEntireFunctionBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/entireFunctionBodyScript.kts");
  }

  @Test
  @TestMetadata("entireGetterBodyScript.kts")
  public void testEntireGetterBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/entireGetterBodyScript.kts");
  }

  @Test
  @TestMetadata("entireInitializerScript.kts")
  public void testEntireInitializerScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/entireInitializerScript.kts");
  }

  @Test
  @TestMetadata("entireSetterBodyScript.kts")
  public void testEntireSetterBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/entireSetterBodyScript.kts");
  }

  @Test
  @TestMetadata("extensionWithDefaultParametersScript.kts")
  public void testExtensionWithDefaultParametersScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/extensionWithDefaultParametersScript.kts");
  }

  @Test
  @TestMetadata("functionWithDefaultParametersScript.kts")
  public void testFunctionWithDefaultParametersScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/functionWithDefaultParametersScript.kts");
  }

  @Test
  @TestMetadata("insideContractScript.kts")
  public void testInsideContractScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/insideContractScript.kts");
  }

  @Test
  @TestMetadata("insideDefaultParameterScript.kts")
  public void testInsideDefaultParameterScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/insideDefaultParameterScript.kts");
  }

  @Test
  @TestMetadata("insideStatement.kts")
  public void testInsideStatement() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/insideStatement.kts");
  }

  @Test
  @TestMetadata("memberFunWithBodyWithContractScript.kts")
  public void testMemberFunWithBodyWithContractScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithContractScript.kts");
  }

  @Test
  @TestMetadata("memberFunWithBodyWithErrorContractScript.kts")
  public void testMemberFunWithBodyWithErrorContractScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithErrorContractScript.kts");
  }

  @Test
  @TestMetadata("memberFunWithBodyWithFakeContractScript.kts")
  public void testMemberFunWithBodyWithFakeContractScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithFakeContractScript.kts");
  }

  @Test
  @TestMetadata("memberFunWithBodyWithTypeScript.kts")
  public void testMemberFunWithBodyWithTypeScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithTypeScript.kts");
  }

  @Test
  @TestMetadata("memberFunWithBodyWithoutTypeScript.kts")
  public void testMemberFunWithBodyWithoutTypeScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithoutTypeScript.kts");
  }

  @Test
  @TestMetadata("memberFunWithBodyWithoutTypeWithoutNameScript.kts")
  public void testMemberFunWithBodyWithoutTypeWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithBodyWithoutTypeWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("memberFunWithTypeWithoutBodyScript.kts")
  public void testMemberFunWithTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithTypeWithoutBodyScript.kts");
  }

  @Test
  @TestMetadata("memberFunWithoutBodyWithTypeWithoutNameScript.kts")
  public void testMemberFunWithoutBodyWithTypeWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithoutBodyWithTypeWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("memberFunWithoutBodyWithoutTypeWithoutNameScript.kts")
  public void testMemberFunWithoutBodyWithoutTypeWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithoutBodyWithoutTypeWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("memberFunWithoutTypeWithoutBodyScript.kts")
  public void testMemberFunWithoutTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberFunWithoutTypeWithoutBodyScript.kts");
  }

  @Test
  @TestMetadata("memberGetterWithBodyWithContractScript.kts")
  public void testMemberGetterWithBodyWithContractScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithBodyWithContractScript.kts");
  }

  @Test
  @TestMetadata("memberGetterWithBodyWithContractWithoutNameScript.kts")
  public void testMemberGetterWithBodyWithContractWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithBodyWithContractWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("memberGetterWithTypeWithBodyScript.kts")
  public void testMemberGetterWithTypeWithBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithTypeWithBodyScript.kts");
  }

  @Test
  @TestMetadata("memberGetterWithTypeWithoutBodyScript.kts")
  public void testMemberGetterWithTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithTypeWithoutBodyScript.kts");
  }

  @Test
  @TestMetadata("memberGetterWithTypeWithoutBodyWithoutNameScript.kts")
  public void testMemberGetterWithTypeWithoutBodyWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithTypeWithoutBodyWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("memberGetterWithoutTypeWithBodyScript.kts")
  public void testMemberGetterWithoutTypeWithBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithoutTypeWithBodyScript.kts");
  }

  @Test
  @TestMetadata("memberGetterWithoutTypeWithoutBodyScript.kts")
  public void testMemberGetterWithoutTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberGetterWithoutTypeWithoutBodyScript.kts");
  }

  @Test
  @TestMetadata("memberPropertyWithTypeInDelegateScript.kts")
  public void testMemberPropertyWithTypeInDelegateScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithTypeInDelegateScript.kts");
  }

  @Test
  @TestMetadata("memberPropertyWithTypeInDelegateWithoutNameScript.kts")
  public void testMemberPropertyWithTypeInDelegateWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithTypeInDelegateWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("memberPropertyWithTypeInErrorDelegateScript.kts")
  public void testMemberPropertyWithTypeInErrorDelegateScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithTypeInErrorDelegateScript.kts");
  }

  @Test
  @TestMetadata("memberPropertyWithTypeInInitializerScript.kts")
  public void testMemberPropertyWithTypeInInitializerScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithTypeInInitializerScript.kts");
  }

  @Test
  @TestMetadata("memberPropertyWithTypeInInitializerWithoutNameScript.kts")
  public void testMemberPropertyWithTypeInInitializerWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithTypeInInitializerWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("memberPropertyWithoutTypeInDelegateScript.kts")
  public void testMemberPropertyWithoutTypeInDelegateScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithoutTypeInDelegateScript.kts");
  }

  @Test
  @TestMetadata("memberPropertyWithoutTypeInErrorDelegateScript.kts")
  public void testMemberPropertyWithoutTypeInErrorDelegateScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithoutTypeInErrorDelegateScript.kts");
  }

  @Test
  @TestMetadata("memberPropertyWithoutTypeInInitializerScript.kts")
  public void testMemberPropertyWithoutTypeInInitializerScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberPropertyWithoutTypeInInitializerScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithTypeWithBodyFakeFieldDeclarationScript.kts")
  public void testMemberSetterWithTypeWithBodyFakeFieldDeclarationScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithBodyFakeFieldDeclarationScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithTypeWithBodyFakeFieldScript.kts")
  public void testMemberSetterWithTypeWithBodyFakeFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithBodyFakeFieldScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithTypeWithBodyFieldScript.kts")
  public void testMemberSetterWithTypeWithBodyFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithBodyFieldScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithTypeWithBodyNearFieldScript.kts")
  public void testMemberSetterWithTypeWithBodyNearFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithBodyNearFieldScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithTypeWithBodyScript.kts")
  public void testMemberSetterWithTypeWithBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithBodyScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithTypeWithBodyWithoutNameScript.kts")
  public void testMemberSetterWithTypeWithBodyWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithBodyWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithTypeWithoutBodyScript.kts")
  public void testMemberSetterWithTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithoutBodyScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithTypeWithoutBodyWithoutNameScript.kts")
  public void testMemberSetterWithTypeWithoutBodyWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithTypeWithoutBodyWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithoutTypeWithBodyFakeFieldDeclarationScript.kts")
  public void testMemberSetterWithoutTypeWithBodyFakeFieldDeclarationScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithoutTypeWithBodyFakeFieldDeclarationScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithoutTypeWithBodyFakeFieldScript.kts")
  public void testMemberSetterWithoutTypeWithBodyFakeFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithoutTypeWithBodyFakeFieldScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithoutTypeWithBodyFieldScript.kts")
  public void testMemberSetterWithoutTypeWithBodyFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithoutTypeWithBodyFieldScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithoutTypeWithBodyNearFieldScript.kts")
  public void testMemberSetterWithoutTypeWithBodyNearFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithoutTypeWithBodyNearFieldScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithoutTypeWithBodyScript.kts")
  public void testMemberSetterWithoutTypeWithBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithoutTypeWithBodyScript.kts");
  }

  @Test
  @TestMetadata("memberSetterWithoutTypeWithoutBodyScript.kts")
  public void testMemberSetterWithoutTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/memberSetterWithoutTypeWithoutBodyScript.kts");
  }

  @Test
  @TestMetadata("rawContractScript.kts")
  public void testRawContractScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/rawContractScript.kts");
  }

  @Test
  @TestMetadata("statement.kts")
  public void testStatement() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/statement.kts");
  }

  @Test
  @TestMetadata("statement2.kts")
  public void testStatement2() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/statement2.kts");
  }

  @Test
  @TestMetadata("topLevelFunctionWithBodyWithoutTypeWithoutNameScript.kts")
  public void testTopLevelFunctionWithBodyWithoutTypeWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithBodyWithoutTypeWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("topLevelFunctionWithTypeWithBodyScript.kts")
  public void testTopLevelFunctionWithTypeWithBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithTypeWithBodyScript.kts");
  }

  @Test
  @TestMetadata("topLevelFunctionWithTypeWithoutBodyScript.kts")
  public void testTopLevelFunctionWithTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithTypeWithoutBodyScript.kts");
  }

  @Test
  @TestMetadata("topLevelFunctionWithoutBodyWithTypeWithoutNameScript.kts")
  public void testTopLevelFunctionWithoutBodyWithTypeWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithoutBodyWithTypeWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("topLevelFunctionWithoutBodyWithoutTypeWithoutNameScript.kts")
  public void testTopLevelFunctionWithoutBodyWithoutTypeWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithoutBodyWithoutTypeWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("topLevelFunctionWithoutTypeWithBodyScript.kts")
  public void testTopLevelFunctionWithoutTypeWithBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithoutTypeWithBodyScript.kts");
  }

  @Test
  @TestMetadata("topLevelFunctionWithoutTypeWithoutBodyScript.kts")
  public void testTopLevelFunctionWithoutTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelFunctionWithoutTypeWithoutBodyScript.kts");
  }

  @Test
  @TestMetadata("topLevelGetterWithTypeWithBodyFakeFieldDeclarationScript.kts")
  public void testTopLevelGetterWithTypeWithBodyFakeFieldDeclarationScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithBodyFakeFieldDeclarationScript.kts");
  }

  @Test
  @TestMetadata("topLevelGetterWithTypeWithBodyFakeFieldScript.kts")
  public void testTopLevelGetterWithTypeWithBodyFakeFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithBodyFakeFieldScript.kts");
  }

  @Test
  @TestMetadata("topLevelGetterWithTypeWithBodyFieldScript.kts")
  public void testTopLevelGetterWithTypeWithBodyFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithBodyFieldScript.kts");
  }

  @Test
  @TestMetadata("topLevelGetterWithTypeWithBodyNearFieldScript.kts")
  public void testTopLevelGetterWithTypeWithBodyNearFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithBodyNearFieldScript.kts");
  }

  @Test
  @TestMetadata("topLevelGetterWithTypeWithBodyScript.kts")
  public void testTopLevelGetterWithTypeWithBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithBodyScript.kts");
  }

  @Test
  @TestMetadata("topLevelGetterWithTypeWithBodyWithoutNameScript.kts")
  public void testTopLevelGetterWithTypeWithBodyWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithBodyWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("topLevelGetterWithTypeWithoutBodyScript.kts")
  public void testTopLevelGetterWithTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithoutBodyScript.kts");
  }

  @Test
  @TestMetadata("topLevelGetterWithTypeWithoutBodyWithoutNameScript.kts")
  public void testTopLevelGetterWithTypeWithoutBodyWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithTypeWithoutBodyWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("topLevelGetterWithoutTypeWithBodyScript.kts")
  public void testTopLevelGetterWithoutTypeWithBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithoutTypeWithBodyScript.kts");
  }

  @Test
  @TestMetadata("topLevelGetterWithoutTypeWithoutBodyScript.kts")
  public void testTopLevelGetterWithoutTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelGetterWithoutTypeWithoutBodyScript.kts");
  }

  @Test
  @TestMetadata("topLevelPropertyWithTypeInDelegateScript.kts")
  public void testTopLevelPropertyWithTypeInDelegateScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithTypeInDelegateScript.kts");
  }

  @Test
  @TestMetadata("topLevelPropertyWithTypeInDelegateWithoutNameScript.kts")
  public void testTopLevelPropertyWithTypeInDelegateWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithTypeInDelegateWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("topLevelPropertyWithTypeInErrorDelegateScript.kts")
  public void testTopLevelPropertyWithTypeInErrorDelegateScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithTypeInErrorDelegateScript.kts");
  }

  @Test
  @TestMetadata("topLevelPropertyWithTypeInInititalzerScript.kts")
  public void testTopLevelPropertyWithTypeInInititalzerScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithTypeInInititalzerScript.kts");
  }

  @Test
  @TestMetadata("topLevelPropertyWithTypeInInititalzerWithoutNameScript.kts")
  public void testTopLevelPropertyWithTypeInInititalzerWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithTypeInInititalzerWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("topLevelPropertyWithoutTypeInDelegateScript.kts")
  public void testTopLevelPropertyWithoutTypeInDelegateScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithoutTypeInDelegateScript.kts");
  }

  @Test
  @TestMetadata("topLevelPropertyWithoutTypeInErrorDelegateScript.kts")
  public void testTopLevelPropertyWithoutTypeInErrorDelegateScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithoutTypeInErrorDelegateScript.kts");
  }

  @Test
  @TestMetadata("topLevelPropertyWithoutTypeInInititalzerScript.kts")
  public void testTopLevelPropertyWithoutTypeInInititalzerScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelPropertyWithoutTypeInInititalzerScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithTypeWithBodyFakeFieldScript.kts")
  public void testTopLevelSetterWithTypeWithBodyFakeFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithBodyFakeFieldScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithTypeWithBodyFakeFieldScriptDeclaration.kts")
  public void testTopLevelSetterWithTypeWithBodyFakeFieldScriptDeclaration() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithBodyFakeFieldScriptDeclaration.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithTypeWithBodyFieldScript.kts")
  public void testTopLevelSetterWithTypeWithBodyFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithBodyFieldScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithTypeWithBodyNearFieldScript.kts")
  public void testTopLevelSetterWithTypeWithBodyNearFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithBodyNearFieldScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithTypeWithBodyScript.kts")
  public void testTopLevelSetterWithTypeWithBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithBodyScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithTypeWithBodyWithoutNameScript.kts")
  public void testTopLevelSetterWithTypeWithBodyWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithBodyWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithTypeWithoutBodyScript.kts")
  public void testTopLevelSetterWithTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithoutBodyScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithTypeWithoutBodyWithoutNameScript.kts")
  public void testTopLevelSetterWithTypeWithoutBodyWithoutNameScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithTypeWithoutBodyWithoutNameScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithoutTypeWithBodyFakeFieldDeclarationScript.kts")
  public void testTopLevelSetterWithoutTypeWithBodyFakeFieldDeclarationScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithoutTypeWithBodyFakeFieldDeclarationScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithoutTypeWithBodyFakeFieldScript.kts")
  public void testTopLevelSetterWithoutTypeWithBodyFakeFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithoutTypeWithBodyFakeFieldScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithoutTypeWithBodyFieldScript.kts")
  public void testTopLevelSetterWithoutTypeWithBodyFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithoutTypeWithBodyFieldScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithoutTypeWithBodyNearFieldScript.kts")
  public void testTopLevelSetterWithoutTypeWithBodyNearFieldScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithoutTypeWithBodyNearFieldScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithoutTypeWithBodyScript.kts")
  public void testTopLevelSetterWithoutTypeWithBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithoutTypeWithBodyScript.kts");
  }

  @Test
  @TestMetadata("topLevelSetterWithoutTypeWithoutBodyScript.kts")
  public void testTopLevelSetterWithoutTypeWithoutBodyScript() {
    runTest("analysis/low-level-api-fir/testData/inBlockModification/topLevelSetterWithoutTypeWithoutBodyScript.kts");
  }
}
