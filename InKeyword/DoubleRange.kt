//DoubleRange.kt

fun inDoubleRange(n: Double) {
    val r = 1.0..10.0
    println("$n in $r? ${n in r}")
}

fun main() {
    inDoubleRange(0.99999)
    inDoubleRange(5.0)
    inDoubleRange(10.0)
    inDoubleRange(10.00001)
}
