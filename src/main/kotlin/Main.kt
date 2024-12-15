package com.dicoding.kotlin

fun main() {
    /*
    Properti dalam Kotlin:

    1. Properti dalam Kelas: Setiap kelas dalam Kotlin memiliki properti yang berbeda. Contoh pada kelas Animal,
        properti yang dimiliki adalah name, weight, age, dan isMammal.
    2. Deklarasi Properti: Properti dapat dideklarasikan sebagai nilai mutable dengan menggunakan var atau sebagai
        nilai read-only dengan menggunakan val.
    3. Property Accessor: Kotlin secara otomatis menghasilkan fungsi getter dan setter untuk properti mutable, dan
        hanya fungsi getter untuk properti read-only. Fungsi getter dan setter juga dapat dibuat secara manual jika
        diperlukan.
    4. Override Getter dan Setter: Anda dapat menambahkan kode lain pada fungsi getter dan setter sesuai kebutuhan
        dengan melakukan override pada fungsi tersebut.
     */

//  Tanpa setter dan getter
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")

//    output:
//    Nama: Dicoding Miaw
//    Nama: Goose

//    Dengan setter dan getter
    val dicodingCat2 = Animal2()
    println("Nama: ${dicodingCat2.name}" )
    dicodingCat2.name = "Goose"
    println("Nama: ${dicodingCat2.name}")

}

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

class Animal2{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}