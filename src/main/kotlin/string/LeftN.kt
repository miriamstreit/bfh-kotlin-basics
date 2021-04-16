@file:JvmName("LeftN")
package string

public fun leftN(str: String, n: Int): String {
    var newString = str
    for (i in str.indices) {
        if (i < n) {
            newString += newString[0]
            newString = newString.removeRange(0,1)
        }
    }
    return newString
}

