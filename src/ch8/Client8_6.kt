package ch8

fun main(args: Array<String>) {

    val name: String = "simon"
    val name2: String = "jason"

// 重複字串內容指定的次數
    println("name.repeat(3): ${name.repeat(3)}")

// 如果字串的字元個數小於指定的數字，在前面補上空白
    println("name2.padStart(5): [${name2.padStart(10)}]")
// 如果字串的字元個數小於指定的數字，在前面補上指定的字元
    println("name2.padStart(5, '-'): [${name2.padStart(10, '-')}]")
// 如果字串的字元個數小於指定的數字，在後面補上空白
    println("name2.padEnd(5): [${name2.padEnd(10)}]")
// 如果字串的字元個數小於指定的數字，在後面補上指定的字元
    println("name2.padEnd(5, '-'): [${name2.padEnd(10, '-')}]")

    val URL = "http://www.CODEDATA.com.tw"

// 移除字串前面指定的內容
    println("URL.removePrefix(\"http://\"): ${URL.removePrefix("http://")}")
// 移除指定範圍的字元
    println("URL.removeRange(0..6): ${URL.removeRange(0..6)}")




}