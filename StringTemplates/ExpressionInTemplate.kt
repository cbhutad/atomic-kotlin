//ExpressionInTemplate.kt

fun main() {
    val condition: Boolean = true
    println("${if (condition) 'a' else 'b'}")
    val x: Int = 11
    println("$x + 4 = ${x + 4}")
}