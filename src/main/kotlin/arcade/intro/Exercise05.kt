package arcade.intro

import kotlin.math.pow

/* Below we will define an n-interesting polygon.
*  Your task is to find the area of a polygon for a given n.
* */
class Exercise05 {
    fun shapeArea(n: Int): Int {
        return  Math.pow(n.toDouble(), 2.0).toInt() +
                Math.pow(n - 1.toDouble(), 2.0).toInt()
    }
}