package lesson2.ch10

fun main(args: Array<String>) {
//    val box: Box<Int> = Box<Int>(1)
//    val box1 = Box(1)


    var boxInt = Box(10)
    var boxString = Box<String>("Runoob")

    println(boxInt.value)
    println(boxString.value)
}

class Box<T>(t: T) {
    var value = t
}