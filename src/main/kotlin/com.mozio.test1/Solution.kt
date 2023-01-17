package com.mozio.test1

object Solution {

    fun exchangeStamps(input: Pair<IntArray, IntArray>): Pair<IntArray, IntArray> {
        val map1 = mutableMapOf<Int, Int>()
        val map2 = mutableMapOf<Int, Int>()

        input.first.forEach {
            map1[it] = map1.getOrPut(it) { 0 } + 1
        }
        input.second.forEach {
            map2[it] = map2.getOrPut(it) { 0 } + 1
        }

        val result1 = addIfNotExist(map2, map1)
        val result2 = addIfNotExist(map1, map2)

        return result1.toIntArray().sortedArray() to result2.toIntArray().sortedArray()
    }

    private fun addIfNotExist(map1: Map<Int, Int>, map2: Map<Int, Int>): MutableList<Int> {
        val result = mutableListOf<Int>()

        map1.filter { entry -> entry.value > 1 }.forEach { (key, value) ->
            if (map2.getOrDefault(key, 0) <= 1) {
                for (i in 1..value - 2) {
                    result.add(key)
                }
            }
        }

        return result
    }
}