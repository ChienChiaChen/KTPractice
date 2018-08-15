package lesson1.ch4

fun main(args: Array<String>) {
    val x = 3
    val y = 5

    val max = if (x > y) x else y

    // 顯示： x: 3, y: 5, max: 5
    println("x: $x, y: $y, max: $max")
}