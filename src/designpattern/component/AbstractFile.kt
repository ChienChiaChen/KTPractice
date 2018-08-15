package designpattern.component

interface AbstractFile {    // Component
    var childCount: Int
    fun getChild(i: Int): AbstractFile
    fun size(): Long
}
