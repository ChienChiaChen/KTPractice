package lesson1.ch12

import lesson1.ch11.ImageItem__
import lesson1.ch11.Item__

fun main(args: Array<String>) {
    val i: Item__ = ImageItem__(12, "A", "X", "IF.jpg")
    val r: Item__? = null

// 編譯錯誤，因為i變數的型態是Item，
//    所以不能指定給ImageItem型態的變數
// val ii: ImageItem = i

// 把i變數轉換型態為ImageItem，就可以指定給ImageItem型態的變數
    val x: ImageItem__ = i as ImageItem__



// 因為變數r是null值，執行以後會發生例外
// val y: RecordItem = r as RecordItem

    val z: RecordItem__? = r as RecordItem__?
    println(z?.getDetails())
// 顯示： null

}