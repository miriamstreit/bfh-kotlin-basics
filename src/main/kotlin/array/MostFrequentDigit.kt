@file:JvmName("MostFrequentDigit")

package array

fun getMostFrequentDigit(digitString: String): Int {
    var mostFrequentFrequency = 0
    var currentMostFrequentValue = 0
    val stringArray = digitString
            .split("")
            .filter { i -> i !== "" }
    for (d in stringArray) {
        if (d != "") {
            val currentCount = stringArray.count { v -> d == v }
            if (currentCount > mostFrequentFrequency) {
                mostFrequentFrequency = currentCount
                currentMostFrequentValue = d.toInt()
            }
            else if (currentCount == mostFrequentFrequency) {
                currentMostFrequentValue = if (d.toInt() < currentMostFrequentValue) d.toInt() else currentMostFrequentValue
            }
        }
    }
    return currentMostFrequentValue
}
