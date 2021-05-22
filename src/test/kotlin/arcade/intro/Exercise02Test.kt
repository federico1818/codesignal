package arcade.intro

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Exercise02Test {
    private val exercise = Exercise02()

    @Test
    fun test01() {
        assertEquals(20, this.exercise.centuryFromYear(1905))
    }

    @Test
    fun test02() {
        assertEquals(17, this.exercise.centuryFromYear(1700))
    }

    @Test
    fun test03() {
        assertEquals(20, this.exercise.centuryFromYear(1988))
    }

    @Test
    fun test04() {
        assertEquals(20, this.exercise.centuryFromYear(2000))
    }

    @Test
    fun test05() {
        assertEquals(21, this.exercise.centuryFromYear(2001))
    }

    @Test
    fun test06() {
        assertEquals(2, this.exercise.centuryFromYear(200))
    }

    @Test
    fun test07() {
        assertEquals(4, this.exercise.centuryFromYear(374))
    }

    @Test
    fun test08() {
        assertEquals(1, this.exercise.centuryFromYear(45))
    }

    @Test
    fun test09() {
        assertEquals(1, this.exercise.centuryFromYear(8))
    }

    @Test
    fun test10() {
        assertEquals(3, this.exercise.centuryFromYear(300))
    }

    @Test
    fun test11() {
        assertEquals(16, this.exercise.centuryFromYear(1588))
    }

    @Test
    fun test12() {
        assertEquals(1, this.exercise.centuryFromYear(1))
    }
}