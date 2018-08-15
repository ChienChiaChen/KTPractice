package lesson1.ch14

fun main(args: Array<String>) {

    // 建立實作Greeting01介面的物件
    val greeting01 = Greeting01Impl()

    // 呼叫函式並傳送Greeting01物件
    sayHello(greeting01)
    // 顯示： Hello! Simon!

}

interface Greeting01 {
    // 宣告沒有實作的抽象函式
    fun greet(name: String): String
}

class Greeting01Impl : Greeting01 {
    // 使用override關鍵字
    // 覆寫Greeting01介面的greet抽象函式
    // 函式的宣告必須和介面的抽象函式一樣
    override fun greet(name : String): String {
        return "Hello! $name!"
    }
}

fun sayHello(greeting : Greeting01) {
    println(greeting.greet("Jason"))
}