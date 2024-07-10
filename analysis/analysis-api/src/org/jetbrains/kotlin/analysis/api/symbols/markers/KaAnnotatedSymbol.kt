/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.symbols.markers

import org.jetbrains.kotlin.analysis.api.annotations.KaAnnotated
import org.jetbrains.kotlin.analysis.api.symbols.KaSymbol

public interface KaAnnotatedSymbol : KaSymbol, KaAnnotated

@Deprecated("Use 'KaAnnotatedSymbol' instead", ReplaceWith("KaAnnotatedSymbol"))
public typealias KtAnnotatedSymbol = KaAnnotatedSymbol