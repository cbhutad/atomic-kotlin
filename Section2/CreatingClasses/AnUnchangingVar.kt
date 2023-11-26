//AnUnchangingVar.kt

class Sofa {
    val cover: String = "Loveseat cover"
}

fun main() {
    var sofa = Sofa()
    println(sofa)
    sofa = Sofa()
    println(sofa)
}
