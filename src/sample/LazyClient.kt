package sample

fun main(args: Array<String>) {
    println(lazyValue)
}

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}
