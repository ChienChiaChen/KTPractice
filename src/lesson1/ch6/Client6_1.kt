package lesson1.ch6

fun main(args: Array<String>) {
    val ages: IntArray = IntArray(3)

// 設定元素值，第一個元素的編號是0
    ages[0] = 35
    ages[1] = 12
    ages[2] = 27

    for (n in ages) {
        println(n)
    }

    println()

    for (n in ages.indices) {
        println(n)
    }

    println()

    for ((i, v) in ages.withIndex()) {
        println("[$i]: $v")
    }
}