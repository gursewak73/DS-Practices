package com.example.testapp.DS

class MaxSubArray {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            print(maxSubArray(nums = intArrayOf(1,2)))
        }

        private fun maxSubArray(nums: IntArray): Int {
//            [-2,1,-3,4,-1,2,1,-5,4]
//            The subarray [4,-1,2,1] has the largest sum 6
            if (nums.size == 1) {
                return nums[0]
            }
            if (nums.size == 2) {
                return nums[0] + nums[1]
            }
            var largestSum = Integer.MIN_VALUE
            var i = 0
            var j = 1
            var currSum = 0
            while (i <= nums.size - 1) {
                currSum += nums[i]
                if (currSum > largestSum) {
                    largestSum = currSum
                }

                if (currSum < 0) {
                    currSum = 0
                }
                i++
            }
            return largestSum
        }
    }
}