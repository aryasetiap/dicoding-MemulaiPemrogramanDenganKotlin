package com.dicoding.kotlin

fun main() {
    /*
    Vararg (Variable Argument) dalam pemrograman Kotlin.

    Vararg memungkinkan kita untuk menyederhanakan beberapa parameter yang memiliki tipe data yang sama menjadi
    parameter tunggal dengan menggunakan kata kunci vararg. Dengan vararg, sebuah fungsi dapat memiliki jumlah parameter
    yang bervariasi berdasarkan jumlah argumen yang dimasukkan saat fungsi tersebut dipanggil.

    Beberapa aturan penting dalam penggunaan vararg:
    1. Tidak diizinkan memiliki dua parameter bertanda vararg dalam satu fungsi.
    2. Parameter bertanda vararg sebaiknya berada pada posisi terakhir jika ada parameter lain tanpa kata kunci vararg.
    3. Jika parameter vararg ditempatkan di posisi pertama, kita harus menggunakan named argument untuk parameter lainnya.

    Vararg berbeda dengan Array karena kita bisa memasukkan argumen satu per satu, dan kita juga bisa menggunakan
    spread operator (*) untuk memasukkan nilai yang sudah berbentuk Array sebagai argumen untuk parameter vararg.
    */

    fun sumNumbers(vararg number: Int): Int {
        return number.sum()
    }
    println(sumNumbers(1,2,3,4,5,6))

    fun getNumberSize(vararg number:Int): Int {
        return number.size
    }
    println(getNumberSize(1,2,3,4))
}
