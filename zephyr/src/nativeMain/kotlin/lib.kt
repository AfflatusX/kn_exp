package example

import kotlin.native.Retain

object Object {
  val field = "A"
}

class MyClass(var value: Int) {
  fun printCost() {
    println("value is ${value}")
  }

  fun getMessage(): String {
    return "value is ${value}"
  }
}

fun forIntegers(b: Byte, s: Short, i: UInt, l: Long) { }
fun forFloats(f: Float, d: Double) { }

fun strings(str: String) : String? {
  return "That is '$str' from C"
}


@Retain fun exampleRun() {
  println("this is from kotlin, initializing a class, then print string using template");
  val vec = ArrayList<MyClass>();

  vec.add(MyClass(1));
  vec.add(MyClass(2));
  vec.add(MyClass(3));

  for (v in vec) {
    v.printCost();
  }

  val map = HashMap<String, MyClass>();

  map["a"] = vec[0];
  map["b"] = vec[2];
  map["c"] = vec[1];

  for ((name, value) in map) {
    println("for name: $name, ${value.getMessage()}")
  }

  println("yay! kotlin native works!")
}

val globalString = "A global String"
