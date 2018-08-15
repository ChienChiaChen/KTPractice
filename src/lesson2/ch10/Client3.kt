package lesson2.ch10

class Runoob<out A>(val a: A) {
    fun foo(): A {
        return a
    }
}

class Runoob1<in A>(a: A) {
    fun foo(a: A) {
    }
}


fun main(args: Array<String>) {
//    消费者 in, 生产者 out
    var strCo: Runoob<String> = Runoob("a")
    var anyCo: Runoob<Any> = Runoob<Any>("b")
    anyCo = strCo
    println(anyCo.foo())   // 输出 a

    var strDCo = Runoob1("a")
    var anyDCo = Runoob1<Any>("b")
    strDCo = anyDCo
}