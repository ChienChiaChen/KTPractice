package designpattern

//https://github.com/dbacinski/Design-Patterns-In-Kotlin/blob/master/src/main/kotlin/FactoryMethod.kt
interface Currency {
    val code: String
}

class Euro(override val code: String = "EUR") : Currency

class USDollar(override val code: String = "USD") : Currency

enum class Country {
    US, Spain, UK, Greece
}

class CurrencyFactory {
    fun currencyForCountry(country: Country): Currency? {
        return when (country) {
            Country.Spain, Country.Greece -> Euro()
            Country.US -> USDollar()
            else -> null
        }
    }
}

fun main(args: Array<String>) {
    val noCurrencyCode = "No Currency Code Available"
    val greeceCode = CurrencyFactory().currencyForCountry(Country.Greece)?.code ?: noCurrencyCode
    println("Greece currency: $greeceCode")

    val usCode = CurrencyFactory().currencyForCountry(Country.US)?.code ?: noCurrencyCode
    println("Us currency: $usCode")
}