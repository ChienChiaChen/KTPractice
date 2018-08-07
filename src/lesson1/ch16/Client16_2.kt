package lesson1.ch16

fun main(args: Array<String>) {
    val printable01 = Printable01Impl()
    report01(printable01)

    val printable02 = object:Printable01{
        override fun print() {
            println("printable 02")
        }
    }

    report01(printable02)

    // 如果需要實作的Java介面是functional interface
    // 就可以使用Lambda實作
//    val p0103 = Printable01 {
//        println("Lambda Printable01 implementation.")
//    }
}

// 宣告一個接收Printable01物件參數的函式
fun report01(printable : Printable01) {
    printable.print()
}

// 宣告實作Printable01介面的類別
class Printable01Impl : Printable01 {
    // 覆寫Printable01介面的print抽象函式
    override fun print() {
        println("Printable01Impl implementation.")
    }
}