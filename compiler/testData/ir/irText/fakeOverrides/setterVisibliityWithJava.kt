// SKIP_KT_DUMP
// TARGET_BACKEND: JVM
// DUMP_EXTERNAL_CLASS: JavaChild

// SEPARATE_SIGNATURE_DUMP_FOR_K2
// REASON: KT-70036 Fir2IR Lazy IR does not contain parameter name for fake setter of e

// FILE: JavaChild.java

public class JavaChild extends KotlinBase {
    private int field;
    public int getE() { return field }
    /* package-private */ void setE(int value) { field = value; }
}

// FILE: 1.kt

open class KotlinBase {
    var a: Int = 1
    var b: Int = 2
        protected set
    var c: Int = 3
        private set
    var d: Int = 4
        internal set
    open var e: Int = 5
}

class IndirectChild : JavaChild()
