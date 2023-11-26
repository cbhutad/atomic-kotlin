//DoWhileLoop.kt

fun condition(i: Int) = i < 100

fun main() {
    var i: Int = 0
    do {
        print(".")
        i += 10
    } while(condition(i))
}
