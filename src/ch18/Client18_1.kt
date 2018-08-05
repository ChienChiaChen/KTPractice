package ch18

fun main(args: Array<String>) {

    // 建立包裝字串的容器物件
    val sc = StringContainer(3)

    // 加入字串元素
    sc.add("Simon")
    sc.add("Mary")
    sc.add("John")

    for (i in 0..2) {
        println("$i : ${sc.get(i)}")
    }
}