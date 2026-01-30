package day04.problems01

fun main() {
    val lightColor = "YELLOW"

    when (lightColor) {
        "RED" -> println("Stop")
        "YELLOW" -> println("Prepare to stop")
        "GREEN" -> println("Go")
        else -> println("Invalid signal")
    }
}