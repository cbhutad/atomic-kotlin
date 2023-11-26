//MultipleArgs

class AlienSpecies(val name: String, val eyes: Int, val hands: Int, val legs: Int) {
    fun describe() = "$name with $eyes eyes, $hands hands and $legs legs"
}

fun main() {
    val kelvin = AlienSpecies("zigerion", 2, 2, 2)
    val mortyjr = AlienSpecies("Gazorpian", 2, 6, 2)
    println(kelvin.describe())
    println(mortyjr.describe())
}
