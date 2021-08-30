package arcade.intro

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Exercise05Test {
    private val exercise = Exercise05()

    @Test
    fun test01() {
        Assertions.assertEquals(5, exercise.shapeArea(2))
    }

    @Test
    fun test02() {
        Assertions.assertEquals(13, exercise.shapeArea(3))
    }

    @Test
    fun test03() {
        Assertions.assertEquals(1, exercise.shapeArea(1))
    }

    @Test
    fun test04() {
        Assertions.assertEquals(41, exercise.shapeArea(5))
    }

    @Test
    fun test05() {
        Assertions.assertEquals(97986001, exercise.shapeArea(7000))
    }

    @Test
    fun test06() {
        Assertions.assertEquals(127984001, exercise.shapeArea(8000))
    }

    @Test
    fun test07() {
        Assertions.assertEquals(199940005, exercise.shapeArea(9999))
    }

    @Test
    fun test08() {
        Assertions.assertEquals(199900013, exercise.shapeArea(9998))
    }

    @Test
    fun test09() {
        Assertions.assertEquals(161946005, exercise.shapeArea(8999))
    }

    @Test
    fun test10() {
        Assertions.assertEquals(19801, exercise.shapeArea(100))
    }

}