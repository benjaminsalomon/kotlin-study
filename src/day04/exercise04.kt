package day04

fun main() {
    val userRole = "admin"
    val isLoggedIn = false

    if (isLoggedIn) {
        when (userRole) {
            "user" -> println("Welcome back $userRole")
            "admin" -> println("Hi dear $userRole")
        }
    } else {
        println("Please log in")
    }
}