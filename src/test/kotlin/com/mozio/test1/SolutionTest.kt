package com.mozio.test1

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SolutionTest {

    @Test
    fun exchangeStamps() {
        val result = Solution.exchangeStamps(
            intArrayOf(1, 7, 3, 1, 7, 4, 5, 1, 7, 1) to
                    intArrayOf(2, 3, 3, 2, 4, 3, 2)
        )
        assertContentEquals(result.first, intArrayOf(2, 3))
        assertContentEquals(result.second, intArrayOf(1, 1, 7))

        val result1 = Solution.exchangeStamps(
            intArrayOf(1, 2, 3, 4, 4) to
                    intArrayOf(4, 4, 4, 5, 6, 7)
        )
        assert(result1.first.isEmpty())
        assert(result1.second.isEmpty())

        val result2 = Solution.exchangeStamps(
            intArrayOf(5, 4, 4, 3, 3, 3, 3) to
                    intArrayOf(1, 3)
        )
        assert(result2.first.isEmpty())
        assertContentEquals(result2.second, intArrayOf(3, 3))
    }
}