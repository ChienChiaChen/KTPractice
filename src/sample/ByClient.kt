package sample

import kotlin.properties.Delegates

// Ref http://www.apkfuns.com/kotlin-by-guan-jian-zi-jie-shao/
//====================
interface Base {
    fun show()
}

open class BaseImpl : Base {
    override fun show() {
        println("BaseImpl::show()")
    }
}

class BaseProxy(base: Base) : Base by base

//====================

class LazySample {
    val lazy: String by lazy {
        println("init!")
        "my lazy"
    }
}
//=====================

class User2 {
    var name: String by Delegates.observable("oldName") {
        kProperty, old, new ->
        println("${kProperty.returnType}, $old -> $new")
    }

    // 默认值不受 vetoable 影响
    var address: String by Delegates.vetoable("wan", {
        kProperty, oldValue, newValue ->
        println("oldValue：$oldValue | newValue：$newValue")
        newValue.contains("wang")
    })
}


//========================
fun main(args: Array<String>) {
//    val base = BaseImpl()
//    BaseProxy(base).show()

//    val sample = LazySample()
//    println("lazy = ${sample.lazy}")
//    println("lazy = ${sample.lazy}")
//    println("lazy = ${sample.lazy}")

    val user = User2()
    println(user.name)
    user.name = "Carl"

    user.address = "abcd"
    println(user.address)
}