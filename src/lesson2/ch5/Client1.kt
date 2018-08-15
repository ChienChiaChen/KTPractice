package lesson2.ch5

fun main(args: Array<String>) {

    var person: Person2 = Person2()
    person.lastName = "Chien"
    println("Person.lastname = ${person.lastName}")

    person.no = 9
    println("Person.no = ${person.no}")

    person.no = 20
    println("Person.no = ${person.no}")


    val person1 = Person1("Chia chen")

    val person3 = Person3("Jason", 27)
    println(person3.name)

    println()

    val runoob =  Runoob("菜鸟教程", 10000)
    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()
}

class Person constructor(firstName: String) {

}

class Person1(firstName: String) {
    init {
        println("FirstName is $firstName")
    }

}

class Person2 {
    var lastName: String = "chien"
        get() = field.toUpperCase()
        set

    var no: Int = 100
        get() = field
        set(value) {
            field = if (value < 10) value else -1
        }

    var heiht: Float = 144f
        private set
}

class Person3(val name: String) {
    constructor(name: String, age: Int) : this(name) {

    }
}


class Runoob constructor(name: String) {
    var url: String = "http://www.runoob.com"
    var country: String = "CN"
    var siteName = name

    init {
        println("初始化网站名: ${name}")
    }

    constructor (name: String, alexa: Int) : this(name) {
        println("Alexa 排名 $alexa")
    }

    fun printTest() {
        println("我是類別的函数")
    }
}

