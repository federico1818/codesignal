package arcade.intro

class Exercise10 {
    public fun commonCharacterCount(s1: String, s2: String): Int {
        var sum: Int = 0
        var s2Copy: String = s2

        s1.forEach { it ->
            var index = s2Copy.indexOf(it)
            if(index != -1) {
                sum++
                s2Copy = s2Copy.removeRange(index, index + 1)
            }
        }

        return sum
    }
}