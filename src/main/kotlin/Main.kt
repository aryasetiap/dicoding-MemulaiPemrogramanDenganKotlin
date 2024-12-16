package com.dicoding.kotlin

// Mengimpor package com.dicoding.oop.utils
import com.dicoding.kotlin.utils.*

fun main() {
    // Memanggil fungsi sayHello() dari package com.dicoding.oop.utils
    sayHello()

    // Menggunakan fungsi areaOfCircle() dari package com.dicoding.oop.utils
    val radius = 5.0
    println("Luas lingkaran dengan radius $radius adalah ${areaOfCircle(radius)}")

    // Menggunakan variabel PI dari package com.dicoding.oop.utils
    println("Nilai PI adalah $PI")
}

/*
    Membuat Package Baru dalam Kotlin:

    Pengertian Package: Package adalah pembungkus dari kelas, fungsi, atau variabel yang memiliki fungsionalitas serupa.
        Package membantu mengelompokkan dan mengorganisir kode.

    Penamaan Package: Idealnya, package dituliskan dengan awalan nama domain perusahaan yang dibalik, diikuti dengan
        nama package yang akan digunakan. Contoh: com.dicoding.oop.utils.

    Membuat Package: Untuk membuat package, buat folder package pada berkas proyek. Di IntelliJ IDEA, klik kanan pada
        folder src, pilih New > Package, dan ketikkan nama package.

    Menambahkan Berkas ke Package: Setelah membuat package, tambahkan berkas Kotlin ke dalam package tersebut. Misalnya,
        buat berkas MyMath.kt dan tambahkan fungsi atau variabel yang diperlukan.

    Mengimpor Package: Untuk menggunakan fungsi atau variabel dari package, impor package tersebut menggunakan keyword
        import. Anda bisa mengimpor seluruh fungsi dan variabel dalam package dengan menggunakan tanda bintang (*).
*/
