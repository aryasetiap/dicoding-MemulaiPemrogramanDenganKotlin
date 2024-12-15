package com.dicoding.kotlin

// Contoh penggunaan interface dalam Kotlin

// Mendefinisikan interface IFly
interface IFly {
    val numberOfWings: Int
    fun fly()
}

// Kelas Bird mengimplementasikan interface IFly
class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        println("Bird is flying with $numberOfWings wings.")
    }
}

// Kelas Airplane mengimplementasikan interface IFly
class Airplane(override val numberOfWings: Int) : IFly {
    override fun fly() {
        println("Airplane is flying with $numberOfWings wings.")
    }
}

fun main() {
    val bird = Bird(2)
    bird.fly()

    val airplane = Airplane(2)
    airplane.fly()
}

/*
    Interfaces dalam Kotlin:

    Konsep Interface: Interface adalah konsep yang digunakan oleh suatu kelas agar dapat memiliki sifat tertentu.
        Interface mirip dengan abstract class, tetapi tanpa deklarasi properti dan fungsi yang dideklarasikan tanpa isi.

    Implementasi Interface: Kelas yang mengimplementasikan sebuah interface harus melakukan override seluruh properti
        dan fungsi yang terdapat pada interface tersebut.

    Penamaan Interface: Penamaan interface biasanya diawali dengan huruf "I" kapital untuk membedakannya dengan kelas.

        Perbedaan dengan Abstract Class:

        Abstract class bisa berisi default value, sedangkan interface tidak bisa.

        Setiap member abstract class final secara default, sedangkan member interface abstract secara default.

        Satu kelas hanya bisa extend satu abstract class, tetapi bisa implement lebih dari satu interface.
*/