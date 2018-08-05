package designpattern.abstractfactory

open class TextView(context: Context) {
    open val name = this.javaClass.simpleName
}