//Cup.kt

class Cup {
    var percentFull: Int = 0
}

fun main() {
    val c1 = Cup()
    c1.percentFull = 50
    val c2 = Cup()
    c2.percentFull = 100

    println(c1.percentFull())
    println(c2.percentFull())
}
