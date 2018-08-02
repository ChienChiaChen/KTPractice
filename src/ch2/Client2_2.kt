package ch2

fun getGreeting(greet: String, name: String): String {
    return greet + ", " + name + "!"
}

fun getGreeting_1(greet: String, name: String): String {
    return "$greet, $name!"
}

// 如果函式只有一個回傳的敘述，可以簡化成這樣
fun getGreeting2(greet: String, name: String) =
        greet + ", " + name + "!"

fun getGreeting2_1(greet: String, name: String) = "$greet , $name"

// 沒有回傳值的函式，把回傳值宣告為「Unit」
fun sayGreeting(greet: String, name: String): Unit {
    println(greet + ", " + name + "!")
}

fun sayGreeting_1(greet: String, name: String): Unit {
    println("$greet, $name")
}

// 沒有回傳值的函式，也可以省略「:Unit」
fun sayGreeting2(greet: String, name: String) {
    println(greet + ", " + name + "!")
}

fun sayGreeting2_1(greet: String, name: String) {
    println("$greet, $name")
}

fun main(args: Array<String>) {
    println(getGreeting_1("Hello", "Jason"))
    println(getGreeting2_1("Hello", "Jason"))
    sayGreeting_1("Hello", "Jason")
    sayGreeting2_1("Hello", "Jason")
}