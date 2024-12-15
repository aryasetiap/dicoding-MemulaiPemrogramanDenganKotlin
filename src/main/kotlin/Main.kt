package com.dicoding.kotlin

// Contoh penggunaan extension properties dalam Kotlin

// Extension property untuk kelas String
val String.firstChar: Char
    get() = this[0]

fun main() {
    // Menggunakan extension property firstChar
    val name = "Kotlin"
    println("First character of $name is ${name.firstChar}")
}

/*
    Extensions dalam Kotlin:

    Extensions: Kotlin memungkinkan kita untuk menambahkan fungsi baru pada sebuah kelas tanpa harus mewarisi kelas
        tersebut melalui deklarasi khusus yang disebut Extensions.

    Extension Functions: Digunakan untuk menambahkan fungsi baru pada kelas. Deklarasinya melibatkan receiver type dan
        nama fungsi yang dipisahkan oleh titik (.). Contoh: fun Int.isEven(): Boolean { return this % 2 == 0 }.

    Extension Properties: Digunakan untuk menambahkan properti baru pada kelas tanpa menyentuh kode di dalam kelas
        tersebut. Deklarasinya mirip dengan extension functions, tetapi harus menyediakan getter atau setter secara
        eksplisit. Contoh: val String.firstChar: Char get() = this[0].

    Infix Function: Memungkinkan pemanggilan fungsi dengan cara yang lebih ringkas dan mirip dengan operator matematika.
        Harus merupakan member function atau extension function, memiliki satu parameter, dan parameter tidak boleh
        generic atau memiliki nilai default.
*/
