package com.example.testapp.DS

class ReverseString {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            reverseString(input = "My Name is Gursewak")
        }

        private fun reverseString(input: String?) {
            if (input == null || input.length < 2) {
                print("OutPut = Input String is null or empty or size < 2")
                return
            }
            println("Input Value = " + input)
            val array = input.toCharArray()
            var start = 0
            var end = input.lastIndex
            while(start != end) {
                val firstItem = array[start]
                val lastItem = array[end]
                array[start] = lastItem
                array[end] = firstItem
                start ++
                end --
            }
            print("OutPut = ")
            array.forEach { print(it) }
        }
    }
}