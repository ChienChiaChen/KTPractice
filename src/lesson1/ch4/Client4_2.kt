package lesson1.ch4

fun main(args: Array<String>) {
    var v3: Double = 3.14
    var v4 = v3.toInt()
    println(v4)                  // 顯示3，轉換成整數後會捨去小數

    var v5: Int = 321
    var v6: Byte = v5.toByte()
    println(v6)                  // 顯示65，轉換的數值超過Byte範圍

    val gender: Char = 'M'
    val gender2 = 'F'                   // 省略型態

    val genderCode = gender.toInt()     // 從Char轉換為Int
    val gender2Code = gender2.toInt()   // 從Char轉換為Int

    println("gender: $gender, genderCode: $genderCode")
    // 顯示： gender: M, genderCode: 77

    println("gender2: $gender2, gender2Code: $gender2Code")
    // 顯示： gender2: F, gender2Code: 70

    val gender3 = 70.toChar()           // 從Int轉換為Char
    println("gender3: $gender3")
    // 顯示： gender3: F

    val update: Boolean = true
    var isRainy = false


}