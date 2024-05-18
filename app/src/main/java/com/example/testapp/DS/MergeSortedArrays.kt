package com.example.testapp.DS

class MergeSortedArrays {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            mergeSortedArrays(firstArray = arrayOf(0, 3, 4, 6), secondArray = arrayOf(7, 9, 30, 32, 56, 57))
        }

        private fun mergeSortedArrays(firstArray: Array<Int>, secondArray: Array<Int>) {
            var i = 0
            var j = 0
            val resultArray = ArrayList<Int>()
            while (i < firstArray.size && j < secondArray.size) {
                if (firstArray[i] < secondArray[j]) {
                    resultArray.add(firstArray[i])
                    i ++
                } else {
                    resultArray.add(secondArray[j])
                    j ++
                }
            }

            while (i < firstArray.size) {
                resultArray.add(firstArray[i])
                i++
            }

            while (j < secondArray.size) {
                resultArray.add(secondArray[j])
                j++
            }

            resultArray.forEach { print("|" + it) }
        }
    }
}