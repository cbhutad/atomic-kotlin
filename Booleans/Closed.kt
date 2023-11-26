//closed.kt

fun isClosed(hour: Int) {
    val open: Int = 9
    val closed: Int = 20
    println("Operating hours : $open - $closed")
    val status = hour < open || hour > closed
    println("Closed - $status")
}

fun main() = isClosed(6)
