package lesson1.ch15

import lesson1.ch14.Greeting02
import java.time.LocalDate

fun main(args: Array<String>) {
    val greeting0202 = object : Greeting02 {
        override val name = "Mary"

        override fun message(): String {
            return "Hello! $name! ${LocalDate.now()}"
        }
    }
}