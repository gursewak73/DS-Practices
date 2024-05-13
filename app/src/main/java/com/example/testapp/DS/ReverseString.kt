package com.example.testapp.DS

class ReverseString {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val name = "My name is gursewak singh"
            println("Input Value = " + name)
            val array = name.toCharArray()
            var start = 0
            var end = name.lastIndex
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