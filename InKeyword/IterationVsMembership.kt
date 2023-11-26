//IterationVsMembership.kt

fun main() {
    val values: IntProgression = 1..3
    for(v in values) {
        println("Iteration $v")
    }
    val v: Int = 2
    if(v in values)
        println("$v is a member of $values")
}
