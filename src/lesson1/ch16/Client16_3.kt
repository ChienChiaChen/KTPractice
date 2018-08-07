package lesson1.ch16

fun main(args: Array<String>) {
    val pm = PrintableMethod01()

    // 如果Java方法接收functional interface型態的參數
    // 就可以使用這樣的Lambda實作
//    pm.set { println("Lambda Printable01 implementation.") }
    pm.set(object:Printable01{
        override fun print() {
            println("Oh ~ No")
        }
    })
    pm.process()
}