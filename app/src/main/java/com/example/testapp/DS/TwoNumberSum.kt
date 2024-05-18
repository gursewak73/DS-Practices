package com.example.testapp.DS

class TwoNumberSum {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val findTwoNumberSum = findTwoNumberSum(nums = intArrayOf(2,5,5,11), target = 10)
            val joinToString = findTwoNumberSum.joinToString("|") {
                it.toString()
            }
            print(joinToString)
        }

        private fun findTwoNumberSum(nums: IntArray, target: Int): IntArray {
            var i = 0
            var j = 1
            val array = intArrayOf(0, 0)
            while (i < nums.size) {
                if (nums[i] + nums[j] == target) {
                    array[0] = i
                    array[1] = j
                    return array
                } else {
                    if (j < nums.lastIndex) {
                        j++
                    } else {
                        i++
                        j = i + 1
                    }
                }
            }
            return array
        }
    }
}