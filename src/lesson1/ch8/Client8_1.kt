package lesson1.ch8

fun main(args: Array<String>) {
    var greeting = "hello"
    greeting = "hi"

    val greeting2 = "Hello"

    val literal: String = """
    for (c in name) {
        print(c)
    }
"""

    println(literal)

    val literal2: String = """
    |for (c in name) {
    |    print(c)
    |}
""".trimMargin()

    println(literal2)

    val literal3:String = """
    #for (c in name) {
    #    print(c)
    #}
""".trimMargin("#")

    println(literal3)


}