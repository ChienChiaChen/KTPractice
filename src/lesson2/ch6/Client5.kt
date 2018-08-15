package lesson2.ch6

interface Foo1 {
    val count: Int
}

class Bar12(override val count: Int) : Foo1

class Bar22 : Foo1 {
    override var count: Int = 0
}