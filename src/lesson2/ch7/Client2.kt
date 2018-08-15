package lesson2.ch7

fun main(args: Array<String>) {
    val c =  Child1()
    c.foo()
    c.bar()
    println(c.name)
}

interface MyInterface1 {
    var name:String //name 属性, 抽象的
    fun bar()
    fun foo() {
        // 可选的方法体
        println("foo")
    }
}
class Child1 : MyInterface1 {
    override var name: String = "runoob"
    override fun bar() {
        println("bar")
    }
}