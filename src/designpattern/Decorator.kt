package designpattern

interface CoffeeMachine {
    fun makeSmallCoffee()
    fun makeLargeCoffee()
}

class NormalCoffeeMachine : CoffeeMachine {
    override fun makeSmallCoffee() = println("Normal: marking small coffee")

    override fun makeLargeCoffee() = println("Normal: marking large coffee")

}

class EnhancedCoffeeMachine(val coffeeMachine: CoffeeMachine) : CoffeeMachine by coffeeMachine {
    override fun makeLargeCoffee() {
        println("Enhanced: making large coffee")
        coffeeMachine.makeLargeCoffee()
    }

    fun makeCoffeeWithMilk() {
        print("Enhance: Making coffee with milk")
        coffeeMachine.makeSmallCoffee()
        println("Enhance: Adding milk")
    }

}

fun main(args: Array<String>) {
    val normalMachine = NormalCoffeeMachine()
    val enhancedCoffeeMachine = EnhancedCoffeeMachine(normalMachine)

    enhancedCoffeeMachine.makeLargeCoffee()
    enhancedCoffeeMachine.makeSmallCoffee()
    enhancedCoffeeMachine.makeCoffeeWithMilk()
}