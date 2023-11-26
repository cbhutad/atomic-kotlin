//BMIMetric.kt

fun BMIMetric(weight: Double, height: Double): String {
    val bmi = weight / (height * height)
    if (bmi < 18.5)
        return "Underweight"
    else if (bmi < 25)
        return "Normal weight"
    return "Overweight"
}

fun main() {
    val weight: Double = 72.57
    val height: Double = 1.727
    val status = BMIMetric(weight, height)
    println(status)
}
