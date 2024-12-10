package com.dicoding.kotlin

fun main() {
    /*
    While dan Do While dalam pemrograman Kotlin.

    While Loop: Digunakan untuk menjalankan blok kode selama kondisi tertentu terpenuhi. While loop bersifat entry
    controlled loop, artinya kondisi dievaluasi sebelum blok kode dijalankan. Jika kondisi tidak terpenuhi sejak awal,
    blok kode tidak akan dijalankan sama sekali.

    Do While Loop: Berbeda dengan while loop, do while loop bersifat exit controlled loop. Ini berarti blok kode akan
    dijalankan setidaknya sekali sebelum kondisi dievaluasi. Jika kondisi terpenuhi, blok kode akan dijalankan kembali.

    Kedua jenis loop ini digunakan untuk menghindari penulisan kode yang berulang dan memungkinkan perulangan blok kode
    berdasarkan kondisi tertentu. Halaman ini juga memberikan contoh penggunaan while dan do while loop serta
    memperingatkan tentang infinite loop, yaitu kondisi di mana perulangan berlangsung terus menerus sampai aplikasi crash
    */

    // While
    var counter = 1
    while (counter <= 7){
        println("Hello, World!")
        counter++
    }

    println()

    // Do While
    var counter2 = 1
    do {
        println("Hello, World!")
        counter2++
    } while (counter2 <= 7)
}
