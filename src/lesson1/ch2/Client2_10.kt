package lesson1.ch2

open class Person(var name: String) {
    var gender: Char = 'U'
    val information: String get() = "$name(${if (gender == 'M') "Male" else "Female"})"

    constructor(name: String, gender: Char) : this(name) {
        this.gender = gender
    }

    fun sayGreeting() {
        println("Hello, $name!")
    }

    open fun printInformation() {
        println("Name: $name")
        println("Gender: $gender")
    }
}

fun main(args: Array<String>) {
    val simon: Person = Person("Jason")
    simon.sayGreeting()
    simon.gender = 'M'
    println(simon.information)

    println()

    val mary = Person("Mary", 'F')
    mary.sayGreeting()
    println("${mary.name}'s gender is ${mary.gender}")
}