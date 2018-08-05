package designpattern.bridge

fun main(args: Array<String>) {
    val redColor = RedColor()

    val smallPen = SmallPen(redColor)

    smallPen.write()
}