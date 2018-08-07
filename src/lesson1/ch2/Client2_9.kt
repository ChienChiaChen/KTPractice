package lesson1.ch2

fun main(args: Array<String>) {
    val ia: IntArray = intArrayOf(120, 30, 15, 27, 66)

    ia.filter { it > 50 }         // 留下大於50的元素
            .sortedBy { it }            // 依照大小排序
            .map { it / 10 }            // 元素值除以10
            .forEach { print("$it-") }
}