/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.lightTree;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class LightTree2FirConverterTestCaseGenerated extends AbstractLightTree2FirConverterTestCase {
  private void runTest(String testDataFilePath) {
    KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
  }

  public void testAllFilesPresentInRawBuilder() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class Declarations extends AbstractLightTree2FirConverterTestCase {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInDeclarations() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("annotation.kt")
    public void testAnnotation() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotation.kt");
    }

    @TestMetadata("annotationOnField.kt")
    public void testAnnotationOnField() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationOnField.kt");
    }

    @TestMetadata("annotationOnProperty.kt")
    public void testAnnotationOnProperty() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationOnProperty.kt");
    }

    @TestMetadata("annotationOnSuperType.kt")
    public void testAnnotationOnSuperType() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationOnSuperType.kt");
    }

    @TestMetadata("annotationOnSuperTypeCall.kt")
    public void testAnnotationOnSuperTypeCall() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationOnSuperTypeCall.kt");
    }

    @TestMetadata("annotationOnTypeParameterInWhereClause.kt")
    public void testAnnotationOnTypeParameterInWhereClause() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationOnTypeParameterInWhereClause.kt");
    }

    @TestMetadata("annotationsOnNullableParenthesizedTypes.kt")
    public void testAnnotationsOnNullableParenthesizedTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationsOnNullableParenthesizedTypes.kt");
    }

    @TestMetadata("annotationsOnParenthesizedTypes.kt")
    public void testAnnotationsOnParenthesizedTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/annotationsOnParenthesizedTypes.kt");
    }

    @TestMetadata("anonymousObjectWithAnnotation.kt")
    public void testAnonymousObjectWithAnnotation() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/anonymousObjectWithAnnotation.kt");
    }

    @TestMetadata("classLevelDestructuringWithAnnotation.kt")
    public void testClassLevelDestructuringWithAnnotation() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/classLevelDestructuringWithAnnotation.kt");
    }

    @TestMetadata("classWithWrongSuperCall.kt")
    public void testClassWithWrongSuperCall() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/classWithWrongSuperCall.kt");
    }

    @TestMetadata("complexTypes.kt")
    public void testComplexTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/complexTypes.kt");
    }

    @TestMetadata("constructorInObject.kt")
    public void testConstructorInObject() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/constructorInObject.kt");
    }

    @TestMetadata("constructorOfAnonymousObject.kt")
    public void testConstructorOfAnonymousObject() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/constructorOfAnonymousObject.kt");
    }

    @TestMetadata("constructorWithAnnotations.kt")
    public void testConstructorWithAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/constructorWithAnnotations.kt");
    }

    @TestMetadata("constructorWithLocalDeclarations.kt")
    public void testConstructorWithLocalDeclarations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/constructorWithLocalDeclarations.kt");
    }

    @TestMetadata("contextReceivers.kt")
    public void testContextReceivers() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contextReceivers.kt");
    }

    @TestMetadata("danglingAnnotationsClassLevel.kt")
    public void testDanglingAnnotationsClassLevel() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/danglingAnnotationsClassLevel.kt");
    }

    @TestMetadata("danglingAnnotationsFileLevel.kt")
    public void testDanglingAnnotationsFileLevel() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/danglingAnnotationsFileLevel.kt");
    }

    @TestMetadata("danglingConstrants.kt")
    public void testDanglingConstrants() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/danglingConstrants.kt");
    }

    @TestMetadata("dataClassWithAnnotations.kt")
    public void testDataClassWithAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/dataClassWithAnnotations.kt");
    }

    @TestMetadata("delegatedFieldNestedName.kt")
    public void testDelegatedFieldNestedName() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/delegatedFieldNestedName.kt");
    }

    @TestMetadata("delegates.kt")
    public void testDelegates() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/delegates.kt");
    }

    @TestMetadata("delegatesWithAnnotations.kt")
    public void testDelegatesWithAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/delegatesWithAnnotations.kt");
    }

    @TestMetadata("derivedClass.kt")
    public void testDerivedClass() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/derivedClass.kt");
    }

    @TestMetadata("emptyAnonymousObject.kt")
    public void testEmptyAnonymousObject() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/emptyAnonymousObject.kt");
    }

    @TestMetadata("enumEntryWithAnnotations.kt")
    public void testEnumEntryWithAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/enumEntryWithAnnotations.kt");
    }

    @TestMetadata("enums.kt")
    public void testEnums() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/enums.kt");
    }

    @TestMetadata("enums2.kt")
    public void testEnums2() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/enums2.kt");
    }

    @TestMetadata("enums3.kt")
    public void testEnums3() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/enums3.kt");
    }

    @TestMetadata("expectActual.kt")
    public void testExpectActual() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/expectActual.kt");
    }

    @TestMetadata("expectClassesAndFunctions.kt")
    public void testExpectClassesAndFunctions() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/expectClassesAndFunctions.kt");
    }

    @TestMetadata("expectNestedAnnotationClassWithConstructorParameter.kt")
    public void testExpectNestedAnnotationClassWithConstructorParameter() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/expectNestedAnnotationClassWithConstructorParameter.kt");
    }

    @TestMetadata("expectNestedClassMembers.kt")
    public void testExpectNestedClassMembers() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/expectNestedClassMembers.kt");
    }

    @TestMetadata("expectNestedEnumClassGeneratedMembers.kt")
    public void testExpectNestedEnumClassGeneratedMembers() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/expectNestedEnumClassGeneratedMembers.kt");
    }

    @TestMetadata("external.kt")
    public void testExternal() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/external.kt");
    }

    @TestMetadata("F.kt")
    public void testF() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/F.kt");
    }

    @TestMetadata("fileAnnotations.kt")
    public void testFileAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/fileAnnotations.kt");
    }

    @TestMetadata("fileAnnotationsWithoutPackage.kt")
    public void testFileAnnotationsWithoutPackage() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/fileAnnotationsWithoutPackage.kt");
    }

    @TestMetadata("functionTypes.kt")
    public void testFunctionTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/functionTypes.kt");
    }

    @TestMetadata("functionWithAnnotations.kt")
    public void testFunctionWithAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/functionWithAnnotations.kt");
    }

    @TestMetadata("genericFunctions.kt")
    public void testGenericFunctions() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/genericFunctions.kt");
    }

    @TestMetadata("genericProperty.kt")
    public void testGenericProperty() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/genericProperty.kt");
    }

    @TestMetadata("incompletePropertyWithDelegate.kt")
    public void testIncompletePropertyWithDelegate() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/incompletePropertyWithDelegate.kt");
    }

    @TestMetadata("initBlockWithDeclarations.kt")
    public void testInitBlockWithDeclarations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/initBlockWithDeclarations.kt");
    }

    @TestMetadata("initWithLocalDeclarations.kt")
    public void testInitWithLocalDeclarations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/initWithLocalDeclarations.kt");
    }

    @TestMetadata("invalidDestructing.kt")
    public void testInvalidDestructing() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/invalidDestructing.kt");
    }

    @TestMetadata("kotlinAny.kt")
    public void testKotlinAny() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/kotlinAny.kt");
    }

    @TestMetadata("kotlinAnyNonTopLevel.kt")
    public void testKotlinAnyNonTopLevel() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/kotlinAnyNonTopLevel.kt");
    }

    @TestMetadata("localAnnotations.kt")
    public void testLocalAnnotations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/localAnnotations.kt");
    }

    @TestMetadata("localDeclarationsInEnumEntry.kt")
    public void testLocalDeclarationsInEnumEntry() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/localDeclarationsInEnumEntry.kt");
    }

    @TestMetadata("localImplicitType.kt")
    public void testLocalImplicitType() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/localImplicitType.kt");
    }

    @TestMetadata("multiDeclarations.kt")
    public void testMultiDeclarations() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/multiDeclarations.kt");
    }

    @TestMetadata("nestedClass.kt")
    public void testNestedClass() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/nestedClass.kt");
    }

    @TestMetadata("NestedOfAliasedType.kt")
    public void testNestedOfAliasedType() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/NestedOfAliasedType.kt");
    }

    @TestMetadata("NestedSuperType.kt")
    public void testNestedSuperType() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/NestedSuperType.kt");
    }

    @TestMetadata("noPrimaryConstructor.kt")
    public void testNoPrimaryConstructor() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noPrimaryConstructor.kt");
    }

    @TestMetadata("primaryConstructorWithoutConstructorKeyword.kt")
    public void testPrimaryConstructorWithoutConstructorKeyword() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/primaryConstructorWithoutConstructorKeyword.kt");
    }

    @TestMetadata("propertyWithBackingField.kt")
    public void testPropertyWithBackingField() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/propertyWithBackingField.kt");
    }

    @TestMetadata("propertyWithBackingFieldDifferentTypes.kt")
    public void testPropertyWithBackingFieldDifferentTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/propertyWithBackingFieldDifferentTypes.kt");
    }

    @TestMetadata("secondaryConstructor.kt")
    public void testSecondaryConstructor() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/secondaryConstructor.kt");
    }

    @TestMetadata("simpleClass.kt")
    public void testSimpleClass() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/simpleClass.kt");
    }

    @TestMetadata("simpleFun.kt")
    public void testSimpleFun() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/simpleFun.kt");
    }

    @TestMetadata("simpleTypeAlias.kt")
    public void testSimpleTypeAlias() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/simpleTypeAlias.kt");
    }

    @TestMetadata("splitModifierList.kt")
    public void testSplitModifierList() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/splitModifierList.kt");
    }

    @TestMetadata("suspendFunctionTypes.kt")
    public void testSuspendFunctionTypes() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/suspendFunctionTypes.kt");
    }

    @TestMetadata("topLevelDestructuringWithAnnotation.kt")
    public void testTopLevelDestructuringWithAnnotation() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/topLevelDestructuringWithAnnotation.kt");
    }

    @TestMetadata("typeAliasWithGeneric.kt")
    public void testTypeAliasWithGeneric() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/typeAliasWithGeneric.kt");
    }

    @TestMetadata("typeParameterVsNested.kt")
    public void testTypeParameterVsNested() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/typeParameterVsNested.kt");
    }

    @TestMetadata("typeParameters.kt")
    public void testTypeParameters() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/typeParameters.kt");
    }

    @TestMetadata("userAny.kt")
    public void testUserAny() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/userAny.kt");
    }

    @TestMetadata("where.kt")
    public void testWhere() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/where.kt");
    }

    @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Contracts extends AbstractLightTree2FirConverterTestCase {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInContracts() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/newSyntax")
      @TestDataPath("$PROJECT_ROOT")
      @RunWith(JUnit3RunnerWithInners.class)
      public static class NewSyntax extends AbstractLightTree2FirConverterTestCase {
        private void runTest(String testDataFilePath) {
          KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInNewSyntax() {
          KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/newSyntax"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("functionWithBothOldAndNewSyntaxContractDescription.kt")
        public void testFunctionWithBothOldAndNewSyntaxContractDescription() {
          runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/newSyntax/functionWithBothOldAndNewSyntaxContractDescription.kt");
        }

        @TestMetadata("propertyAccessorsContractDescription.kt")
        public void testPropertyAccessorsContractDescription() {
          runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/newSyntax/propertyAccessorsContractDescription.kt");
        }

        @TestMetadata("simpleFunctionsContractDescription.kt")
        public void testSimpleFunctionsContractDescription() {
          runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/newSyntax/simpleFunctionsContractDescription.kt");
        }
      }

      @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/oldSyntax")
      @TestDataPath("$PROJECT_ROOT")
      @RunWith(JUnit3RunnerWithInners.class)
      public static class OldSyntax extends AbstractLightTree2FirConverterTestCase {
        private void runTest(String testDataFilePath) {
          KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInOldSyntax() {
          KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/oldSyntax"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("contractDescription.kt")
        public void testContractDescription() {
          runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/contracts/oldSyntax/contractDescription.kt");
        }
      }
    }

    @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/invalidCode")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class InvalidCode extends AbstractLightTree2FirConverterTestCase {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInInvalidCode() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/invalidCode"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("setterWithNoBodyAndDifferentValueParameterType.kt")
      public void testSetterWithNoBodyAndDifferentValueParameterType() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/invalidCode/setterWithNoBodyAndDifferentValueParameterType.kt");
      }
    }

    @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class NoParameterType extends AbstractLightTree2FirConverterTestCase {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInNoParameterType() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("noParameterTypRefInCatch.kt")
      public void testNoParameterTypRefInCatch() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInCatch.kt");
      }

      @TestMetadata("noParameterTypRefInFuncionalType.kt")
      public void testNoParameterTypRefInFuncionalType() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInFuncionalType.kt");
      }

      @TestMetadata("noParameterTypRefInFunction.kt")
      public void testNoParameterTypRefInFunction() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInFunction.kt");
      }

      @TestMetadata("noParameterTypRefInLambda.kt")
      public void testNoParameterTypRefInLambda() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInLambda.kt");
      }

      @TestMetadata("noParameterTypRefInPrimaryConstructor.kt")
      public void testNoParameterTypRefInPrimaryConstructor() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInPrimaryConstructor.kt");
      }

      @TestMetadata("noParameterTypRefInPrimaryConstructorWithVararg.kt")
      public void testNoParameterTypRefInPrimaryConstructorWithVararg() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInPrimaryConstructorWithVararg.kt");
      }

      @TestMetadata("noParameterTypRefInPrimaryConsturctorVal.kt")
      public void testNoParameterTypRefInPrimaryConsturctorVal() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInPrimaryConsturctorVal.kt");
      }

      @TestMetadata("noParameterTypRefInPrimaryConsturctorValWithVararg.kt")
      public void testNoParameterTypRefInPrimaryConsturctorValWithVararg() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInPrimaryConsturctorValWithVararg.kt");
      }

      @TestMetadata("noParameterTypRefInSecondaryConstructor.kt")
      public void testNoParameterTypRefInSecondaryConstructor() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInSecondaryConstructor.kt");
      }

      @TestMetadata("noParameterTypRefInSetter.kt")
      public void testNoParameterTypRefInSetter() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/noParameterTypRefInSetter.kt");
      }

      @TestMetadata("uncompletedTypRefInPrimaryConstructorWithVararg.kt")
      public void testUncompletedTypRefInPrimaryConstructorWithVararg() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/uncompletedTypRefInPrimaryConstructorWithVararg.kt");
      }

      @TestMetadata("uncompletedTypRefInPrimaryConsturctorValWithVararg.kt")
      public void testUncompletedTypRefInPrimaryConsturctorValWithVararg() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/declarations/noParameterType/uncompletedTypRefInPrimaryConsturctorValWithVararg.kt");
      }
    }
  }

  @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class Expressions extends AbstractLightTree2FirConverterTestCase {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInExpressions() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("annotated.kt")
    public void testAnnotated() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/annotated.kt");
    }

    @TestMetadata("arrayAccess.kt")
    public void testArrayAccess() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/arrayAccess.kt");
    }

    @TestMetadata("arrayAssignment.kt")
    public void testArrayAssignment() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/arrayAssignment.kt");
    }

    @TestMetadata("branches.kt")
    public void testBranches() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/branches.kt");
    }

    @TestMetadata("callableReferences.kt")
    public void testCallableReferences() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/callableReferences.kt");
    }

    @TestMetadata("calls.kt")
    public void testCalls() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/calls.kt");
    }

    @TestMetadata("cascadeIf.kt")
    public void testCascadeIf() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/cascadeIf.kt");
    }

    @TestMetadata("classReference.kt")
    public void testClassReference() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/classReference.kt");
    }

    @TestMetadata("collectionLiterals.kt")
    public void testCollectionLiterals() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/collectionLiterals.kt");
    }

    @TestMetadata("destructuring.kt")
    public void testDestructuring() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/destructuring.kt");
    }

    @TestMetadata("for.kt")
    public void testFor() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/for.kt");
    }

    @TestMetadata("genericCalls.kt")
    public void testGenericCalls() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/genericCalls.kt");
    }

    @TestMetadata("in.kt")
    public void testIn() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/in.kt");
    }

    @TestMetadata("inBrackets.kt")
    public void testInBrackets() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/inBrackets.kt");
    }

    @TestMetadata("init.kt")
    public void testInit() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/init.kt");
    }

    @TestMetadata("invalidWhen.kt")
    public void testInvalidWhen() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/invalidWhen.kt");
    }

    @TestMetadata("labelForInfix.kt")
    public void testLabelForInfix() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/labelForInfix.kt");
    }

    @TestMetadata("lambda.kt")
    public void testLambda() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/lambda.kt");
    }

    @TestMetadata("lambdaAndAnonymousFunction.kt")
    public void testLambdaAndAnonymousFunction() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/lambdaAndAnonymousFunction.kt");
    }

    @TestMetadata("localDeclarationWithExpression.kt")
    public void testLocalDeclarationWithExpression() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/localDeclarationWithExpression.kt");
    }

    @TestMetadata("locals.kt")
    public void testLocals() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/locals.kt");
    }

    @TestMetadata("modifications.kt")
    public void testModifications() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/modifications.kt");
    }

    @TestMetadata("namedArgument.kt")
    public void testNamedArgument() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/namedArgument.kt");
    }

    @TestMetadata("nullability.kt")
    public void testNullability() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/nullability.kt");
    }

    @TestMetadata("qualifierWithTypeArguments.kt")
    public void testQualifierWithTypeArguments() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/qualifierWithTypeArguments.kt");
    }

    @TestMetadata("safeCallsWithAssignment.kt")
    public void testSafeCallsWithAssignment() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/safeCallsWithAssignment.kt");
    }

    @TestMetadata("safeCallsWithAugmentedAssignment.kt")
    public void testSafeCallsWithAugmentedAssignment() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/safeCallsWithAugmentedAssignment.kt");
    }

    @TestMetadata("safeCallsWithUnaryOperators.kt")
    public void testSafeCallsWithUnaryOperators() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/safeCallsWithUnaryOperators.kt");
    }

    @TestMetadata("simpleReturns.kt")
    public void testSimpleReturns() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/simpleReturns.kt");
    }

    @TestMetadata("super.kt")
    public void testSuper() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/super.kt");
    }

    @TestMetadata("these.kt")
    public void testThese() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/these.kt");
    }

    @TestMetadata("try.kt")
    public void testTry() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/try.kt");
    }

    @TestMetadata("typeOperators.kt")
    public void testTypeOperators() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/typeOperators.kt");
    }

    @TestMetadata("unary.kt")
    public void testUnary() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/unary.kt");
    }

    @TestMetadata("variables.kt")
    public void testVariables() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/variables.kt");
    }

    @TestMetadata("whenGuards.kt")
    public void testWhenGuards() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/whenGuards.kt");
    }

    @TestMetadata("while.kt")
    public void testWhile() {
      runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/while.kt");
    }

    @TestMetadata("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/invalidCode")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class InvalidCode extends AbstractLightTree2FirConverterTestCase {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInInvalidCode() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/invalidCode"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("longStringTemplateEntryInvalidCharacters.kt")
      public void testLongStringTemplateEntryInvalidCharacters() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/invalidCode/longStringTemplateEntryInvalidCharacters.kt");
      }

      @TestMetadata("longStringTemplateEntryWithTwoExpressions.kt")
      public void testLongStringTemplateEntryWithTwoExpressions() {
        runTest("compiler/fir/raw-fir/psi2fir/testData/rawBuilder/expressions/invalidCode/longStringTemplateEntryWithTwoExpressions.kt");
      }
    }
  }
}
