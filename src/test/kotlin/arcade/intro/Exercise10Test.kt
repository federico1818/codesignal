package arcade.intro

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Exercise10Test {
    private val exercise = Exercise10()

    @Test
    fun test01() {
        Assertions.assertEquals(3, exercise.commonCharacterCount("aabcc", "adcaa"))
    }

    @Test
    fun test02() {
        Assertions.assertEquals(4, exercise.commonCharacterCount("zzzz", "zzzzzzz"))
    }

    @Test
    fun test03() {
        Assertions.assertEquals(3, exercise.commonCharacterCount("abca", "xyzbac"))
    }

    @Test
    fun test04() {
        Assertions.assertEquals(0, exercise.commonCharacterCount("a", "b"))
    }

    @Test
    fun test05() {
        Assertions.assertEquals(1, exercise.commonCharacterCount("a", "aaa"))
    }
}