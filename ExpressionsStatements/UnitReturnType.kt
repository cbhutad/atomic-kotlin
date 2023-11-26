//UnitReturnType.kt

fun unitFun() = Unit

fun main() {
    println(unitFun())
    val u1: Unit = println(42)
    println(u1)
    val u2: Unit = println(0)
    println(u2)
}
