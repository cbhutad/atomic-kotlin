//Open2.kt

fun isOpen2(hour: Int) {
    val open: Int = 9
    val closed: Int = 20
    println("Operating hours : $open - $closed")
    val status = hour >= open && hour <= closed
    println("Open : $status")
}

fun main() = isOpen2(6)
