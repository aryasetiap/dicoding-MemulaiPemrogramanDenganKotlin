package com.dicoding.kotlin

// Contoh penggunaan nullable receiver dalam Kotlin

// Extension function dengan nullable receiver type
fun String?.printLength() {
    if (this != null) {
        println("Panjang string: ${this.length}")
    } else {
        println("String ini null")
    }
}

fun main() {
    val text: String? = null
    text.printLength() // Output: String ini null

    val text2: String? = "Kotlin"
    text2.printLength() // Output: Panjang string: 6
}

/*
    Nullable Receiver dalam Kotlin:

    Nullable Receiver: Kotlin memungkinkan kita untuk mendeklarasikan extension dengan nullable receiver type. Ini berarti
        extension tersebut bisa dipanggil pada objek yang nilainya null.

    If Expression: Digunakan untuk memeriksa apakah receiver object bernilai null. Jika tidak, receiver object akan
        secara otomatis di-casting menjadi tipe non-null.

    Elvis Operator: Alternatif lain untuk memeriksa nullability adalah dengan menggunakan elvis operator (?:).

    Penggunaan: Nullable receiver berguna ketika kita memiliki objek yang mungkin bernilai null, sehingga kita tidak
        perlu menggunakan operator safe call (?.) setiap kali memanggil extension tersebut.
*/