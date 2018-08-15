package designpattern.bridge

class RedColor : Color {
    override fun coloring() {
        println(this.javaClass.simpleName)
    }
}