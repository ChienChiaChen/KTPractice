package designpattern.adapter

fun main(args: Array<String>) {
    val adaptee = object :Adaptee{
        override fun ask() {
            println("ask")
        }
    }

    val adapter = Adapter(adaptee)
    adapter.request()
}