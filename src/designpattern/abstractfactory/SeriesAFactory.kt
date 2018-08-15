package designpattern.abstractfactory

class SeriesAFactory(override val context: Context) : AbstractFactory {
    override fun makeTextView() = SeriesATextView(context)
    override fun makeButton() = SeriesAButton(context)
}
