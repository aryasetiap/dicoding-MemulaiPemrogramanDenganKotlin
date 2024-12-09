package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var vocal = 'A'

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)

    /*
    Increment dan Decrement dapat digunakan pada tipe data char.
    Karena pada dasarnya setiap Characters merupakan representasi dari Unicode.
    Contoh Unicode A adalah 0041.
    Ketika kita melakukan increment maka hasilnya adalah 0042 yang mana merupakan Unicode dari B.
    */
}