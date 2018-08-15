package lesson1.ch2

class Employee(name: String) : Person(name) {

    var salary: Double = 0.0

    constructor(name: String, gender: Char, salary: Double): this(name) {
        // 設定繼承自父類別的屬性值
        super.gender = gender
        // 設定屬性值
        this.salary = salary
    }

    override fun printInformation() {
        // 呼叫父類別的函式
        super.printInformation()
        println("Salary: $salary")
    }

}
fun main(args: Array<String>) {
    // 呼叫其它建構式建立Employee物件
    val simon = Employee("Jason", 'M', 25000.0)
    // 呼叫函式
    simon.printInformation()
}
