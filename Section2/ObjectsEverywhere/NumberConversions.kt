//NumberConversions.kt

fun fraction(num: Long, den: Long) = num.toDouble() / den


fun main() {
    val num1: Int = 1
    val num2: Int = 2
    val f = fraction(num1.toLong(), num2.toLong())
    println(f)
}
