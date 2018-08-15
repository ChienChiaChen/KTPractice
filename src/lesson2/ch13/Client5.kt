package lesson2.ch13

class Site(val map: Map<String, Any?>) {
    val name: String by map
    val url: String  by map
}

fun main(args: Array<String>) {
    // 构造函数接受一个映射参数
    val site = Site(mapOf(
            "name" to "菜鸟教程",
            "url"  to "www.runoob.com"
    ))

    // 读取映射值
    println(site.name)
    println(site.url)


}