// LANGUAGE: +WhenGuards
// DIAGNOSTICS: -SENSELESS_COMPARISON, -USELESS_IS_CHECK, -DUPLICATE_LABEL_IN_WHEN

sealed class NullableBooleanHolder(val value: Boolean?)

fun elvisInGuard(x: Any, y: Boolean?) {
    when (x) {
        is NullableBooleanHolder if <!CONDITION_TYPE_MISMATCH, TYPE_MISMATCH!>y ?: y<!> -> 1
        is NullableBooleanHolder if y ?: y == null -> 1
        is NullableBooleanHolder if x.value ?: when (y) {
            true if true -> true
            else -> false
        } -> 1
        is NullableBooleanHolder if x.value ?: if (y != null) true else false -> 1
        else -> 1
    }
}