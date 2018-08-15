package lesson2.ch7

interface MyInterface {
    fun bar()
    fun foo() {
        println("foo")
    }
}

class Child : MyInterface {
    override fun bar() {
    }
}

fun main(args: Array<String>) {
    val c =  Child()
    c.foo()
    c.bar()

}