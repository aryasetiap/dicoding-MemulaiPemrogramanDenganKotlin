package com.dicoding.kotlin

class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)
// dengan nilai default
// class Animal(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true)

// init block : untuk melakukan verivikasi terhadap nilai properti
class Animal2(name: String, weight: Double, age: Int, isMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}

fun main(){
    /*
    Primary Constructor dalam Kotlin:

    Primary Constructor: Digunakan untuk menginisialisasi properti pada kelas saat objek dibuat. Properti dituliskan
    pada header class dengan var atau val.

    Nilai Default: Primary constructor dapat memiliki nilai default untuk properti, sehingga pengiriman nilai pada saat
    pembuatan objek bersifat opsional.

    Init Block: Kotlin menyediakan blok init untuk menginisialisasi properti di dalam body class dan memvalidasi nilai
    properti sebelum diinisialisasi.

    Keyword this: Digunakan untuk menghindari ambiguitas antara properti pada body class dan parameter pada head class.
    */

    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )

    val dicodingCat2 = Animal2("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat2.name}, Berat: ${dicodingCat2.weight}, Umur: ${dicodingCat2.age}, mamalia: ${dicodingCat2.isMammal}" )
}