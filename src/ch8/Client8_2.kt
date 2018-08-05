package ch8

fun main(args: Array<String>) {

    val name: String = "simon"
    val name2 = "SIMON"

// 判斷兩個字串是否一樣
    println("name.equals(name2): ${name.equals(name2)}")
// 判斷兩個字串是否一樣，不分大小寫
    println("name.equals(name2): ${name.equals(name2, true)}")
//
    val URL = "http://www.CODEDATA.com.tw"

// 判斷字串前面是否為指定的內容
    println("URL.startsWith(\"http\"): ${URL.startsWith("http")}")
// 判斷字串後面是否為指定的內容
    println("URL.endsWith(\"tw\"): ${URL.endsWith("tw")}")

// 判斷字串內容是否為空白
    println("URL.isBlank(): ${URL.isBlank()}")
    println("URL.isNotBlank(): ${URL.isNotBlank()}")
// 判斷是否沒有字元
    println("URL.isEmpty(): ${URL.isEmpty()}")
    println("URL.isNotEmpty(): ${URL.isNotEmpty()}")

}