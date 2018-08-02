package ch7

fun main(args: Array<String>) {
//    val names: Array<String?> = arrayOfNulls<String>(3)

    // 可以省略型態
//    val names = arrayOfNulls<String>(3)
    // 如果要使用型態，就可以省略arrayOfNulls後面的<String>
    val names: Array<String?> = arrayOfNulls(3)

    // 設定元素值，第一個元素的編號是0
    names[0] = "Simon"
    names[1] = "Mary"
    names[2] = "Sam"

    // 使用for迴圈依序處理陣列所有元素
    // 迴圈執行的次數就是元素個數
    // 每執行一次都會把元素值指定給element變數
    for (element in names) {
        println(element)
    }

    println()

    for (i in names.indices) {
        println("[$i]: ${names[i]}")
    }

    println()

    for ((i, v) in names.withIndex()) {
        println("[$i]: $v")
    }

    println()

    val names1 = arrayOf("Simon", "Mary", "Sam")

    for (element in names1) {
        println("Hello!, ${element.toUpperCase()}!")
    }

}