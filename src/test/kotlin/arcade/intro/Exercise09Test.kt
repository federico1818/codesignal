package arcade.intro

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Exercise09Test {
    private val exercise = Exercise09()

    @Test
    fun test01() {
        Assertions.assertEquals(listOf("aba", "vcd", "aba"), exercise.allLongestStrings(mutableListOf("aba", "aa", "ad", "vcd", "aba")))
    }

    @Test
    fun test02() {
        Assertions.assertEquals(listOf("aa"), exercise.allLongestStrings(mutableListOf("aa")))
    }

    @Test
    fun test03() {
        Assertions.assertEquals(listOf("eeee", "abcd"), exercise.allLongestStrings(mutableListOf("abc", "eeee", "abcd", "dcd")))
    }

    @Test
    fun test04() {
        Assertions.assertEquals(listOf("zzzzzz", "abcdef", "aaaaaa"), exercise.allLongestStrings(mutableListOf("a", "abc", "cbd", "zzzzzz", "a", "abcdef", "asasa", "aaaaaa")))
    }

    @Test
    fun test05() {
        Assertions.assertEquals(listOf("varennyky"), exercise.allLongestStrings(mutableListOf("enyky", "benyky", "yely", "varennyky")))
    }

    @Test
    fun test06() {
        Assertions.assertEquals(listOf("abacaba"), exercise.allLongestStrings(mutableListOf("abacaba", "abacab", "abac", "xxxxxx")))
    }

    @Test
    fun test07() {
        Assertions.assertEquals(listOf("yooooooung", "watermelon"), exercise.allLongestStrings(mutableListOf("young", "yooooooung", "hot", "or", "not", "come", "on", "fire", "water", "watermelon")))
    }

    @Test
    fun test08() {
        Assertions.assertEquals(listOf("aokbcwthc"), exercise.allLongestStrings(mutableListOf("onsfnib", "aokbcwthc", "jrfcw")))
    }

    @Test
    fun test09() {
        Assertions.assertEquals(listOf("lbgwyqkry"), exercise.allLongestStrings(mutableListOf("lbgwyqkry")))
    }

    @Test
    fun test10() {
        Assertions.assertEquals(listOf("i"), exercise.allLongestStrings(mutableListOf("i")))
    }
}