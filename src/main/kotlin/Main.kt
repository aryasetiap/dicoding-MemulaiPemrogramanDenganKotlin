package com.dicoding.kotlin

fun main() {
    /*
    Functions dalam pemrograman Kotlin. Fungsi adalah prosedur yang memiliki keterkaitan dengan pesan dan objek.
    Ketika kita memanggil sebuah fungsi, sebuah mini-program akan dijalankan.
    Fungsi digunakan untuk mengatur program dan dapat mengembalikan nilai.
    Deklarasi fungsi di Kotlin diawali dengan kata kunci fun, diikuti dengan nama fungsi, parameter, dan tipe kembalian.
    Fungsi dapat memiliki satu atau lebih parameter yang dipisahkan oleh koma dan berada di dalam tanda kurung.
    Tipe kembalian adalah nilai yang akan dikembalikan ketika fungsi dipanggil. Jika fungsi hanya memiliki satu expression,
    maka dapat menggunakan expression body dengan tanda =.
    Jika fungsi tidak mengembalikan nilai, dapat menggunakan Unit sebagai tipe kembalian.
    */

    fun setUser(name: String, age: Int): String {
        return "Your name is $name, and you $age years old"
    }

    fun setUserEB(name: String, age: Int): String = "Your name is $name, and you $age years old"

    println(setUser("Arya", 20))
    println(setUserEB("Bela", 21))
}