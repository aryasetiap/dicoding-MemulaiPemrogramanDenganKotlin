package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val openHours = 7
    val now = 7
    val office: String = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)

//    If expressions digunakan untuk menginisialisasi nilai variabel berdasarkan kondisi tertentu.
//    If akan mengeksekusi statement atau expression jika kondisi bernilai true,
//    dan melewatkan proses jika bernilai false.
//    Jika if digunakan untuk mengembalikan atau menetapkan nilai variabel,
//    maka harus memiliki branch else.
//    Kotlin tidak mendukung ternary operator karena perannya sudah digantikan oleh if expressions
}