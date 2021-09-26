package arcade.intro

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Exercise11Test {
    private val exercise = Exercise11()

    @Test
    fun test01() {
        Assertions.assertEquals(true, this.exercise.isLucky(1230))
    }

    @Test
    fun test02() {
        Assertions.assertEquals(false, this.exercise.isLucky(239017))
    }

    @Test
    fun test03() {
        Assertions.assertEquals(true, this.exercise.isLucky(134008))
    }

    @Test
    fun test04() {
        Assertions.assertEquals(false, this.exercise.isLucky(10))
    }

    @Test
    fun test05() {
        Assertions.assertEquals(true, this.exercise.isLucky(11))
    }

    @Test
    fun test06() {
        Assertions.assertEquals(true, this.exercise.isLucky(1010))
    }

    @Test
    fun test07() {
        Assertions.assertEquals(false, this.exercise.isLucky(261534))
    }

    @Test
    fun test08() {
        Assertions.assertEquals(false, this.exercise.isLucky(100000))
    }

    @Test
    fun test09() {
        Assertions.assertEquals(true, this.exercise.isLucky(999999))
    }

    @Test
    fun test10() {
        Assertions.assertEquals(true, this.exercise.isLucky(123321))
    }
}