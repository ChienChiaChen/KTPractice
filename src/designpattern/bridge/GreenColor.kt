package designpattern.bridge

class GreenColor : Color {
    override fun coloring() {
        println(this.javaClass.simpleName)
    }
}