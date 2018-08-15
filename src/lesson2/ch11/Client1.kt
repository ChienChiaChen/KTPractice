package lesson2.ch11

enum class Color {
    RED, BLACK, BLUE, GREEN, WHITE
}

enum class Color1(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Shape(value: Int) {
    ovel(100),
    rectangle(200)
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}