package arcade.intro

class Exercise08 {
    public fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
        var sum: Int = 0

        for(column in 0 until matrix[0].size) {
            for(row in 0 until matrix.size) {
                if(matrix[row][column] == 0)
                    break
                sum += matrix[row][column]
            }
        }

        return sum
    }
}