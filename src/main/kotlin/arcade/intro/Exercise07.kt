package arcade.intro

class Exercise07 {
    public fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
        val limit: Int = sequence.size - 1

        for(i in 0 until limit) {
            if(sequence[i] >= sequence[i + 1]) {
                var limitedSequence1: MutableList<Int> = sequence.toMutableList()
                var limitedSequence2: MutableList<Int> = sequence.toMutableList()

                limitedSequence1.removeAt(i)
                limitedSequence2.removeAt(i + 1)

                return this.almostIncreasingLimitedSequence(limitedSequence1) ||
                        this.almostIncreasingLimitedSequence(limitedSequence2)
            }
        }

        return true
    }

    private fun almostIncreasingLimitedSequence(sequence: List<Int>): Boolean {
        for(i in 0 until sequence.size - 1) {
            if(sequence[i] >= sequence[i + 1])
                return false
        }
        return true
    }
}