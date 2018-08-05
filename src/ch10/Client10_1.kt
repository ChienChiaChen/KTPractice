package ch10

fun hello(): Unit {
    println("hello")
}

fun hello1() {
    println("hello1")
}
fun hello2():String {
    return "hello2"
}

fun hello3(): String = "hello3"

fun hello4() = "hello4"

fun hello5(name: String): String {
    return "name : ${name}"
}

fun hello6(name: String, age: Int, married: Boolean) {
    println("Name: $name, Age: $age, Married: ${if (married) "Yes" else "No"}")
}

// 接收兩個整數參數，傳回比較大的數字
fun max(x: Int, y: Int) = if (x > y) x else y

// 接收兩個小數參數，傳回比較大的數字
fun max(x: Double, y: Double) = if (x > y) x else y


fun isMarried(married: Boolean) {
    println("Married: ${if (married) "Yes" else "No"}")
}

fun main(args: Array<String>) {
    hello()

    hello1()

    println(hello2())

    var hello2 = hello2()

    println(hello2)

    println(hello3())

    println(hello4())

    println(hello5("jason"))

    hello6("jason", 30, false)

    println("max(3, 5) = ${max(3, 5)}")

    println("max(3.2, 5.6) = ${max(3.2, 5.6)}")

    isMarried(true)

    isMarried(married = false)

    println(averageOverload(1,6))
}

fun averageOverload(a: Int, b: Int) = (a + b) / 2

fun averageOverload(a: Int, b: Int, c: Int) = (a + b + c) / 3

fun averageOverload(a: Int, b: Int, c: Int, d: Int) = (a + b + c + d) / 4
