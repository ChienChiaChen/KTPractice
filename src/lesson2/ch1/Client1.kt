package lesson2.ch1

import java.lang.Integer.parseInt

fun sum(a: Int, b: Int) = a + b
fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println(a + b)
}

fun vars(vararg v: Int) {
    for (i in v) {
        print("\t$i")
    }
}

fun main(args: Array<String>) {
    //================================

    vars(1, 2, 3, 4, 5)
    //================================

    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(sumLambda(1, 2))  // 输出 3
    //================================

    val a: Int = 1
    val b = 1
    val c: Int
    c = 1
    //================================

    var aa = 1
    val s1 = "a is $aa"

    aa = 2

    val s2 = "${s1.replace("is", "was")}, but now is $aa"
    println(s2)
    //================================

    var age: String? = "23"
    val ages = age!!.toInt()
    val ages1 = age?.toInt()
    val ages2 = age?.toInt() ?: -1
    println(age)
    println(ages)
    println(ages1)
    println(ages2)

    //================================

    val vv = arrayOf("1","2")
    if (vv.size < 2) {
        print("Two integers expected")
        return
    }
    val x = parseInt(vv[0])
    val y = parseInt(vv[1])
    // 直接使用 `x * y` 会导致错误, 因为它们可能为 null.
    if (x != null && y != null) {
        print(x * y)
    }


}