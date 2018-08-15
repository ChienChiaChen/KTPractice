package lesson1.ch11

fun main(args: Array<String>) {
    val i = Item(1, "Hello", "Hello Kotlin!")

    println("id = ${i.id}, title = ${i.title}, content = ${i.content}")

    val i02 = ImageItem(2, "Hi", "Hello", "kotlin.jpg")

    println("id=${i02.id}, title=${i02.title}, content=${i02.content}, imageFile =${i02.imageFile}")
}

class Item (val id: Long, var title: String, var content: String) {
    fun getDetails() = "id = $id, title = $title, content = $content"
}

class ImageItem(val id: Long, var title: String, var content: String, var imageFile: String)