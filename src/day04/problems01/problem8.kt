package day04.problems01

fun main() {
    val amount = 100.4
    val isInternational = true

    if (amount < 1000) {
        if (isInternational) {
            println("Amount fee is ${amount * 0.02}")
        } else {
            println("Amount fee is ${amount * 0.01}")
        }
    } else {
        if (isInternational) {
            println("Amount fee is ${amount * 0.02}")
        } else {
            println("Amount fee is ${amount * 0.01}")
        }
    }
}