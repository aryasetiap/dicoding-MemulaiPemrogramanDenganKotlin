package com.dicoding.kotlin

fun main() {
    /*
    Membuat kelas dalam Kotlin:

    1. Mendefinisikan Kelas: Gunakan kata kunci class diikuti dengan nama kelas yang akan dibuat.
    2. Menambahkan Properti dan Metode: Kelas dapat memiliki properti dan metode. Contoh kelas Animal memiliki 4
        properti dan 2 metode.
    3. Membuat Objek: Gunakan val atau var diikuti dengan nama objek, lalu inisialisasi objek dengan memanggil nama
        kelas dan menambahkan nilai properti yang dibutuhkan pada constructor utama.
    4. Contoh Kode: Kode lengkap dengan fungsi cetak untuk melihat nilai properti dalam objeknya. Contoh output:
        Nama: Kucing, Berat: 3.2, Umur: 2, mamalia: true
        Kucing makan! Kucing tidur!
        Nama: Kucing Oren, Berat: 6.0, Umur: 3, mamalia: true
        Kucing Oren makan! Kucing Oren tidur!
     */

    class Animal() {
        var name: String = "Kucing"
        var weight: Double = 3.2
        var age: Int = 2
        var isMammal: Boolean = true

        fun eat(){
            println("$name makan!")
        }

        fun sleep() {
            println("$name tidur!")
        }
    }

    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()

    // Mengubah objek dari class dicodingCat
    dicodingCat.name = "Kucing Oren"
    dicodingCat.weight = 6.0
    dicodingCat.age = 3
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
    dicodingCat.eat()
    dicodingCat.sleep()
}
