package lesson1.ch3

fun main(args: Array<String>) {
    // 呼叫在其它套件的函式，必須在函式名稱前面加上套件名稱
    val t = summary(3, 5, 7)
    println("Total: $t")

    val a = average(3, 5, 7)
    println("Average: $a")
}