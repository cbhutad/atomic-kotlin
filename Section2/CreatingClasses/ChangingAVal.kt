//ChangingAVal.kt

class House {
    var sofa: String = ""
}

fun main() {
    val house = House()
    house.sofa = "Simple sleeper sofa"
    println(house.sofa)
    house.sofa = "New Leather Sofa"
    println(house.sofa)
}
