package lesson2.ch8

fun main(args: Array<String>) {
    var c = C1()
    c.foo()
}

class C1 {
    fun foo() { println("成员函数") } //<--
}

fun C1.foo() { println("扩展函数") }
