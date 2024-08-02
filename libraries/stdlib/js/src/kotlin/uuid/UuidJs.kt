/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package kotlin.uuid

@ExperimentalUuidApi
internal actual fun secureRandomUuid(): Uuid {
    val randomBytes = ByteArray(16)
    js("crypto").getRandomValues(randomBytes)
    return uuidFromRandomBytes(randomBytes)
}

@ExperimentalUuidApi
internal actual fun serializedUuid(uuid: Uuid): Any =
    throw UnsupportedOperationException("Serialization is supported only in Kotlin/JVM")