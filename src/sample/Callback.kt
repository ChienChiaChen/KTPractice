package sample

fun main(args: Array<String>) {


    var bean = MyBean()
    bean.testCallback { m -> println(m) }

    val result = bean.testcallback2(1, 2, { v1, v2 -> v1 + v2 })
    println(result)

}

class MyBean {
    fun testCallback(callback: (String) -> Unit) {
        callback.invoke("這是callback 內容")
    }

    fun testcallback2(value1: Int, value2: Int, callback: (Int, Int) -> Int): Int {
        var result = callback.invoke(value1, value2)
        return result * 3
    }
}