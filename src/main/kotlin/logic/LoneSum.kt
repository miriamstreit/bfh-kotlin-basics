@file:JvmName("LoneSum")
package logic

fun loneSum(values: IntArray): Int {
    var sum = 0
    for(v in values) {
        if(values.count { value -> v == value } == 1) sum += v
    }
    return sum
}
