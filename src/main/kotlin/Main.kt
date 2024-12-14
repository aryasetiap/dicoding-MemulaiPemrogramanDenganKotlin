package com.dicoding.kotlin

fun main() {
    /*
    "Object Everywhere" dalam pemrograman Kotlin.

    Dalam Kotlin, semua nilai, termasuk tipe primitif seperti String, Integer, Char, dan Boolean, dianggap sebagai objek.
    Ini memungkinkan kita untuk memanggil fungsi dan properti dari variabel-variabel tersebut. Objek adalah realisasi
    dari blueprint atau class, yang memiliki fungsi dan properti yang sama dengan blueprint-nya. Dengan membuat objek,
    kita dapat mengakses berbagai fungsi dan properti yang terdapat pada kelas tersebut, seperti fungsi reverse(),
    toUpperCase(), dan toLowerCase() pada objek String.
     */

    val someString = "Dicoding"
    println(someString.reversed())
    println(someString.uppercase())
    println(someString.lowercase())

    val someString1 = "123"
    val someInt = someString1.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)
}
