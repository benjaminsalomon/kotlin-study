package day04.problems01

fun main() {
    val score = 0

    val result = when (score) {
        in 90..100 -> "Excellent"
        in 75..89 -> "Good"
        in 60..74 -> "Average"
        else -> "Needs Improvement"
    }

    println(result)
}