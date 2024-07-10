// IGNORE_BACKEND_K1: JS_IR

// FILE: A.kt
class A {
    companion object {
        private const val privateConstVal = "OK"
    }
    internal inline fun internalInlineMethod() = privateConstVal
}

// FILE: main.kt
fun box(): String {
    return A().internalInlineMethod()
}