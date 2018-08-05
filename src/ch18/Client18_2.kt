package ch18

import ch11.Item

fun main(args: Array<String>) {
    // 建立包裝Item的容器物件
    val ic = ItemContainer(3)

    // 加入Item元素
    ic.add(Item(101, "Hello", "Kotlin"))
    ic.add(Item(102, "Hi", "Android"))
    ic.add(Item(103, "Chao", "Java"))

    for (i in 0..3) {
        println("$i : ${ic.get(i)?.getDetails()}")
    }
}