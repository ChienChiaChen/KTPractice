package lesson1.ch8

fun main(args: Array<String>) {


    val name: String = "simon"

// 把第一個字元轉換為大寫
    println("name.capitalize(): ${name.capitalize()}")
// 把第一個字元轉換為小寫
    println("name.decapitalize(): ${name.decapitalize()}")

    val URL = "http://www.CODEDATA.com.tw"

// 轉換為小寫
    println("URL.toLowerCase(): ${URL.toLowerCase()}")
// 轉換為大寫
    println("URL.toUpperCase(): ${URL.toUpperCase()}")


}