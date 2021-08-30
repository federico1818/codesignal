package arcade.intro

class Exercise04 {
    fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
        var largestProduct: Int = inputArray[0] * inputArray[1]
        for(i in 0 until inputArray.size - 1) {
            largestProduct = largestProduct.coerceAtLeast(inputArray[i] * inputArray[i + 1])
        }
        return largestProduct
    }
}