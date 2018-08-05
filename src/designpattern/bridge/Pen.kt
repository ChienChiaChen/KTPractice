package designpattern.bridge

interface Pen {
    val colorImpl: Color    // this is bridge
    fun write()
}