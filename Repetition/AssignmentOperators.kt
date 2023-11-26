//AssignmentOperators.kt

fun main() {
    var n: Int = 10
    val d: Int = 3
    print(n)
    while(n > d) {
        n -= d
        print(" - $d")
    }
    println(" = $n")

    var m: Int = 10
    print(m)
    m %= d
    println(" % $d = $m")
}
