package lesson2.ch6

fun main(args: Array<String>) {
    val s = Student1()
    s.study()
}

open class Person1 {
    open fun study() {
        println("person1".capitalize())
    }
}

class Student1 : Person1() {
    override fun study() {
        println("student1".capitalize())
    }
}