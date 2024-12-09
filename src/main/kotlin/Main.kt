package com.dicoding.kotlin

fun main() {
    /*
    Arrays dalam pemrograman Kotlin.
    Array adalah tipe data yang memungkinkan kita untuk menyimpan beberapa objek di dalam satu variabel.
    Kotlin menggunakan kelas Array yang memiliki fungsi get dan set serta properti size.
    Untuk membuat Array, kita bisa menggunakan fungsi arrayOf().
    */

    val numbers = arrayOf(1, 3, 5, 7)
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

    println("Array 1 :")
    for (number in numbers) {
        println(number)
    }
    println()

    println("Array 2:")
    for (value in mixArray) {
        println(value)
    }

    /*
    Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data primitif dengan memanfaatkan beberapa fungsi spesifik berikut:
    intArrayOf() : IntArray
    booleanArrayOf() : BooleanArray
    charArrayOf() : CharArray
    longArrayOf() : LongArray
    shortArrayOf() : ShortArray
    byteArrayOf() : ByteArray
    */

}