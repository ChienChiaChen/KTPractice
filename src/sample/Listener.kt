package sample

import kotlin.properties.Delegates

interface TextChangedListener {
    fun onTextChanged(newText: String)
}

class PrintingTextCHangedListener : TextChangedListener {
    override fun onTextChanged(newText: String) = println("Text is changed to: $newText")
}

class TextView {
    var listener: TextChangedListener? = null
    var text:String by Delegates.observable("") {
        property, oldValue, newValue ->  listener?.onTextChanged(newValue)
    }
}

fun main(args: Array<String>) {

    val textView = TextView()
    textView.listener = PrintingTextCHangedListener()
    textView.text = "Text1"
    textView.text = "Text2"
}

