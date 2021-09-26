package arcade.intro

class Exercise11 {
    public fun isLucky(n: Int): Boolean {
        val number: String = n.toString()
        return  number.substring(0, number.length / 2).sumOf { c: Char -> c.digitToInt() } ==
                number.substring(number.length / 2, number.length).sumOf { c: Char -> c.digitToInt() }
    }
}