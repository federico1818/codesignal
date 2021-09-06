package arcade.intro

class Exercise09 {
    public fun allLongestStrings(inputArray: MutableList<String>): List<String> {
        var sorted: List<String> = inputArray.sortedByDescending { it.length }
        return sorted.filter { it.length == sorted[0].length }
    }
}