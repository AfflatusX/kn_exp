// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_STDLIB
// DONT_TARGET_EXACT_BACKEND: JVM
// LANGUAGE: +RangeUntilOperator
@file:OptIn(ExperimentalStdlibApi::class)
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 1u..<5u
    for (i in uintProgression step 1) {
        uintList += i
    }
    assertEquals(listOf(1u, 2u, 3u, 4u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 1uL..<5uL
    for (i in ulongProgression step 1L) {
        ulongList += i
    }
    assertEquals(listOf(1uL, 2uL, 3uL, 4uL), ulongList)

    return "OK"
}