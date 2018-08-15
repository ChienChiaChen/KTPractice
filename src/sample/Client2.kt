package sample

fun main(args: Array<String>) {
//    val book = Book(1, "英语")
//    val (id, _) = book
//
//    fun_run()
//
//    var callback: ((str: String) -> Unit)? = null
//    callback = { println(it)}
//    callback?.invoke("hello")
//
//
//    //两个参数
//    var callback2: ((name: String, age: Int) -> Unit)? = null
//    callback2 = { hello: String, world: Int -> println("$hello's age is $world") }
//    callback2?.invoke("Tom", 22)
//
//    var callback3: ((num1:Int, num2: Int) -> String)? = null
//    callback3 = { num1, num2 ->
//        var res:Int = num1 + num2
//        res.toString()
//    }
//
//    println(callback3?.invoke(1, 2))
//
//
//    val sum = { x: Int, y: Int -> x + y }

    val nums = listOf(1, 4, 8, 9)

    //  偶数
    println(nums.filter{ it % 2 == 0} )

    val nums1 = listOf(1, 2, 4, 5)
    println(nums1.map { it * it })

    println(alphabet())

}

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabet1(): String {
    val stringBuilder = StringBuilder()

    return with(stringBuilder) {                // 1　在你调用的方法中制定接收器的值
        for (letter in 'A'..'Z') {
            this.append(letter)                 // 2 通过显式的“this”调用接收器值的方法
        }

        append("\nNow I know the alphabet!")   // 3 调用方法，忽略“this”

        this.toString()                        // 4　从lambda中返回值
    }
}

fun alphabet2(): String {
    val stringBuilder = StringBuilder()

    return StringBuilder().apply {                // 1　在你调用的方法中制定接收器的值
        for (letter in 'A'..'Z') {
            this.append(letter)                 // 2 通过显式的“this”调用接收器值的方法
        }

        append("\nNow I know the alphabet!")   // 3 调用方法，忽略“this”

        // 4　从lambda中返回值
    }.toString()
}

fun fun_run() {
    run {
        println("lambda")
    }
    var i: Int = run {
        return@run 1
    }
    println("$i")
    //匿名函数可以通过自定义标签进行跳转和返回
    i = run (outer@{
        return@outer 2
    })
    println(i)
}