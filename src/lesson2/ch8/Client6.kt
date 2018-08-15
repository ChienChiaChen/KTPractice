package lesson2.ch8

class MyClass {
    companion object { }  // 将被称为 "Companion"
}

fun MyClass.Companion.foo() {
    println("伴生物件的擴展函式")
}

val MyClass.Companion.no: Int
    get() = 10

fun main(args: Array<String>) {
    println("no: ${MyClass.no}")
    MyClass.foo()
}