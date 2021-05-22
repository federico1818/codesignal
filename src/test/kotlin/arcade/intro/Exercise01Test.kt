package arcade.intro

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class Exercise01Test {
    private val exercise = Exercise01()

    @Test
    fun test01() {
        assertEquals(3, this.exercise.add(1, 2))
    }

    @Test
    fun test02() {
        assertEquals(1000, this.exercise.add(0, 1000))
    }

    @Test
    fun test03() {
        assertEquals(-37, this.exercise.add(2, -39))
    }

    @Test
    fun test04() {
        assertEquals(199, this.exercise.add(99, 100))
    }

    @Test
    fun test05() {
        assertEquals(0, this.exercise.add(-100, 100))
    }

    @Test
    fun test06() {
        assertEquals(-2000, this.exercise.add(-1000, -1000))
    }

    @Test
    fun test07() {
        assertEquals(-1, this.exercise.add(-1000, 999))
    }

    @Test
    fun test08() {
        assertEquals(200, this.exercise.add(100, 100))
    }

    @Test
    fun test09() {
        assertEquals(-200, this.exercise.add(-100, -100))
    }

    @Test
    fun test10() {
        assertEquals(-97, this.exercise.add(-98, 1))
    }

    @Test
    fun test11() {
        assertEquals(2000, this.exercise.add(1000, 1000))
    }

    @Test
    fun test12() {
        assertEquals(0, this.exercise.add(-1000, 1000))
    }
}