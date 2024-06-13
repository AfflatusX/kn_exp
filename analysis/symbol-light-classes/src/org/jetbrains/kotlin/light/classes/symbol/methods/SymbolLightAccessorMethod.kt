/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.light.classes.symbol.methods

import com.intellij.openapi.util.TextRange
import com.intellij.psi.*
import com.intellij.psi.impl.light.LightParameterListBuilder
import com.intellij.psi.impl.light.LightReferenceListBuilder
import org.jetbrains.kotlin.analysis.api.KaSession
import org.jetbrains.kotlin.analysis.api.KaConstantInitializerValue
import org.jetbrains.kotlin.analysis.api.KaConstantValueForAnnotation
import org.jetbrains.kotlin.analysis.api.KaNonConstantInitializerValue
import org.jetbrains.kotlin.analysis.api.symbols.*
import org.jetbrains.kotlin.analysis.api.symbols.pointers.KaSymbolPointer
import org.jetbrains.kotlin.analysis.api.types.KaTypeMappingMode
import org.jetbrains.kotlin.analysis.api.types.KaTypeNullability
import org.jetbrains.kotlin.asJava.builder.LightMemberOrigin
import org.jetbrains.kotlin.asJava.classes.METHOD_INDEX_FOR_GETTER
import org.jetbrains.kotlin.asJava.classes.METHOD_INDEX_FOR_SETTER
import org.jetbrains.kotlin.asJava.classes.lazyPub
import org.jetbrains.kotlin.asJava.elements.KtLightIdentifier
import org.jetbrains.kotlin.descriptors.annotations.AnnotationUseSiteTarget
import org.jetbrains.kotlin.light.classes.symbol.*
import org.jetbrains.kotlin.light.classes.symbol.annotations.*
import org.jetbrains.kotlin.light.classes.symbol.classes.SymbolLightClassBase
import org.jetbrains.kotlin.light.classes.symbol.classes.SymbolLightClassForInterfaceDefaultImpls
import org.jetbrains.kotlin.light.classes.symbol.modifierLists.GranularModifiersBox
import org.jetbrains.kotlin.light.classes.symbol.modifierLists.SymbolLightMemberModifierList
import org.jetbrains.kotlin.light.classes.symbol.modifierLists.with
import org.jetbrains.kotlin.light.classes.symbol.parameters.SymbolLightParameterForDefaultImplsReceiver
import org.jetbrains.kotlin.light.classes.symbol.parameters.SymbolLightParameterList
import org.jetbrains.kotlin.light.classes.symbol.parameters.SymbolLightSetterParameter
import org.jetbrains.kotlin.light.classes.symbol.parameters.SymbolLightTypeParameterList
import org.jetbrains.kotlin.load.java.JvmAbi.getterName
import org.jetbrains.kotlin.load.java.JvmAbi.setterName
import org.jetbrains.kotlin.psi.KtCallableDeclaration
import org.jetbrains.kotlin.psi.KtDeclaration
import org.jetbrains.kotlin.psi.KtParameter
import org.jetbrains.kotlin.psi.KtPropertyAccessor
import org.jetbrains.kotlin.utils.addToStdlib.ifTrue

