package com.dicoding.kotlin

fun main() {
    /*
    Named dan Default Argument dalam pemrograman Kotlin.

    1. Named Argument:
    Kotlin memungkinkan kita untuk menentukan argumen dari parameter mana
    yang ingin dilampirkan dengan memanggil nama dari parameter tersebut.
    Ini membantu menghindari kesalahan dalam menghafal posisi parameter saat memanggil fungsi.

    2. Default Argument:
    Kotlin juga memungkinkan kita untuk menentukan nilai default dari sebuah parameter.
    Jika argumen tidak dilampirkan, nilai default tersebut akan digunakan.
    Ini membantu menghindari kesalahan dan membuat kode lebih mudah dibaca.

    Dengan memanfaatkan named dan default argument, kode yang kita tulis menjadi lebih mudah dibaca
    dan membantu dalam menggunakan fungsi yang kompleks.
    */

    // Named Argument
    fun getFullName(first: String, middle: String, last: String): String {
        return "$first $middle $last"
    }
    println(getFullName(first = "Arya", middle = "Setia", last = "Pratama"))

    // Default Argument
    fun getFullName2(
        first: String = "Kotlin",
        middle: String = " is ",
        last: String = "Awesome"): String {
        return "$first $middle $last"
    }
    println(getFullName2())
}