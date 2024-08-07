inline fun foo(l: () -> Unit) { l() }
inline fun bar(l: () -> Unit) { l() }

// CHECK_BREAKS_COUNT: function=box count=1
// CHECK_LABELS_COUNT: function=box name=$l$block count=1
fun box(): String {
    foo {
        bar {
            return@foo;
        }
        return "Failed: labeled return was not added"
    }
    return "OK"
}