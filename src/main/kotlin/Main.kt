package com.dicoding.kotlin

// Contoh penggunaan inheritance dalam Kotlin

// Kelas Animal sebagai parent class
open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
    fun eat() {
        println("$name is eating.")
    }

    fun sleep() {
        println("$name is sleeping.")
    }
}

// Kelas Cat sebagai child class yang mewarisi kelas Animal
class Cat(name: String, weight: Double, age: Int, isCarnivore: Boolean, val furColor: String, val numberOfFeet: Int) : Animal(name, weight, age, isCarnivore) {
    fun playWithHuman() {
        println("$name is playing with human.")
    }
}

// Kelas Fish sebagai child class yang mewarisi kelas Animal
class Fish(name: String, weight: Double, age: Int, isCarnivore: Boolean, val scaleColor: String, val numberOfFin: Int) : Animal(name, weight, age, isCarnivore) {
    fun swim() {
        println("$name is swimming.")
    }
}

// Kelas Snake sebagai child class yang mewarisi kelas Animal
class Snake(name: String, weight: Double, age: Int, isCarnivore: Boolean, val skinColor: String, val isToxic: Boolean) : Animal(name, weight, age, isCarnivore) {
    fun bite() {
        println("$name is biting.")
    }
}

fun main() {
    val cat = Cat("Kucing", 3.2, 2, true, "Oren", 4)
    cat.eat()
    cat.sleep()
    cat.playWithHuman()

    val fish = Fish("Ikan", 1.5, 1, false, "Biru", 2)
    fish.eat()
    fish.sleep()
    fish.swim()

    val snake = Snake("Ular", 2.0, 3, true, "Hijau", true)
    snake.eat()
    snake.sleep()
    snake.bite()
}

/*
    Inheritance dalam Kotlin:

    Konsep Inheritance: Inheritance atau pewarisan adalah salah satu pilar dari OOP yang memungkinkan kelas untuk
        mewarisi properti dan fungsi dari kelas lain. Ini membantu mengurangi duplikasi kode.

    Parent dan Child Class: Kelas yang mewariskan properti dan fungsi disebut parent class atau super class, sedangkan
        kelas yang menerima pewarisan disebut child class atau sub class.

    Contoh Kelas: Kelas Animal sebagai parent class memiliki properti seperti name, weight, age, dan isCarnivore, serta
        fungsi eat() dan sleep(). Kelas Cat, Fish, dan Snake sebagai child class mewarisi properti dan fungsi dari
        Animal dan menambahkan properti serta fungsi spesifik mereka sendiri.

    Keyword open dan override: Kelas di Kotlin secara default bersifat final. Untuk memungkinkan pewarisan, kelas harus
        dideklarasikan dengan keyword open. Fungsi yang diambil alih oleh child class menggunakan keyword override.

    Polymorphism: Overriding adalah bagian dari konsep polymorphism, di mana fungsi dengan nama yang sama dapat memiliki
        perilaku yang berbeda berdasarkan objek yang memanggilnya.
*/