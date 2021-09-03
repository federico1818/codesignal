package arcade.intro

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Exercise06Test {
    private val exercise = Exercise06()

    @Test
    fun test01() {
        Assertions.assertEquals(3, exercise.makeArrayConsecutive2(arrayListOf(6, 2, 3, 8)))
    }

    @Test
    fun test02() {
        Assertions.assertEquals(2, exercise.makeArrayConsecutive2(arrayListOf(0, 3)))
    }

    @Test
    fun test03() {
        Assertions.assertEquals(0, exercise.makeArrayConsecutive2(arrayListOf(5, 4, 6)))
    }

    @Test
    fun test04() {
        Assertions.assertEquals(2, exercise.makeArrayConsecutive2(arrayListOf(6, 3)))
    }

    @Test
    fun test05() {
        Assertions.assertEquals(0, exercise.makeArrayConsecutive2(arrayListOf(1)))
    }
}