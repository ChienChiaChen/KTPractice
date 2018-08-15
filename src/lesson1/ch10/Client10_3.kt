package lesson1.ch10

fun main(args: Array<String>) {

    val item01 = Item01(1, "Hello", "Hello Kotlin!")

    println("Item01(id=${item01.id}, title=${item01.title}, content=${item01.content})")
    // 顯示： Item01(id=1, title=Hello, content=Hello Kotlin!)

    item01.title = "Hello01"
    item01.content = "Hello Kotlin 01!"

    println("Item01(id=${item01.id}, title=${item01.title}, content=${item01.content})")
    // 顯示： Item01(id=1, title=Hello01, content=Hello Kotlin 01!)

    val item0201 = Item02(201)
    println(item0201.getDetails())

    val item0202 = Item02(202, "Hi")
    println(item0202.getDetails())

    val item0203 = Item02(203, "Hi", "Hello")
    println(item0203.getDetails())

    val item0204 = Item03(203)
    println(item0204.getDetails())

}

class Item01 constructor(val id: Long, var title: String, var content: String)

class Item02(val id: Long = 0, var title: String = "", var content: String = "") {
    // 宣告傳回資訊的函式
    fun getDetails() = "Item02(id=$id, title=$title, content=$content)"
}

// 宣告包含id（編號）、title（標題）與content（內容）三個屬性的類別
// 主要建構式的constructor關鍵字可以省略
// 為title與content兩個欄位設定預設值
class Item03(val id: Long = 0, var title: String = "", var content: String = "") {

    // 初始化，可以在這裡檢查與處理屬性值
    init {
        title = if (title.isEmpty()) "Title required" else title
        content = if (content.isEmpty()) "Content required" else content
    }

    // 宣告傳回資訊的函式
    fun getDetails() = "Item02(id=$id, title=$title, content=$content)"
}