//SumUsingRange.kt

fun main() {
    val range: IntProgression = 10 until 101 //10..100
    var sum: Int = 0
    for(i in range) {
        sum += i
    }
    println("Sum : $sum")
}
