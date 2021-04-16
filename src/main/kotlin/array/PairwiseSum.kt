@file:JvmName("PairwiseSum")

package array

fun pairwiseSum(values: IntArray): IntArray {
    var sumList = mutableListOf<Int>()
    for (v in values.indices ) {
        if (v < values.size-1) sumList.add(values[v] + values[v+1])
    }
    return sumList.toIntArray()
}

