package lesson1.ch12

import lesson1.ch11.ImageItem__
import lesson1.ch11.Item__


fun main(args: Array<String>) {
    var items: Array<Item__> = arrayOf(
            // 記事資料物件
            Item__(1, "A", "X"),
            Item__(2, "B", "Y"),
            Item__(3, "C", "Z"),
            // 照片記事資料物件
            ImageItem__(11, "IA", "IX", "F1"),
            ImageItem__(12, "IB", "IY", "F2"),
            ImageItem__(13, "IC", "IZ", "F3"),
            // 錄音記事資料物件
            RecordItem__(21, "RA", "RX", "RF1"),
            RecordItem__(22, "RB", "RY", "RF2"),
            RecordItem__(23, "RC", "RZ", "RF3")
    )

//    for (i in items) {
//        println(i.getDetails())
//    }

    for (i in items) {
        showItem(i)
    }

    showItem00(items[1])


}

fun showItem(item:Item__) {
    println("Item: ${item.getDetails()}")
}

fun showItem00(item: Item__) {
    when (item) {
        is Item__ ->
            println("It's item -> ${item.id}")
        is ImageItem__ ->
            println("It's ImageItem -> ${item.id}")
        is RecordItem__ ->
            println("It's RecordItem -> ${item.id}")
    }
    println()
}

class RecordItem__(id: Long, title: String, content: String, var recordFile: String) : Item__(id, title, content) {

    // 使用super關鍵字呼叫父類別的函式
    override fun getDetails() = "${super.getDetails()}, recordFile=$recordFile"
}