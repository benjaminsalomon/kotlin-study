package day04.problems01

fun main() {
    val age = 12

    if (age < 13) {
        println("Kids content")
    } else if (age in 13..17) {
        println("Teen content")
    } else {
        println("Adult content")
    }

}