package lesson2.ch12

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

//我们就可以直接通过外部类访问到对象的内部元素
fun main(args: Array<String>) {
    val instance = MyClass.create()   // 访问到对象的内部元素
}