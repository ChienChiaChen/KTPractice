package lesson1.ch3

fun summary(vararg nums: Int): Int {
    var total: Int = 0

    for (n in nums) {
        total += n
    }

    return total
}

fun average(vararg nums: Int): Int {
    var total: Int = 0

    for (n in nums) {
        total += n
    }

    return total / nums.size
}