package ch16

class PrintableMethod01 {

    private var p: Printable01? = null

    // 接收一個Printable01型態的參數
    fun set(p: Printable01) {
        this.p = p
    }

    fun process() {
        p!!.print()
    }

}