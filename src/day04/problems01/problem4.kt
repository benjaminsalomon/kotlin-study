package day04.problems01

fun main() {
    val weight = 4.5

    if (weight < 1) {
        println("$5")
    } else if (weight in 1.0..5.0) {
        println("$10")
    } else if (weight in 5.0..10.0) {
        println("$20")
    } else {
        println("Not supported")
    }

}