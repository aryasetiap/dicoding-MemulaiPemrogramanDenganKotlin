package com.dicoding.kotlin

// Contoh penggunaan exception handling dalam Kotlin

fun main() {
    try {
        // Contoh ArithmeticException
        val result = 10 / 0
        println("Hasil: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan: ${e.message}")
    }

    try {
        // Contoh NumberFormatException
        val number = "abc".toInt()
        println("Angka: $number")
    } catch (e: NumberFormatException) {
        println("Terjadi kesalahan: ${e.message}")
    }

    try {
        // Contoh NullPointerException
        val text: String? = null
        println("Panjang teks: ${text!!.length}")
    } catch (e: NullPointerException) {
        println("Terjadi kesalahan: ${e.message}")
    }
}

/*
    Exception dalam Kotlin:

    Pengertian Exception: Exception adalah kejadian yang dapat mengacaukan jalannya suatu program. Pada Kotlin, semua
        exception bersifat unchecked, yang berarti exception terjadi karena kesalahan pada kode kita.

    Jenis-Jenis Exception: Beberapa contoh unchecked exception yang sering mengganggu jalannya program adalah:

        ArithmeticException: Terjadi karena pembagian bilangan dengan nilai nol.

        NumberFormatException: Disebabkan oleh kesalahan dalam format angka, misalnya mengubah nilai String yang tidak
            memiliki format angka yang benar menjadi Integer.

        NullPointerException (NPE): Terjadi karena sebuah variabel atau objek memiliki nilai null, padahal seharusnya
            tidak boleh null.
*/