internal class SymbolLightAccessorMethod private constructor(
    lightMemberOrigin: LightMemberOrigin?,
    containingClass: SymbolLightClassBase,
    methodIndex: Int,
    private val isGetter: Boolean,
    private val propertyAccessorDeclaration: KtPropertyAccessor?,
    private val propertyAccessorSymbolPointer: KaSymbolPointer<KaPropertyAccessorSymbol>,
    private val containingPropertyDeclaration: KtCallableDeclaration?,
    private val containingPropertySymbolPointer: KaSymbolPointer<KaPropertySymbol>,
    private val isTopLevel: Boolean,
    private val suppressStatic: Boolean,
) : SymbolLightMethodBase(
    lightMemberOrigin,
    containingClass,
    methodIndex,
) {
    internal constructor(
        ktAnalysisSession: KaSession,
        propertyAccessorSymbol: KaPropertyAccessorSymbol,
        containingPropertySymbol: KaPropertySymbol,
        lightMemberOrigin: LightMemberOrigin?,
        containingClass: SymbolLightClassBase,
        isTopLevel: Boolean,
        suppressStatic: Boolean = false,
    ) : this(
        lightMemberOrigin,
        containingClass,
        methodIndex = if (propertyAccessorSymbol is KaPropertyGetterSymbol) METHOD_INDEX_FOR_GETTER else METHOD_INDEX_FOR_SETTER,
        isGetter = propertyAccessorSymbol is KaPropertyGetterSymbol,
        propertyAccessorDeclaration = propertyAccessorSymbol.sourcePsiSafe(),
        propertyAccessorSymbolPointer = with(ktAnalysisSession) { propertyAccessorSymbol.createPointer() },
        containingPropertyDeclaration = containingPropertySymbol.sourcePsiSafe(),
        containingPropertySymbolPointer = with(ktAnalysisSession) { containingPropertySymbol.createPointer() },
        isTopLevel = isTopLevel,
        suppressStatic = suppressStatic,
    )

    context(KaSession)
    private val KaPropertySymbol.accessorSymbol: KaPropertyAccessorSymbol
        get() = if (isGetter) getter!! else setter!!

    private inline fun <T> withPropertySymbol(crossinline action: KaSession.(KaPropertySymbol) -> T): T =
        containingPropertySymbolPointer.withSymbol(ktModule, action)

    private inline fun <T> withAccessorSymbol(crossinline action: KaSession.(KaPropertyAccessorSymbol) -> T): T =
        propertyAccessorSymbolPointer.withSymbol(ktModule, action)

    private fun String.abiName() = if (isGetter) getterName(this) else setterName(this)

    private val _name: String by lazyPub {
        withPropertySymbol { propertySymbol ->
            val accessorSymbol = propertySymbol.accessorSymbol
            accessorSymbol.getJvmNameFromAnnotation(accessorSite.toOptionalFilter()) ?: run {
                val outerClass = this@SymbolLightAccessorMethod.containingClass
                val defaultName = propertySymbol.name.identifier.let {
                    if (outerClass.isAnnotationType || outerClass.isRecord)
                        it
                    else
                        it.abiName()
                }

                propertySymbol.computeJvmMethodName(defaultName, outerClass, accessorSite, accessorSymbol.visibility)
            }
        }
    }

    override fun getName(): String = _name

    private val _typeParameterList: PsiTypeParameterList? by lazyPub {
        hasTypeParameters().ifTrue {
            SymbolLightTypeParameterList(
                owner = this,
                symbolWithTypeParameterPointer = containingPropertySymbolPointer,
                ktModule = ktModule,
                ktDeclaration = containingPropertyDeclaration,
            )
        }
    }

    override fun hasTypeParameters(): Boolean =
        hasTypeParameters(ktModule, containingPropertyDeclaration, containingPropertySymbolPointer)
                || containingClass.isDefaultImplsForInterfaceWithTypeParameters

    override fun getTypeParameterList(): PsiTypeParameterList? = _typeParameterList
    override fun getTypeParameters(): Array<PsiTypeParameter> = _typeParameterList?.typeParameters ?: PsiTypeParameter.EMPTY_ARRAY

    override fun isVarArgs(): Boolean = false

    override val kotlinOrigin: KtDeclaration? get() = containingPropertyDeclaration

    private val accessorSite
        get() = if (isGetter) AnnotationUseSiteTarget.PROPERTY_GETTER else AnnotationUseSiteTarget.PROPERTY_SETTER

    //TODO Fix it when SymbolConstructorValueParameter be ready
    private val isParameter: Boolean get() = containingPropertyDeclaration == null || containingPropertyDeclaration is KtParameter

    override fun computeThrowsList(builder: LightReferenceListBuilder) {
        withAccessorSymbol { accessorSymbol ->
            accessorSymbol.computeThrowsList(
                builder,
                this@SymbolLightAccessorMethod,
                containingClass,
                accessorSite.toOptionalFilter(),
            )
        }
    }

    private fun computeModifiers(modifier: String): Map<String, Boolean>? = when (modifier) {
        in GranularModifiersBox.VISIBILITY_MODIFIERS -> GranularModifiersBox.computeVisibilityForMember(
            ktModule,
            propertyAccessorSymbolPointer,
        )

        in GranularModifiersBox.MODALITY_MODIFIERS -> {
            val modality = if (containingClass.isInterface) {
                PsiModifier.ABSTRACT
            } else {
                withPropertySymbol { propertySymbol ->
                    propertySymbol.computeSimpleModality()?.takeUnless { it.isSuppressedFinalModifier(containingClass, propertySymbol) }
                }
            }

            GranularModifiersBox.MODALITY_MODIFIERS_MAP.with(modality)
        }

        PsiModifier.STATIC -> {
            val isStatic = if (suppressStatic) {
                false
            } else {
                isTopLevel || containingClass is SymbolLightClassForInterfaceDefaultImpls || isStatic()
            }

            mapOf(modifier to isStatic)
        }

        else -> null
    }

    private fun isStatic(): Boolean = withPropertySymbol { propertySymbol ->
        if (propertySymbol.isStatic) {
            return@withPropertySymbol true
        }

        val filter = accessorSite.toOptionalFilter()
        propertySymbol.hasJvmStaticAnnotation(filter) || propertySymbol.accessorSymbol.hasJvmStaticAnnotation(filter)
    }

    private val _modifierList: PsiModifierList by lazyPub {
        SymbolLightMemberModifierList(
            containingDeclaration = this,
            modifiersBox = GranularModifiersBox(computer = ::computeModifiers),
            annotationsBox = GranularAnnotationsBox(
                annotationsProvider = CompositeAnnotationsProvider(
                    SymbolAnnotationsProvider(
                        ktModule = ktModule,
                        annotatedSymbolPointer = propertyAccessorSymbolPointer,
                        annotationUseSiteTargetFilter = accessorSite.toOptionalFilter(),
                    ),
                    SymbolAnnotationsProvider(
                        ktModule = ktModule,
                        annotatedSymbolPointer = containingPropertySymbolPointer,
                        annotationUseSiteTargetFilter = accessorSite.toFilter(),
                    ),
                ),
                additionalAnnotationsProvider = CompositeAdditionalAnnotationsProvider(
                    NullabilityAnnotationsProvider {
                        val nullabilityApplicable = isGetter &&
                                !(isParameter && this.containingClass.isAnnotationType) &&
                                !modifierList.hasModifierProperty(PsiModifier.PRIVATE)

                        if (nullabilityApplicable) {
                            withPropertySymbol { propertySymbol ->
                                when {
                                    propertySymbol.isLateInit -> KaTypeNullability.NON_NULLABLE
                                    forceBoxedReturnType(propertySymbol) -> KaTypeNullability.NON_NULLABLE
                                    else -> getTypeNullability(propertySymbol.returnType)
                                }
                            }
                        } else {
                            KaTypeNullability.UNKNOWN
                        }
                    },
                    MethodAdditionalAnnotationsProvider
                )
            ),
        )
    }

    override fun getModifierList(): PsiModifierList = _modifierList

    override fun isConstructor(): Boolean = false

    private val _isDeprecated: Boolean by lazyPub {
        withPropertySymbol { propertySymbol ->
            val filter = accessorSite.toOptionalFilter()
            propertySymbol.hasDeprecatedAnnotation(filter) || propertySymbol.accessorSymbol.hasDeprecatedAnnotation(filter)
        }
    }

    override fun isDeprecated(): Boolean = _isDeprecated

    override fun getNameIdentifier(): PsiIdentifier = KtLightIdentifier(this, containingPropertyDeclaration)

    context(KaSession)
    private fun forceBoxedReturnType(propertySymbol: KaPropertySymbol): Boolean {
        return propertySymbol.returnType.isPrimitiveBacked &&
                propertySymbol.getAllOverriddenSymbols().any { overriddenSymbol ->
                    !overriddenSymbol.returnType.isPrimitiveBacked
                }
    }

    private val _returnedType: PsiType by lazyPub {
        if (!isGetter) return@lazyPub PsiTypes.voidType()

        withPropertySymbol { propertySymbol ->
            val ktType = propertySymbol.returnType

            val typeMappingMode = if (forceBoxedReturnType(propertySymbol))
                KaTypeMappingMode.RETURN_TYPE_BOXED
            else
                KaTypeMappingMode.RETURN_TYPE

            ktType.asPsiType(
                this@SymbolLightAccessorMethod,
                allowErrorTypes = true,
                typeMappingMode,
                containingClass.isAnnotationType,
                suppressWildcards(),
            )
        } ?: nonExistentType()
    }

    override fun getReturnType(): PsiType = _returnedType

    override fun suppressWildcards(): Boolean? =
        withAccessorSymbol { accessorSymbol ->
            accessorSymbol.suppressWildcardMode { parent ->
                parent !is KaPropertySymbol
            }
        }

    override fun isEquivalentTo(another: PsiElement?): Boolean {
        return super.isEquivalentTo(another) || basicIsEquivalentTo(this, another as? PsiField)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SymbolLightAccessorMethod ||
            other.isGetter != isGetter ||
            other.isTopLevel != isTopLevel ||
            other.suppressStatic != suppressStatic ||
            other.ktModule != ktModule
        ) return false

        if (propertyAccessorDeclaration != null || other.propertyAccessorDeclaration != null) {
            return propertyAccessorDeclaration == other.propertyAccessorDeclaration
        }

        if (containingPropertyDeclaration != null || other.containingPropertyDeclaration != null) {
            return containingPropertyDeclaration == other.containingPropertyDeclaration
        }

        return compareSymbolPointers(propertyAccessorSymbolPointer, other.propertyAccessorSymbolPointer)
    }

    override fun hashCode(): Int = propertyAccessorDeclaration?.hashCode() ?: containingPropertyDeclaration.hashCode()

    private val _parametersList by lazyPub {
        val baseParameterPopulator: (LightParameterListBuilder) -> Unit = if (!isGetter) {
            { builder ->
                withAccessorSymbol { accessorSymbol ->
                    val setterParameter = (accessorSymbol as? KaPropertySetterSymbol)?.parameter ?: return@withAccessorSymbol
                    builder.addParameter(
                        SymbolLightSetterParameter(
                            ktAnalysisSession = this,
                            containingPropertySymbolPointer = containingPropertySymbolPointer,
                            parameterSymbol = setterParameter,
                            containingMethod = this@SymbolLightAccessorMethod,
                        )
                    )
                }
            }
        } else {
            { }
        }

        val parameterPopulator: (LightParameterListBuilder) -> Unit = { builder ->
            if (containingClass is SymbolLightClassForInterfaceDefaultImpls) {
                builder.addParameter(SymbolLightParameterForDefaultImplsReceiver(this@SymbolLightAccessorMethod))
            }
            baseParameterPopulator(builder)
        }

        SymbolLightParameterList(
            parent = this@SymbolLightAccessorMethod,
            callableWithReceiverSymbolPointer = containingPropertySymbolPointer,
            parameterPopulator = parameterPopulator,
        )
    }

    override fun getParameterList(): PsiParameterList = _parametersList

    override fun isValid(): Boolean =
        super.isValid() && propertyAccessorDeclaration?.isValid
                ?: containingPropertyDeclaration?.isValid
                ?: propertyAccessorSymbolPointer.isValid(ktModule)

    private val _isOverride: Boolean by lazyPub {
        if (isTopLevel) {
            false
        } else {
            withAccessorSymbol { accessorSymbol ->
                accessorSymbol.isOverride
            }
        }
    }

    override fun isOverride(): Boolean = _isOverride

    private val _defaultValue: PsiAnnotationMemberValue? by lazyPub {
        if (!containingClass.isAnnotationType) return@lazyPub null

        withPropertySymbol { propertySymbol ->
            when (val initializer = propertySymbol.initializer) {
                is KaConstantInitializerValue -> {
                    initializer.constant.createPsiExpression(this@SymbolLightAccessorMethod)
                }
                is KaConstantValueForAnnotation -> {
                    initializer.annotationValue.toLightClassAnnotationValue().toAnnotationMemberValue(this@SymbolLightAccessorMethod)
                }
                is KaNonConstantInitializerValue -> null
                null -> null
            }
        }
    }

    override fun getDefaultValue(): PsiAnnotationMemberValue? = _defaultValue

    override fun getText(): String {
        return lightMemberOrigin?.auxiliaryOriginalElement?.text ?: super.getText()
    }

    override fun getTextOffset(): Int {
        return lightMemberOrigin?.auxiliaryOriginalElement?.textOffset ?: super.getTextOffset()
    }

    override fun getTextRange(): TextRange {
        return lightMemberOrigin?.auxiliaryOriginalElement?.textRange ?: super.getTextRange()
    }
}
