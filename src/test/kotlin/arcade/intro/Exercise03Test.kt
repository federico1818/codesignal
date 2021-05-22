package arcade.intro

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Exercise03Test {
    private val exercise = Exercise03()

    @Test
    fun test01() {
        assertTrue(exercise.checkPalindrome("aabaa"))
    }

    @Test
    fun test02() {
        assertFalse(exercise.checkPalindrome("abac"))
    }

    @Test
    fun test03() {
        assertTrue(exercise.checkPalindrome("a"))
    }

    @Test
    fun test04() {
        assertFalse(exercise.checkPalindrome("az"))
    }

    @Test
    fun test05() {
        assertTrue(exercise.checkPalindrome("abacaba"))
    }

    @Test
    fun test06() {
        assertTrue(exercise.checkPalindrome("z"))
    }

    @Test
    fun test07() {
        assertFalse(exercise.checkPalindrome("aaabaaaa"))
    }

    @Test
    fun test08() {
        assertFalse(exercise.checkPalindrome("zzzazzazz"))
    }

    @Test
    fun test09() {
        assertTrue(exercise.checkPalindrome("hlbeeykoqqqqokyeeblh"))
    }

    @Test
    fun test10() {
        assertTrue(exercise.checkPalindrome("hlbeeykoqqqokyeeblh"))
    }
}