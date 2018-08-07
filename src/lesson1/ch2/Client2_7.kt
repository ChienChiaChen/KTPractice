package lesson1.ch2

fun main(args: Array<String>) {

    for (index: Int in 1..5) {
        print(index)
    }

    println()

    // 顯示： 135
    for (index: Int in 1..5 step 2) {
        print(index)
    }

    println()

    for (index: Int in 5 downTo 1) {
        print(index)
    }
}