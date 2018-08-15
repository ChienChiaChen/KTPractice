package lesson2.ch8

fun main(args: Array<String>) {
    val c: CC = CC()
    val d: DD = DD()
    c.caller(d)
}

class DD {
    fun bar() { println("D bar") }
}

class CC {
    fun bar() { println("C bar") }  // 与 D 类 的 bar 同名

    fun DD.foo() {
        bar()         // 调用 D.bar()，扩展接收者优先
        this@CC.bar()  // 调用 C.bar()
    }

    fun caller(d: DD) {
        d.foo()   // 调用扩展函数
    }
}