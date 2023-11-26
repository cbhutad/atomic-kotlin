//IndexIntoString.kt

fun main() {
    val s: String = "abc"
    for(i in 0..s.lastIndex) {
        print(s[i] + 1)
    }
}
