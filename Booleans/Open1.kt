//Open1.kt

fun isOpen1(hour: Int) {
    val open: Int = 9
    val closed: Int = 20
    println("Operating hours : $open - $closed")
    var status: String = ""
    if (hour >= open && hour <= closed)
        status = "true"
    else
        status = "false"
    println("Open : $status")
}

fun main() {
    isOpen1(6)
}

/*
 * fun main = isOpen1(6)
 *
 *
 */
