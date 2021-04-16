@file:JvmName("LeapYear")

package logic

fun leapYear(year: Int): Boolean {
    if (year % 4 != 0) return false
    if (year % 100 == 0) {
        return year % 400 == 0
    }
    return true
}
