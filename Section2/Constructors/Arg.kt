//Arg.kt

class Alien(name: String) {
    val greeting: String = "Poor $name!"
}

fun main() {
    val alien = Alien("Mr. Meeseeks")
    //val alien2 = Alien()
    println(alien.greeting)
}
