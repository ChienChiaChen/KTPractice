package ch2

fun main(args: Array<String>) {
    val x = 3
    val y = 5
    val z: Int

    z = if (x > y) x else y

    println(z)
}