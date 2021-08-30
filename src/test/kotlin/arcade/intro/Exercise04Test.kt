package arcade.intro

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Exercise04Test {

    private val exercise = Exercise04()

    @Test
    fun test01() {
        Assertions.assertEquals(21, exercise.adjacentElementsProduct(arrayListOf(3, 6, -2, -5, 7, 3)))
    }

    @Test
    fun test02() {
        Assertions.assertEquals(2, exercise.adjacentElementsProduct(arrayListOf(-1, -2)))
    }

    @Test
    fun test03() {
        Assertions.assertEquals(6, exercise.adjacentElementsProduct(arrayListOf(5, 1, 2, 3, 1, 4)))
    }

    @Test
    fun test04() {
        Assertions.assertEquals(6, exercise.adjacentElementsProduct(arrayListOf(1, 2, 3, 0)))
    }

    @Test
    fun test05() {
        Assertions.assertEquals(50, exercise.adjacentElementsProduct(arrayListOf(9, 5, 10, 2, 24, -1, -48)))
    }

    @Test
    fun test06() {
        Assertions.assertEquals(30, exercise.adjacentElementsProduct(arrayListOf(5, 6, -4, 2, 3, 2, -23)))
    }

    @Test
    fun test07() {
        Assertions.assertEquals(6, exercise.adjacentElementsProduct(arrayListOf(4, 1, 2, 3, 1, 5)))
    }

    @Test
    fun test08() {
        Assertions.assertEquals(-12, exercise.adjacentElementsProduct(arrayListOf(-23, 4, -3, 8, -12)))
    }

    @Test
    fun test09() {
        Assertions.assertEquals(0, exercise.adjacentElementsProduct(arrayListOf(1, 0, 1, 0, 1000)))
    }
}