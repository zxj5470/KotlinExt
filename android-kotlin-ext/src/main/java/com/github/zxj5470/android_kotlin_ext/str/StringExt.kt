package com.github.zxj5470.android_kotlin_ext.str

import java.util.*

/**
 * count source string appeared times in source string
 * @param regex String : the string to match source string
 * @return List<Int>: a list of all match indices
 */
fun String.indicesOf(regex: String): List<Int> {
    val ll = LinkedList<Int>()
    var temp = -1
    var b: Int
    this.forEachIndexed { index, _ ->
        b = this.indexOf(regex, index)
        if (b > temp) {
            temp = b
            ll.add(temp)
        }
    }
    return ll.toList()
}

/**
 * count source string appeared times in source string
 * @param regex String : the string to match source string
 * @return Int: count how many times appeared.
 * @author :zxj5470
 */
fun String.countTimes(regex: String): Int {
    var count = 0
    var temp = -1
    var b: Int
    this.forEachIndexed { index, _ ->
        b = this.indexOf(regex, index)
        if (b > temp) {
            temp = b
            count++
        }
    }
    return count
}