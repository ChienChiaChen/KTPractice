package lesson2.ch4

fun main(args: Array<String>) {

    val ints = arrayOf(2, 0, 1, 2, 3, 4, 5)
    ints.forEach {
        if (it == 0) return@forEach
        print(it)
    }

    println()

    ints.forEach(fun(value: Int) {
        if (value == 0) return
        print(value)
    })

    println()

    ints.forEach lit@ {
        if (it == 0) return@lit
        print(it)
    }
}