package ch17

import java.util.*

class SubVisibility : Visibility(1) {
    fun demo() {
        println("defaultPublicProperty: $defaultPublicProperty")
        println("explicitPublicProperty: $explicitPublicProperty")
        println("internalProperty: $internalProperty")

        // 可以使用Visibility定義為protected的屬性與函式
        println("protectedProperty: $protectedProperty")

        // 編譯錯誤，不可以使用private屬性
        // println("privateProperty: $privateProperty")
    }
}

class PrivateConstructor private constructor() {
    companion object {
        fun game() = if (Random().nextInt(100) > 50) "Win" else "Lose"
    }
}

fun main(args: Array<String>) {

    println(defaultPublicFunction())
    println(explicitPublicFunction())
    println(internalFunction())

    val v = Visibility(3)

    println("defaultPublicProperty: ${v.defaultPublicProperty}")
    println("explicitPublicProperty: ${v.explicitPublicProperty}")
    println("internalProperty: ${v.internalProperty}")
    println(PrivateConstructor.game())

}