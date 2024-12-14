package com.dicoding.kotlin

fun main() {
    /*
    Break dan Continue dalam pemrograman Kotlin.
    1. Continue: Digunakan untuk melewatkan proses iterasi saat kondisi tertentu terpenuhi dan melanjutkan ke iterasi
    berikutnya. Ini berguna ketika kita ingin melewati nilai yang tidak sesuai harapan tanpa menghentikan seluruh proses perulangan.

    2. Break: Digunakan untuk menghentikan proses iterasi saat kondisi tertentu terpenuhi. Ini berguna ketika kita ingin
    menghentikan seluruh proses perulangan jika nilai yang dihasilkan tidak sesuai harapan.

    3. Labels: Kotlin memungkinkan kita untuk memberikan label pada loop atau blok kode tertentu. Label ini membantu
    mengontrol alur eksekusi loop, terutama ketika menggunakan break atau continue dalam nested loop.
    */

    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

//    Continue
    println("Continue")
    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }
    println()

//    Break
    println("Break")
    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
    println()


//    Break dan Continue Labels
    println("Break dan Continue Labels")
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop // akan keluar dari loop luar
        }
    }
    println()
}
