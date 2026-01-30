package day04.problems01

fun main() {
    val statusCode = 202

    val statusCodeResult = when (statusCode) {
        200 -> "OK"
        201 -> "Created"
        400 -> "Bad Request"
        401 -> "Unauthorized"
        403 -> "NotFound"
        500 -> "Server Error"
        else -> "Unknown Status"
    }

    println(statusCodeResult)
}