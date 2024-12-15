package com.dicoding.kotlin

// Contoh penggunaan visibility modifiers dalam Kotlin

// Public: Anggota dapat diakses dari mana saja
class Animal {
    var name: String = "Kucing"
    var age: Int = 2
    var weight: Double = 3.2
    var isMammal: Boolean = true
}

// Private: Anggota hanya dapat diakses dalam scope yang sama
class AnimalPrivate {
    private var name: String = "Kucing"
    private var age: Int = 2
    private var weight: Double = 3.2
    private var isMammal: Boolean = true

    fun getName(): String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }
}

// Protected: Anggota dapat diakses oleh kelas turunannya
open class AnimalProtected {
    protected var weight: Double = 3.2
}

class Cat : AnimalProtected() {
    fun printWeight() {
        println("Berat: $weight")
    }
}

// Internal: Anggota hanya dapat diakses dalam satu modul
internal class AnimalInternal {
    var name: String = "Kucing"
    var age: Int = 2
    var weight: Double = 3.2
    var isMammal: Boolean = true
}

fun main() {
    val animal = Animal()
    println("Nama: ${animal.name}, Umur: ${animal.age}, Berat: ${animal.weight}, Mamalia: ${animal.isMammal}")

    val animalPrivate = AnimalPrivate()
    println("Nama: ${animalPrivate.getName()}")
    animalPrivate.setName("Kucing Oren")
    println("Nama baru: ${animalPrivate.getName()}")

    val cat = Cat()
    cat.printWeight()

    val animalInternal = AnimalInternal()
    println("Nama: ${animalInternal.name}, Umur: ${animalInternal.age}, Berat: ${animalInternal.weight}, Mamalia: ${animalInternal.isMammal}")
}

/*
    Visibility Modifiers dalam Kotlin:

    Public: Hak akses yang paling luas. Anggota dengan modifier ini dapat diakses dari mana saja.

    Private: Hak akses yang paling terbatas. Anggota hanya dapat diakses dalam scope yang sama.

    Protected: Hak akses terbatas pada hirarki kelas. Anggota hanya dapat diakses oleh kelas turunannya atau kelas itu sendiri.

    Internal: Hak akses terbatas pada satu modul. Anggota tidak dapat diakses di luar modulnya.

    Semua modifier ini dapat digunakan untuk kelas, objek, konstruktor, fungsi, dan properti, kecuali protected yang
    hanya bisa digunakan untuk anggota dalam kelas dan interface.
*/