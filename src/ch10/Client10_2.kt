package ch10

fun main(args: Array<String>) {
    println(average(1, 2, 3, 4, 4, 5, 5))
}

fun average(vararg ns: Int): Int {
    var total = 0

    // 使用迴圈處理陣列的所有元素（合計）
    for (n in ns) {
        total += n
    }

    // 傳回平均值
    return total / ns.size
}