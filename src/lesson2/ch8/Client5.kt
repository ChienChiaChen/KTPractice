package lesson2.ch8

fun Any?.toString(): String {
    if (this == null) return "null"
    // var -> toString
    // 當作是一種檢查
    return toString()
}

fun main(arg: Array<String>) {
    var t = null
    println(t.toString())
}