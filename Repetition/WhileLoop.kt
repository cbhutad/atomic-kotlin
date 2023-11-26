//WhileLoop.kt

fun condition(i: Int) = i < 100

fun main() {
    var i: Int = 0
    while(condition(i)) {
        print(".")
        i += 10
    }
}
