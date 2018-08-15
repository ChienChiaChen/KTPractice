package lesson2.ch8

fun main(args: Array<String>) {
    printFoo(D())// <-- C

    // 扩展函数是静态解析的，并不是接收者类型的虚拟成员
}

open class C

class D: C()

fun C.foo() = "c"   // 扩展函数 foo

fun D.foo() = "d"   // 扩展函数 foo

fun printFoo(c: C) {
    println(c.foo())  // 类型是 C 类
}