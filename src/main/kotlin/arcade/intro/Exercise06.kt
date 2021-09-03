package arcade.intro

class Exercise06 {
    fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
        statues.sort()
        return statues.zipWithNext { a, b -> b - a - 1 }.sum()
    }
}