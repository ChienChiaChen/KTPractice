package lesson1.ch2

fun main(args: Array<String>) {
    val ia: IntArray = intArrayOf(3, 4, 5)

    var total: Int = 0

    for (n in ia) {
        total += n
    }

    print("total: $total")
}