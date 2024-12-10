package com.dicoding.kotlin

import kotlin.random.Random

fun main() {
    /*
    When Expressions dalam pemrograman Kotlin. When expressions digunakan sebagai alternatif dari if-else if yang lebih
    sederhana dan lebih mudah dibaca. When expression memungkinkan kita untuk mencocokkan nilai dari sebuah variabel
    atau expression dengan beberapa kondisi secara berurutan sampai salah satu kondisi terpenuhi. Kita juga bisa
    menambahkan branch else yang akan dievaluasi jika tidak ada kondisi yang terpenuhi. When expression dapat
    mengembalikan nilai dan dapat disimpan dalam sebuah variabel. Selain itu, when expression juga bisa digunakan untuk
    memeriksa instance dengan tipe tertentu dari sebuah objek menggunakan is atau !is, serta memeriksa nilai yang
    terdapat pada sebuah Range atau Collection.
    */

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)
}

fun getRegisterNumber() = Random.nextInt(100)
