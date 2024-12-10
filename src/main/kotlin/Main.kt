package com.dicoding.kotlin

fun main() {
    /*
    For Loop dalam pemrograman Kotlin.

    For loop digunakan untuk melakukan perulangan pada blok kode selama kondisi yang diberikan terpenuhi atau
    bernilai true. For loop dapat digunakan pada Ranges, Collections, Arrays, dan apa pun yang menyediakan iterator.
    Selain itu, kita juga dapat menggunakan ekstensi step untuk mengatur jarak nilai dalam perulangan, serta fungsi
    withIndex() untuk mengakses indeks setiap elemen dalam Ranges. Kotlin juga menyediakan ekstensi forEach untuk
    melakukan perulangan pada setiap item dari variabel tanpa perlu menggunakan kata kunci for secara terpisah.
    */

    val ranges = 1.rangeTo(10) step 3
    for (i in ranges ){
        println("value is $i!")
    }
}
