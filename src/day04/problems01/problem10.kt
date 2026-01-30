package day04.problems01

fun main() {
    val plan = "FREE"
    val isTrial = true

    val subscriptionPlan = when (plan) {
        "FREE"  -> "Limited access"
        "BASIC" -> when { isTrial -> "Basic trial" else -> "Basic plan" }
        "PRO" -> when { isTrial -> "Pro trial" else -> "Pro plan"}
        else -> "Invalid subscription"
    }

    println(subscriptionPlan)

}