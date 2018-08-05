package designpattern.bridge

class SmallPen(override val colorImpl: Color) : Pen {
    override fun write() {
        colorImpl.coloring()
        println(this.javaClass.simpleName)
    }
}