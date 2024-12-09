package com.dicoding.kotlin

fun main() {
    // Anatomi Function :

    // Function Header
    // Visibility Modifier: public (default)
    fun greet(name: String): String {
        // Function Body
        return "Hello, $name!"
    }
    print(greet("Arya"))

    /*
    1. Function Header:
    Bagian ini mencakup visibility modifier, kata kunci fun, nama fungsi, daftar parameter,
    dan nilai kembalian dari fungsi tersebut.

    2. Visibility Modifier:
    Secara default, fungsi ini memiliki visibility modifier public, yang berarti dapat diakses dari luar kelas.

    3. Function Name:
    Nama fungsi menggunakan format camelCase, dimulai dengan huruf kecil dan huruf besar untuk kata berikutnya.

    4. Function Parameter:
    Data atau nilai yang disematkan saat fungsi dipanggil.
    Parameter terdiri dari nama dan tipe, dan dipisahkan oleh tanda koma.

    5. Function Return Type:
    Menentukan nilai yang akan dikembalikan oleh fungsi.
    Jika tidak ditentukan, fungsi akan mengembalikan nilai dengan tipe Unit.

    6. Function Body:
    Ditandai dengan curly braces {} dan berisi logika kode.
    Dalam hal ini, fungsi mengembalikan string yang berisi pesan sapaan.
    */
}