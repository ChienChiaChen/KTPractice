package ch10

fun main(args: Array<String>) {
    val items = arrayOf(Item02(2001), Item02(2002), Item02(2003))

    for (item in items) {
        // 顯示Item02物件資訊
        println(item.getDetails())
    }

    println()

    for (item in items) {
        // 設定每一個元素Item02物件的title與content屬性
        item.title = "Hi"
        item.content = "Hello"
    }

    for (item in items) {
        println(item.getDetails())
    }

    println()
    val item0301 = Item09(301, "Hello", "Hello Kotlin!")
    println(item0301.getDetails())
    // 顯示： Item03(id=301, title=Hello, content=Hello Kotlin!)

    val item0302 = Item09(302)
    println(item0302.getDetails())
    // 顯示： Item03(id=302, title=, content=)

    val item08 = Item08(4, "Greeting", "Good morning")
    item08.title = "titleeee"
    println(item08.getDetails())
}

class Item08(_id: Long, _title: String, _content: String) {
    // 宣告類別的屬性，並設定為建構式的參數
    val id = _id
    var title = _title
    var content = _content

    fun getDetails() = "Item08(id=$id, title=$title, content=$content)"
}

class Item09(val id: Long, var title: String, var content: String) {

    // 宣告次要建構式
    // 使用this呼叫主要建構式
    constructor(id: Long) : this(id, "", "")

    fun getDetails() = "Item09(id=$id, title=$title, content=$content)"
}