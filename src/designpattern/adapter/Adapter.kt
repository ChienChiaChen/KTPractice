package designpattern.adapter

class Adapter(val wrapper: Adaptee) : Target {
    override fun request() {
        wrapper.ask()
    }
}