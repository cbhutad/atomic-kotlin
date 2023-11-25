//TrueOrFalse.kt

fun trueOrFalse(exp: Boolean): String {
    if(exp)
        return "It's true"
    return "It's false"
}

fun main() {
    val b: Int = 1
    println(trueOrFalse(b < 1))
    println(trueOrFalse(b > -1))
}