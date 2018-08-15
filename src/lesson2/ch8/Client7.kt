package lesson2.ch8

class D1 {
    fun bar() {
        println("D bar")
    }
}

class C11 {
    fun baz() {
        println("C baz")
    }

    fun D1.foo() {
        bar()   // 调用 D.bar
        baz()   // 调用 C.baz
    }

    fun caller(d: D1) {
        d.foo()   // 调用扩展函数
    }
}

fun main(args: Array<String>) {
    val c11 = C11()
    c11.caller(D1())
}