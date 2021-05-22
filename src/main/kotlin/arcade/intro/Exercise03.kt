package arcade.intro

/*
* Given the string, check if it is a palindrome.
* */

class Exercise03 {
    fun checkPalindrome(inputString: String): Boolean {
        return inputString == inputString.reversed()
    }
}