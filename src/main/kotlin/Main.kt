package com.dicoding.kotlin

// Contoh penggunaan exception handling dalam Kotlin

fun main() {
    try {
        // Contoh ArithmeticException
        val result = 10 / 0
        println("Hasil: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan: ${e.message}")
    } finally {
        println("Blok finally selalu dieksekusi.")
    }

    try {
        // Contoh NumberFormatException
        val number = "abc".toInt()
        println("Angka: $number")
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan: ${e.message}")
    } finally {
        println("Blok finally selalu dieksekusi.")
    }

    try {
        // Contoh NullPointerException
        val text: String? = null
        println("Panjang teks: ${text!!.length}")
    } catch (e: NullPointerException) {
        println("Terjadi kesalahan: ${e.message}")
    } finally {
        println("Blok finally selalu dieksekusi.")
    }
}

/*
    Exception Handling dalam Kotlin:

    try-catch: Salah satu cara untuk menangani exception adalah dengan menggunakan blok try-catch. Kode yang dapat
        menyebabkan exception ditempatkan dalam blok try, dan jika exception terjadi, blok catch akan menangani
        exception tersebut.

    try-catch-finally: Selain blok try dan catch, ada juga blok finally yang bersifat opsional. Blok finally akan
        dieksekusi setelah program keluar dari blok try atau catch, bahkan jika terjadi exception yang tidak terduga.

    Multiple Catch: Kita dapat menggunakan multiple catch untuk menangani lebih dari satu tipe exception. Setiap blok
        catch dapat menangani tipe exception yang berbeda, memungkinkan penanganan yang lebih spesifik untuk setiap jenis exception.
*/