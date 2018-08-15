package sample

class User_(val map: MutableMap<String, Any?>){
    val name: String by map
    val age: Int by map
}


fun main(args: Array<String>) {
//    val user1 = User_(mapOf("name" to "Jason", "age" to 25))
    val user1 = User_(mutableMapOf("name" to "Jason", "age" to 25))
    println(user1.name)
    println(user1.age)
}