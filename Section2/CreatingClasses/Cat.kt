//Cat.kt

class Cat {
    fun meow(): String {
        println(this)
        return "mrrow!"
    }
}

fun main() {
    val cat = Cat()
    println(cat)
    val m1: String = cat.meow()
    println(m1)
}
