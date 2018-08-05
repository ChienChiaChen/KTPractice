package designpattern.factory

fun main(args: Array<String>) {
    val factoryA = FactoryA()
    val productA = factoryA.makeProduct()
    println(productA.name)
}