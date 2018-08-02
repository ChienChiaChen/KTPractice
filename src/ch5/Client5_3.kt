package ch5

fun main(args: Array<String>) {
    outer@ for (x in 1..5) {
        for (y in 1..5) {
            if (y > 3) {
                continue@outer
            }

            print(y)
        }

        println("=>X:$x")
    }

}