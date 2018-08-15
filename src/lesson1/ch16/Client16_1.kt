package lesson1.ch16

fun main(args: Array<String>) {
    val p0401 = Printable04Impl()

    report04(p0401)

    report04(object : Printable04 {
        override fun print() {
            println("GOGOGO print")
        }

        override fun cancel() {
            println("GOGOGO cancel")
        }
    })
}

fun report04(printable04 : Printable04) {
    printable04.print()
    printable04.cancel()
}

class Printable04Impl : Printable04 {
    // 覆寫print抽象方法
    override fun print() {
        println("Printable04Impl: print")
    }

    // 覆寫cancel抽象方法
    override fun cancel() {
        println("Printable04Impl: cancel")
    }
}
