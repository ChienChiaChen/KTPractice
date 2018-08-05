package designpattern.builder

fun main(args: Array<String>) {
    val car = Car.build {
        model = "John One"
        year = 2017
    }

    println(car)
}