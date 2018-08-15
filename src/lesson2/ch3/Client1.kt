package lesson2.ch3

fun main(args: Array<String>) {
    val a = 1
    val b: Int
    b = 3

    val max = if (a > b) a else b
    println(max)

    val max1 = if (a > b) {
        println("a")
        a
    } else {
        println("b")
        b
    }

    println(max1)
    //==========================================

    val x = 5
    val y = 9

    if (x in 1..9) {
        println("x in the range")
    }
    //==========================================
}