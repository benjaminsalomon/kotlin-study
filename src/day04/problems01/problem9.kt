package day04.problems01

fun main() {
    val status = "DELIVERED"
    val isPaid = false

    val result = when {
        status == "CREATED" && !isPaid -> "Awaiting payment"
        status == "CREATED" && isPaid -> "Processing"
        status == "SHIPPED" -> "On the way"
        status == "DELIVERED" -> "Completed"
        else -> "Unknown order state"
    }
    println(result)
}