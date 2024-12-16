package com.dicoding.kotlin

// Mengimpor package kotlin.random untuk menggunakan kelas Random
import kotlin.random.Random
// Menggunakan alias untuk menghindari ambiguitas
import kotlin.math.PI as kotlinPI
import java.lang.Math.PI as javaPI
// Mengimpor beberapa fungsi dan variabel dari package kotlin.math
import kotlin.math.*

fun main() {
    // Menggunakan kelas Random untuk menghasilkan angka acak
    val randomNumber = Random.nextInt(0, 100)
    println("Angka acak: $randomNumber")

    val number = 16.0
    println("Akar kuadrat dari $number adalah ${sqrt(number)}")
    println("Nilai PI adalah $kotlinPI")

    println("Nilai PI dari kotlin.math adalah $kotlinPI")
    println("Nilai PI dari java.lang.Math adalah $javaPI")
}

/*
    Import dan Packages dalam Kotlin:

    Pengelompokan Konten: Semua konten dalam Kotlin, seperti kelas dan fungsi, dibungkus dalam sebuah package untuk
        mengelompokkan kelas, fungsi, dan variabel yang memiliki kemiripan fungsionalitas.

    Mengimpor Package: Untuk menggunakan kelas, fungsi, atau variabel dari suatu package, kita harus mengimpor package
        tersebut menggunakan keyword import diikuti dengan alamat spesifiknya.

    Efisiensi Penulisan Kode: Dengan mengimpor package, kita tidak perlu menuliskan alamat package secara lengkap setiap
        kali menggunakan kelas atau fungsi dari package tersebut, sehingga penulisan kode menjadi lebih efisien.

    Alias: Kita dapat menggunakan alias dengan keyword as untuk menghindari ambiguitas ketika ada kelas, fungsi, atau
        variabel dengan nama yang sama tetapi berada di package yang berbeda.

    Mengimpor Seluruh Konten: Kita dapat mengimpor seluruh kelas, fungsi, dan variabel dari suatu package dengan menggunakan
        tanda * pada akhir package tersebut.
*/