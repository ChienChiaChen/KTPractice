package designpattern.abstractfactory

interface AbstractFactory {
    val context: Context?
    fun makeTextView(): TextView
    fun makeButton(): Button
}