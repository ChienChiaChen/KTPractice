package designpattern.component

class File(val size: Long, override var childCount: Int = 0) : AbstractFile {
    override fun getChild(i: Int): AbstractFile {
        throw RuntimeException("You shouldn't call the method in File")
    }
    override fun size() = size
}