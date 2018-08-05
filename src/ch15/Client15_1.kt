package ch15

import ch14.Greeting02
import java.time.LocalDate

fun main(args: Array<String>) {
    val greeting0202 = object : Greeting02 {
        override val name = "Mary"

        override fun message(): String {
            return "Hello! $name! ${LocalDate.now()}"
        }
    }
}