package ch14

fun main(args: Array<String>) {
    val greeting02 = Greeting02Impl()
    greeting02.displayGreeting()
    println()
    greeting02.displayName()
}

interface Greeting02 {
    // 宣告抽象屬性變數
    val name : String

    // 宣告一般屬性變數
    val upperName : String
        get() = name.toUpperCase()

    // 宣告抽象函式
    fun message(): String

    // 宣告一般函式
    fun displayName() {
        println("Name: $name")
    }

    // 宣告一般函式
    fun displayGreeting() {
        println("Hello, $upperName")
    }
}

class Greeting02Impl : Greeting02 {

    // 覆寫Greeting02介面的name抽象屬性
    override val name = "Jason"

    // 覆寫Greeting02介面的message抽象函式
    override fun message(): String {
        return "Hello! $name!"
    }

}
