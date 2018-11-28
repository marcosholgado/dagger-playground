package com.marcosholgado.daggerplayground

class ExpensiveObject {

    var intArray: IntArray = IntArray(100000001)
    var byteArray: ByteArray = ByteArray(1000001)

    init {

        for(i in 0..100000000) {
            intArray[i] = i
        }

        for(i in 0..1000000) {
            byteArray[i] = i.toByte()
        }
    }
}