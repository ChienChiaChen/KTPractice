package lesson1.ch18


class GenericClass<T> {
    private var value : T? = null

    fun get() : T? {
        return value
    }

    fun set(value : T?) {
        this.value = value
    }
}