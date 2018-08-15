package designpattern.factory

class ProductA : Product{
    override val name: String = this.javaClass.simpleName
}