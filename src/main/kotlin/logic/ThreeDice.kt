@file:JvmName("ThreeDice")
package logic

fun getNbrOfCombinations(sum: Int): Int {
    val diceValues = 1..6

    var nrOfCombos = 0
    for (red in diceValues) {
        for (green in diceValues) {
            for (blue in diceValues) {
                if (sum == red + green + blue) {
                    nrOfCombos += 1
                }
            }
        }
    }
    return nrOfCombos
}
