package lesson2.ch9

data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)
    println(jack)
    println(olderJack)

    val (name, age) = jack
    println("name = $name, age = $age")
}