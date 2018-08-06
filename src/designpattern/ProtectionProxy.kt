package designpattern

interface File {
    fun read(name: String)
}

class NormalFile : File {
    override fun read(name: String) = println("Reading file: $name")
}

class SecuredFile : File {
    val normalFile = NormalFile()
    var pwd: String = ""

    override fun read(name: String) {
        if ("secret" == pwd) {
            println("Pwd is correct: $pwd")
            normalFile.read(name)
        } else {
            println("Incorrect password. Access denied!!")
        }
    }
}

fun main(args: Array<String>) {
    val securedFile = SecuredFile()
    securedFile.read("readme.md")

    securedFile.pwd = "secret"
    securedFile.read("readme.md")
}