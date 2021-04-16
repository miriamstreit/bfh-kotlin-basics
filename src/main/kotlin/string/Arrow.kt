@file:JvmName("Arrow")

package string

import kotlin.math.abs

fun arrow(length: Int, doubleEnded: Boolean, doubleLine: Boolean): String {
    var arrowBody : String = ""
    var arrowHeadLeft : String = ""
    var arrowHeadRight : String = ""

    for (x in 0 until abs(length)) {
        arrowBody += if (doubleLine) "=" else "-"
    }

    if (length < 0) {
        arrowHeadLeft = if (doubleEnded) "<<" else "<";
    } else if (length > 0) {
        arrowHeadRight = if (doubleEnded) ">>" else ">";
    }

    return arrowHeadLeft + arrowBody + arrowHeadRight;
}
