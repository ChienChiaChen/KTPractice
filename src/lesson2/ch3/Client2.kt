package lesson2.ch3

// Ref. http://www.runoob.com/kotlin/kotlin-condition-control.html
fun main(args: Array<String>) {
    val x = 1

    when (x) {
        1 -> println("X==1")
        2 -> println("X==2")
        else -> {
            println("x is not 1,2")
        }
    }

    when (x) {
        1, 2 -> println("X==1 or X==2")
        else -> {
            println("none of the above")
        }
    }
    //============================
    println(hasPrefix("pre"))
    //============================

    val items = setOf("apple", "banana", "kiwi")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    //============================
}

//================================
fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}
//================================