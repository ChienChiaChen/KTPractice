package ch14

import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val greeting0301 = Greeting03Impl()

    println(greeting0301.greet("Jason"))
    println(greeting0301.getGreeting())

    val greeting__ = object : Greeting01_  {
        override fun greet(name : String): String {
            return "Hello! $name! ${LocalDate.now()}"
        }
    }

    sayHello_(object : Greeting01_ {
        override fun greet(name : String): String {
            return "Hello! $name! ${LocalDateTime.now()}"
        }
    })

    sayHello_(greeting__)
}

fun sayHello_(greeting : Greeting01_) {
    println(greeting.greet("Jason"))
}

interface Greeting03_ : Greeting01_ {
    // 宣告沒有實作的抽象函式
    fun getGreeting() : String
}

interface Greeting01_ {
    // 宣告沒有實作的抽象函式
    fun greet(name: String): String
}

class Greeting03Impl :Greeting03_ {
    override fun getGreeting() = "Hello Jason"
    override fun greet(name: String) = "HI! $name"
}