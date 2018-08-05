package designpattern.abstractfactory

class SeriesBFactory(override val context: Context) : AbstractFactory {
    override fun makeTextView() = SeriesBTextView(context)
    override fun makeButton() = SeriesBButton(context)
}