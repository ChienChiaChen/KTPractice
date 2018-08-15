package lesson1.ch17

class Outer {

    private val number = 3

    // 宣告匿名類別
    val anony = object : Any() {

        val number = 5

        override fun toString() : String {
            // 匿名類別宣告的number
            println(number)
            // 匿名類別可以使用Outer類別的屬性與函式
            // Outer宣告的number
            println(this@Outer.number)

            return "Anonymous.number: $number, Outer.number: ${this@Outer.number}"
        }
    }

}

fun main(args: Array<String>) {
    val outer = Outer()
    println(outer.anony)
}