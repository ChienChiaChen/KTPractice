import ch11.ImageItem__
import ch11.Item__

class RecordItem__(id: Long, title: String, content: String, var recordFile: String) : Item__(id, title, content) {

    // 使用super關鍵字呼叫父類別的函式
    override fun getDetails() = "${super.getDetails()}, recordFile=$recordFile"
}

fun main(args: Array<String>) {
    val item: Item__ = Item__(1, "Hello", "Hello Kotlin!")
    val imageItem: ImageItem__ = ImageItem__(2, "Greeting", "Good morning", "kotlin.jpg")
    val recordItem: RecordItem__ = RecordItem__(3, "Shopping", "Out of milk", "notify.mp3")

    // 宣告的型態是「Item」，建立的物件是「ImageItem」
    val imageItem___: Item__ = ImageItem__(2, "Greeting", "Good morning", "kotlin.jpg")
    // 宣告的型態是「Item」，建立的物件是「RecordItem」
    val recordItem__: RecordItem__ = RecordItem__(3, "Shopping", "Out of milk", "notify.mp3")

    println("${imageItem___.id}")

}