package com.dicoding.kotlin

fun main() {
    /*
    Safe Calls dan Elvis Operator dalam pemrograman Kotlin.
    Safe Calls (?.) digunakan untuk mengakses atau mengelola nilai dari objek nullable dengan aman,
    sehingga mencegah terjadinya NullPointerException. Jika objek bernilai null, proses akan dilewatkan.
    */
    val text: String? = null
    text?.length // ini akan dilewati karena text bernilai Null Pointer Exception (NPE)

    /*
    Elvis Operator (?:) memungkinkan kita untuk menetapkan nilai default jika objek bernilai null.
    Operator ini membantu menulis kode yang lebih aman dan mudah dibaca.
    */
    // akan mengembalikan nilai text.length jika text tidak bernilai null
    // jika null maka akan mengembalikan nilai defaultnya yaitu 7
    val textLength = text?.length ?: 7

    println(textLength)

}