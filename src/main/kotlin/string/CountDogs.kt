@file:JvmName("CountDogs")
package string

fun countDogs(input:String): Int {
    val dogRegex : Regex = "d[aeiou]g".toRegex()
    val res = dogRegex.findAll(input, 0)
    return res.count()
}
