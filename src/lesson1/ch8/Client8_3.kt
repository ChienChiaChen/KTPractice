package lesson1.ch8

fun main(args: Array<String>) {
    val name: String = "simon"

// 傳回字元編號的範圍運算式
    for (i in name.indices) {
        // 取得指定編號的字元
        print("${name.get(i)}\t")
    }

    println()

// 使用for迴圈依序處理所有字元
    for (c in name) {
        print("$c\t")
    }

    println()

// 第一個與最後一個字元
    println("name.first(): ${name.first()}")
    println("name.last(): ${name.last()}")

// 字元個數
    println("name.length: ${name.length}")
// 最後一個字元的編號
    println("name.lastIndex: ${name.lastIndex}")

    val URL = "http://www.CODEDATA.com.tw"

// 從字串前面往後搜尋，傳回指定內容的位置編號，沒有的話傳回-1
    println("URL.indexOf(\"w\"): ${URL.indexOf("w")}")
// 從字串後面往前搜尋，傳回指定內容的位置編號，沒有的話傳回-1
    println("URL.lastIndexOf(\"w\"): ${URL.lastIndexOf("w")}")

// 傳回指定內容的位置編號，沒有的話傳回-1
    println("URL.indexOf(\"codedata\"): ${URL.indexOf("codedata")}")
// 傳回指定內容的位置編號，沒有的話傳回-1，不分大小寫
    println("URL.indexOf(\"codedata\", 0, true): ${URL.indexOf("codedata", 0, true)}")
}