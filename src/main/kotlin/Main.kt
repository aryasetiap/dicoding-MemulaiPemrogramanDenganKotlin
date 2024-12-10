package com.dicoding.kotlin

fun main() {
    /*
    Range dalam pemrograman Kotlin.

    Range adalah tipe data unik yang memungkinkan kita menentukan nilai awal dan nilai akhir. Range direpresentasikan
    dengan operator .., fungsi rangeTo(), atau downTo(). Kita bisa menentukan jarak antara dua nilai yang dicakup oleh
    Range menggunakan properti step. Kotlin mendukung beberapa tipe integral seperti IntRange, LongRange, dan CharRange,
    sehingga kita bisa menggunakan nilai numerik maupun karakter dalam Range. Selain itu, kita juga bisa memeriksa
    apakah suatu nilai ada atau tidak ada dalam cakupan Range menggunakan kata kunci in dan !in.
    */

    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}
