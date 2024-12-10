package com.dicoding.kotlin

fun main() {
    /*
    Expressions dan Statements dalam pemrograman Kotlin.
    1. Expressions:
    Merupakan statement yang dapat mengembalikan nilai dan bisa disimpan ke dalam sebuah variabel.
    Contohnya adalah penggunaan if sebagai expression yang mengembalikan nilai ke variabel berdasarkan kondisi tertentu.
    2. Statements:
    Merupakan instruksi yang tidak mengembalikan nilai apapun, hanya sebagai percabangan atau perintah dalam kode.
    Contohnya adalah deklarasi variabel atau penggunaan if sebagai statement.
    */

    val now = 9
    val openOffice = 8

//    Expressions
    if (now > openOffice) {
        println("Office already open")
    } else {
        println("Office close")
    }

//    Statement
    fun sum(value1: Int, value2: Int) = value1 + value2
    var jumlahkan = sum(1,2)
    println(jumlahkan)
}
