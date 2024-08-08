// FILE: a.kt
class Foo {
    private fun o() = "O"
    private fun k() = "K"

    internal inline fun internalInlineFun(oo: String = o(), kk: () -> String = { k() }) = oo + kk()
}

// FILE: main.kt
fun box(): String {
    return Foo().internalInlineFun()
}
