package lesson2.ch13

import kotlin.properties.Delegates

class Foo {
    var notNullBar: String by Delegates.notNull<String>()
}

fun main(args: Array<String>) {
    val foo = Foo()
    foo.notNullBar = "bar"
    println(foo.notNullBar)
    
}
