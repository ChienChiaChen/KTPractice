package ch10

fun main(args: Array<String>) {

    val item05 = Item05(5, "Nice day")
    println(item05.getDetails())

    item05.title = ""
    println("title=${item05.title}")
    // 顯示： title=Nice day

    item05.content = ""
    println("content=${item05.content}")
    // 顯示： content=Empty

    //
    item05.content = "Nice day"
    println("content=${item05.content}")
    // 顯示： content=Nice day
}


class Item05(val id: Long, _title: String, _content: String = "") {

    var title = _title
            // 宣告屬性的setter函式
        set(value: String) {
            if (value.isNotEmpty()) {
                // 使用field關鍵字取代屬性名稱title
                field = value
            }
        }

    var content = _content
            // 宣告屬性的getter函式
        get() {
            // 使用field關鍵字取代屬性名稱content
            return if (field.isEmpty()) "Empty" else field
        }

    fun getDetails() = "Item05(id=$id, title=$title, content=$content)"
}