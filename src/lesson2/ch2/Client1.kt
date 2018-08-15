package lesson2.ch2

fun main(args: Array<String>) {

    val a: Int = 10000
    println(a === a)

    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    println(boxedA === anotherBoxedA)// Address is different
    println(boxedA == anotherBoxedA)
}