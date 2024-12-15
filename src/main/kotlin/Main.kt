package com.dicoding.kotlin

// Contoh penggunaan abstract class dalam Kotlin

// Abstract class Animal
abstract class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
    abstract fun makeSound()

    fun eat() {
        println("$name is eating.")
    }

    fun sleep() {
        println("$name is sleeping.")
    }
}

// Kelas Cat yang mewarisi abstract class Animal
class Cat(name: String, weight: Double, age: Int, isCarnivore: Boolean, val furColor: String, val numberOfFeet: Int) : Animal(name, weight, age, isCarnivore) {
    override fun makeSound() {
        println("$name says: Meow!")
    }

    fun playWithHuman() {
        println("$name is playing with human.")
    }
}

// Kelas Fish yang mewarisi abstract class Animal
class Fish(name: String, weight: Double, age: Int, isCarnivore: Boolean, val scaleColor: String, val numberOfFin: Int) : Animal(name, weight, age, isCarnivore) {
    override fun makeSound() {
        println("$name says: Blub!")
    }

    fun swim() {
        println("$name is swimming.")
    }
}

// Kelas Snake yang mewarisi abstract class Animal
class Snake(name: String, weight: Double, age: Int, isCarnivore: Boolean, val skinColor: String, val isToxic: Boolean) : Animal(name, weight, age, isCarnivore) {
    override fun makeSound() {
        println("$name says: Hiss!")
    }

    fun bite() {
        println("$name is biting.")
    }
}

fun main() {
    val cat = Cat("Kucing", 3.2, 2, true, "Oren", 4)
    cat.eat()
    cat.sleep()
    cat.makeSound()
    cat.playWithHuman()

    val fish = Fish("Ikan", 1.5, 1, false, "Biru", 2)
    fish.eat()
    fish.sleep()
    fish.makeSound()
    fish.swim()

    val snake = Snake("Ular", 2.0, 3, true, "Hijau", true)
    snake.eat()
    snake.sleep()
    snake.makeSound()
    snake.bite()
}

/*
    Abstract Class dalam Kotlin:

    Konsep Abstraction: Abstraction adalah konsep di mana detail implementasi suatu objek disembunyikan dan hanya
        menunjukkan fungsionalitas yang relevan bagi pengguna objek tersebut.

    Abstract Class: Abstract class adalah gambaran umum dari sebuah kelas yang tidak dapat direalisasikan dalam bentuk
        objek. Kelas ini hanya mendefinisikan nama method dan properti tanpa implementasi.

    Keyword abstract: Untuk menjadikan sebuah kelas sebagai abstract, tambahkan keyword abstract sebelum nama kelas.

    Implementasi di Child Class: Kelas turunan (child class) dari abstract class harus mengimplementasikan method dan
        properti yang didefinisikan dalam abstract class.
*/