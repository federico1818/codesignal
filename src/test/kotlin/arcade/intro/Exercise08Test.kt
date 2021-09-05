package arcade.intro

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Exercise08Test {
    private val exercise = Exercise08()

    @Test
    fun test01() {
        val matrix = mutableListOf(
            mutableListOf(0, 1, 1, 2),
            mutableListOf(0, 5, 0, 0),
            mutableListOf(2, 0, 3, 3)
        )
        Assertions.assertEquals(9, exercise.matrixElementsSum(matrix))
    }

    @Test
    fun test02() {
        val matrix = mutableListOf(
            mutableListOf(1, 1, 1, 0),
            mutableListOf(0, 5, 0, 1),
            mutableListOf(2, 1, 3, 10)
        )
        Assertions.assertEquals(9, exercise.matrixElementsSum(matrix))
    }

    @Test
    fun test03() {
        val matrix = mutableListOf(
            mutableListOf(1, 1, 1),
            mutableListOf(2, 2, 2),
            mutableListOf(3, 3, 3)
        )
        Assertions.assertEquals(18, exercise.matrixElementsSum(matrix))
    }

    @Test
    fun test04() {
        val matrix = mutableListOf(
            mutableListOf(0)
        )
        Assertions.assertEquals(0, exercise.matrixElementsSum(matrix))
    }

    @Test
    fun test05() {
        val matrix = mutableListOf(
            mutableListOf(1, 0, 3),
            mutableListOf(0, 2, 1),
            mutableListOf(1, 2, 0)
        )
        Assertions.assertEquals(5, exercise.matrixElementsSum(matrix))
    }

    @Test
    fun test06() {
        val matrix = mutableListOf(
            mutableListOf(1),
            mutableListOf(5),
            mutableListOf(0),
            mutableListOf(2)
        )
        Assertions.assertEquals(6, exercise.matrixElementsSum(matrix))
    }

    @Test
    fun test07() {
        val matrix = mutableListOf(
            mutableListOf(1, 2, 3, 4, 5)
        )
        Assertions.assertEquals(15, exercise.matrixElementsSum(matrix))
    }

    @Test
    fun test08() {
        val matrix = mutableListOf(
            mutableListOf(2),
            mutableListOf(5),
            mutableListOf(10)
        )
        Assertions.assertEquals(17, exercise.matrixElementsSum(matrix))
    }

    @Test
    fun test09() {
        val matrix = mutableListOf(
            mutableListOf(4, 0, 1),
            mutableListOf(10, 7, 0),
            mutableListOf(0, 0, 0),
            mutableListOf(9, 1, 2)
        )
        Assertions.assertEquals(15, exercise.matrixElementsSum(matrix))
    }

    @Test
    fun test10() {
        val matrix = mutableListOf(
            mutableListOf(1)
        )
        Assertions.assertEquals(1, exercise.matrixElementsSum(matrix))
    }
}