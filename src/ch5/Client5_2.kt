package ch5

fun main(args: Array<String>) {
    outer@ for (x in 1..5) {
        for (y in 1..5) {
            println("X:$x - Y:$y")

            if (y == 3) {
                break@outer
            }
        }
    }

}