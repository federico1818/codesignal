package arcade.intro

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Exercise07Test {
    private val exercise = Exercise07()

    @Test
    fun test01() {
        Assertions.assertEquals(false, exercise.almostIncreasingSequence(arrayListOf(1, 3, 2, 1)))
    }

    @Test
    fun test02() {
        Assertions.assertEquals(true, exercise.almostIncreasingSequence(arrayListOf(1, 3, 2)))
    }

    @Test
    fun test03() {
        Assertions.assertEquals(false, exercise.almostIncreasingSequence(arrayListOf(1, 2, 1, 2)))
    }

    @Test
    fun test04() {
        Assertions.assertEquals(false, exercise.almostIncreasingSequence(arrayListOf(3, 6, 5, 8, 10, 20, 15)))
    }

    @Test
    fun test05() {
        Assertions.assertEquals(false, exercise.almostIncreasingSequence(arrayListOf(1, 1, 2, 3, 4, 4)))
    }

    @Test
    fun test06() {
        Assertions.assertEquals(false, exercise.almostIncreasingSequence(arrayListOf(1, 4, 10, 4, 2)))
    }

    @Test
    fun test07() {
        Assertions.assertEquals(true, exercise.almostIncreasingSequence(arrayListOf(10, 1, 2, 3, 4, 5)))
    }

    @Test
    fun test08() {
        Assertions.assertEquals(false, exercise.almostIncreasingSequence(arrayListOf(1, 1, 1, 2, 3)))
    }

    @Test
    fun test09() {
        Assertions.assertEquals(true, exercise.almostIncreasingSequence(arrayListOf(0, -2, 5, 6)))
    }

    @Test
    fun test10() {
        Assertions.assertEquals(false, exercise.almostIncreasingSequence(arrayListOf(1, 2, 3, 4, 5, 3, 5, 6)))
    }

    @Test
    fun test11() {
        Assertions.assertEquals(false, exercise.almostIncreasingSequence(arrayListOf(40, 50, 60, 10, 20, 30)))
    }

    @Test
    fun test12() {
        Assertions.assertEquals(true, exercise.almostIncreasingSequence(arrayListOf(1, 1)))
    }

    @Test
    fun test13() {
        Assertions.assertEquals(true, exercise.almostIncreasingSequence(arrayListOf(1, 2, 5, 3, 5)))
    }

    @Test
    fun test14() {
        Assertions.assertEquals(false, exercise.almostIncreasingSequence(arrayListOf(1, 2, 5, 5, 5)))
    }

    @Test
    fun test15() {
        Assertions.assertEquals(false, exercise.almostIncreasingSequence(arrayListOf(10, 1, 2, 3, 4, 5, 6, 1)))
    }

    @Test
    fun test16() {
        Assertions.assertEquals(true, exercise.almostIncreasingSequence(arrayListOf(1, 2, 3, 4, 3, 6)))
    }

    @Test
    fun test17() {
        Assertions.assertEquals(true, exercise.almostIncreasingSequence(arrayListOf(1, 2, 3, 4, 99, 5, 6)))
    }

    @Test
    fun test18() {
        Assertions.assertEquals(true, exercise.almostIncreasingSequence(arrayListOf(123, -17, -5, 1, 2, 3, 12, 43, 45)))
    }

    @Test
    fun test19() {
        Assertions.assertEquals(true, exercise.almostIncreasingSequence(arrayListOf(3, 5, 67, 98, 3)))
    }
}