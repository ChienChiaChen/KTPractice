package lesson2.ch8

fun main(args: Array<String>) {
//    AC().caller(AD())   // 输出 "D.foo in C"
//    AC().caller(AD1())  // 输出 "D.foo in C" —— 扩展接收者静态解析
    AC1().caller(AD())  // 输出 "D.foo in C1" —— 分发接收者虚拟解析

}

open class AD {
}

class AD1 : AD() {
}

open class AC {
    open fun AD.foo() {
        println("D.foo in C")// <-
    }

    open fun AD1.foo() {
        println("D1.foo in C")
    }

    fun caller(d: AD) {
        d.foo()   // 调用扩展函数
    }
}

class AC1 : AC() {
    override fun AD.foo() {
        println("D.foo in C1")
    }

    override fun AD1.foo() {
        println("D1.foo in C1")
    }
}