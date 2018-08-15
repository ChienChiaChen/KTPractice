package lesson1.ch9

fun main(args: Array<String>) {
    var name: String = "jason"
    println(name.toUpperCase())
    println(name.isBlank())
    println(name.isEmpty())

    var name1: String? = "Jasssson"
    name1 = null

    var name2: String? = "Mary"
    println(name?.length)
    println(name2?.length)

    // 在變數名稱後面加入兩個驚嘆號（!!）
    name2 = null
//    println(name2!!.length)

    println("name.isNullOrBlank(): ${name2.isNullOrBlank()}")
    println("name.isNullOrEmpty(): ${name2.isNullOrEmpty()}")
    println(name2?.length ?: 0)
    println(name2?.length ?: 0)

    // 變數與元素都不可以指定null值
    var names3: Array<String> = arrayOf("One", "Two", "Three")
    // 變數不可以指定null值，但是元素可以
    var names4: Array<String?> = arrayOf("One", "Two", "Three")
    // 變數與元素都可以指定null值
    var names5: Array<String?>? = arrayOf("One", "Two", "Three")

    // 變數與元素都不可以指定null值
    var names = arrayOf("Simon", "Mary", "Sam")

    // 編譯錯誤，變數不可以指定null值
    // names = null

    // 編譯錯誤，元素不可以指定null值
    // names[0] = null

    val names2 = arrayOf<String?>("Simon", "Mary", "Sam")
    // 元素可以指定null值
    names2[0] = null
}