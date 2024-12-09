package com.dicoding.kotlin

fun main() {
    // Nullable Types dalam pemrograman Kotlin.
    // NullPointerException (NPE) adalah kesalahan yang terjadi saat mencoba mengakses atau mengelola nilai
    // dari variabel yang belum diinisialisasi atau bernilai null. Kotlin memudahkan pengelolaan variabel nullable
    // untuk meminimalisasi terjadinya NPE.
    // Kotlin membedakan objek yang boleh bernilai null dan yang tidak boleh bernilai null saat objek tersebut dibuat.
    // Jika objek bisa bernilai null, kita bisa menambahkan tanda ? setelah tipe objek tersebut.
    // Namun, kita tidak bisa langsung mengakses atau mengelola nilai dari objek nullable tanpa pemeriksaan null
    // atau menggunakan fitur seperti Safe Calls dan Elvis Operator.

    var obj: String? = null

    // mengelola nullable
    if(obj is String) {
        // Tidak membutuhkan casting secara eksplisit.
        println("String length is ${obj.length}")
    }

    obj = "Bola Panas"
    println(obj)
}