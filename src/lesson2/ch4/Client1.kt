package lesson2.ch4

fun main(args: Array<String>) {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    println("----while 使用-----")
    var x = 5

    while (x > 0) {
        println(x--)
    }

    println("----do...while 使用-----")
    var y = 5
    do {
        println(y--)
    } while (y > 0)

    println()
    for (i in 1..10) {
        if (i == 3) continue  // i 为 3 时跳过当前循环，继续下一次循环
        println(i)
        if (i > 5) break   // i 为 6 时 跳出循环
    }
}