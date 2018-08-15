package lesson2.ch6

fun main(args: Array<String>) {
    val bar = Bar1()
    println(bar.x)
}

open class Foo {
    open val x: Int = 3
}

class Bar1 : Foo() {
    override val x: Int = 1
}