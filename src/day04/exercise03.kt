package day04

fun main() {
    val dayNumber = 3

    val day = when (dayNumber) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Day $dayNumber is not recognized"
    }

    println("Day $dayNumber: $day")
}