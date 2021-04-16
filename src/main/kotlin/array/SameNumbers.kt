@file:JvmName("SameNumbers")

package array

fun sameNumbers(values1: IntArray, values2: IntArray): Boolean {
    var v1 = true
    var v2 = true
    values1.forEach { v -> if (!values2.contains(v)) v1 = false }
    values2.forEach { v -> if (!values1.contains(v)) v2 = false }
    return v1 && v2
}

