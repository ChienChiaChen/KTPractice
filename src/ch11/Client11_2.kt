package ch11

open class Item__(val id: Long, var title: String, var content: String) {
    fun getReduceContent(length: Int = 5) = "${content.substring(0 until length)}..."

    open fun getDetails() = "id = $id, title = $title, content = $content"
}
class ImageItem__(id: Long, title: String, content: String, var imageFile: String): Item__(id, title, content) {

    override fun getDetails() = "${super.getDetails()}, imageFile = $imageFile"
}


fun main(args: Array<String>) {
    val i = Item__(1, "Hello", "Hello Kotlin!")
    println("id=${i.id}, title=${i.title}, content=${i.content}")

    val i02 = ImageItem__(2, "Hi", "Hello", "kotlin.jpg")


    println("id = ${i02.id}, title = ${i02.title}, content = ${i02.content}, imageFile = ${i02.imageFile}")

    println(i.getReduceContent())

    val i03 = ImageItem__(2, "Hi", "Good morning", "kotlin.jpg")
    // 顯示呼叫函式傳回的項目資訊，這是ImageItem自己寫的函式
    println(i03.getDetails())
    // 顯示四個字的簡短記事內容，這是繼承自父類別Item的函式
    println(i03.getReduceContent(4))
}