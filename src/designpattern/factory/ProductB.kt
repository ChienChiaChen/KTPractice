package designpattern.factory

class ProductB : Product {
    override val name: String = this.javaClass.simpleName
}