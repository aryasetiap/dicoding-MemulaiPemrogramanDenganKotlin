package com.dicoding.kotlin

import kotlin.reflect.KProperty

// delegate properti string
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

// delegate properti any
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

fun main() {
    /*
    Property Delegation dalam Kotlin:

    1. Pengelolaan Properti: Properti kelas dapat didelegasikan kepada kelas lain untuk meminimalisir penulisan kode getter
    dan setter yang berulang.

    2. Kelas Delegasi: Sebelum mendelegasikan properti, buat kelas delegasi terlebih dahulu. Gunakan keyword by untuk
    menginisialisasi properti yang didelegasikan.

    2. Contoh Kode: Properti name dikelola melalui kelas DelegateName. Delegasi dapat digunakan oleh properti dengan tipe
    data yang berbeda menggunakan tipe data Any.
    */

    val animal = Animal()
    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")
}