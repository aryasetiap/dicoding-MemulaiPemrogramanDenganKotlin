package com.dicoding.kotlin

// Contoh penggunaan overloading dalam Kotlin

class Animal {
    // Fungsi eat() tanpa parameter
    fun eat() {
        println("Animal is eating.")
    }

    // Fungsi eat() dengan satu parameter
    fun eat(typeFood: String) {
        println("Animal is eating $typeFood.")
    }

    // Fungsi eat() dengan dua parameter
    fun eat(typeFood: String, quantity: Int) {
        println("Animal is eating $quantity of $typeFood.")
    }
}

fun main() {
    val animal = Animal()

    // Memanggil fungsi eat() tanpa parameter
    animal.eat()

    // Memanggil fungsi eat() dengan satu parameter
    animal.eat("meat")

    // Memanggil fungsi eat() dengan dua parameter
    animal.eat("meat", 5)
}

/*
    Overloading dalam Kotlin:

    Polymorphism: Polymorphism adalah kemampuan objek, variabel, atau fungsi untuk memiliki berbagai bentuk. Contohnya
        adalah smartphone yang dapat digunakan sebagai kamera, pemutar musik, dan radio.

    Overloading: Overloading adalah kondisi di mana kita bisa membuat dua atau lebih fungsi dengan jumlah, tipe, atau
        urutan parameter yang berbeda dalam sebuah kelas. Ini memungkinkan fungsi dengan nama yang sama untuk melakukan
        hal yang berbeda berdasarkan parameter yang diberikan.

    Contoh Overloading: Pada kelas Animal, terdapat beberapa fungsi eat() dengan parameter yang berbeda. Fungsi pertama
        tidak memiliki parameter, fungsi kedua memiliki satu parameter typeFood, dan fungsi ketiga memiliki dua parameter
        typeFood dan quantity.

    Pentingnya Overloading: Overloading adalah fitur yang sangat powerful dalam pemrograman. Contoh lainnya adalah
        kelas Calculator yang memiliki fungsi matematika dengan overloading pada fungsi add().
*/