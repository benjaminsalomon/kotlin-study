package day04.problems01

fun main() {
    val paymentMethod = "CARD"

    val method = when (paymentMethod) {
        "CARD" -> "Processing card payment"
        "PAYPAL" -> "Redirecting to PayPal"
        "CRYPTO" -> "Processing crypto payment"
        else -> "Payment method not supported"
    }

    println(method)
}