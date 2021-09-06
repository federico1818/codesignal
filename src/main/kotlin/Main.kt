import arcade.intro.Exercise09

fun main() {
    val ex = Exercise09()
    val list: MutableList<String> = mutableListOf(
        "aba",
        "aa",
        "ad",
        "vcd",
        "aba"
    )
    println(ex.allLongestStrings(list))
}