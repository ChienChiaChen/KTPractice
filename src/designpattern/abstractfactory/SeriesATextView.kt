package designpattern.abstractfactory

class SeriesATextView(context: Context) : TextView(context) {
    override val name = this.javaClass.simpleName
}
