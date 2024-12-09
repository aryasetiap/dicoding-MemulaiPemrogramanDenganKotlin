package com.dicoding.kotlin

fun main() {
    /*
    Numbers dalam pemrograman Kotlin.
    Tipe data Number digunakan untuk menyimpan nilai dalam bentuk numerik.
    Kotlin memiliki beberapa tipe data Number, termasuk Int, Long, Short, Byte, Double, dan Float.
    Setiap tipe data memiliki ukuran dan rentang nilai yang berbeda-beda.
    */

    /*
    Int (32 Bit)
    Int adalah tipe data yang umumnya digunakan untuk menyimpan nilai numerik.
    Int dapat menyimpan data dari range -2^31 sampai +2^31-1.
    */
    val intNumber = 100

    /*
    Long (64 Bit)
    Long adalah tipe data yang digunakan untuk menyimpan nilai numerik yang lebih besar yaitu dari range -2^63 sampai +2^63-1.
    */
    val longNumber: Long = 100 // atau val longNumber = 100L

    /*
    Short (16 Bit)
    Short merupakan sebuah bilangan bulat yang hanya dapat menyimpan nilai yang kecil karena hanya berukuran 16 Bit.
    */
    val shortNumber: Short = 10

    /*
    Byte (8 Bit)
    Dengan ukuran yang kecil, Byte hanya mampu menyimpan nilai yang kecil sama halnya seperti Short.
    Byte biasa digunakan untuk keperluan proses membaca dan menulis data dari sebuah stream file atau jaringan.
    */
    val byteNumber = 0b11010010

    /*
    Double (64 Bit)
    Sama halnya dengan Long yang memiliki ukuran yang besar, Double mampu menyimpan nilai numerik yang besar pula.
    Pada umumnya Double digunakan untuk menyimpan nilai numerik pecahan sampai dengan maksimal 15-16 angka di belakang koma.
    */
    val doubleNumber: Double = 1.3

    /*
    Float (32 Bit)
    Sama seperti Double, namun memiliki ukuran yang lebih kecil, yakni hanya sampai 6-7 angka di belakang koma.
    */
    val floatNumber: Float = 0.123456789f    // yang terbaca hanya 0.1234567

//  Cara mengetahui nilai maksimal dan minimal
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    println(maxInt)
    println(minInt)

// Jika memasukkan nilai lebih dari maksimal maka akan terjadi overflow
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")


    /*
    Beberapa fungsi konversi yang dapat digunakan dalam tipe data numbers
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char

    Contoh :
    */
    val stringNumber = "23"
    val integerNumber = 3

    print(integerNumber + stringNumber.toInt())
}