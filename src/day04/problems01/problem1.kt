package day04.problems01

fun main() {
    val attempts = 8

    if (attempts < 3) {
        println("Try again")
    } else if (attempts in 3..5) {
        println("Account warning")
    } else {
        println("Account locked")
    }

}