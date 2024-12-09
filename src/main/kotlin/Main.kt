package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
    Boolean adalah tipe data yang hanya memiliki dua nilai, yaitu true dan false.
    Ada tiga operator utama yang digunakan dengan Boolean:
    */

    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    /*
    1. Conjunction (AND)
    Operator && mengembalikan nilai true jika semua kondisi yang dievaluasi bernilai true.
    */
    val isOpen = now >= officeOpen && now <= officeClosed

    println("Office is open : $isOpen")

    /*
    2. Disjunction (OR)
    Operator || mengembalikan nilai true jika salah satu kondisi yang dievaluasi bernilai true.
    */
    val isClose = now < officeOpen || now > officeClosed

    println("Office is closed : $isClose")

    /*
    3. Negation (NOT)
    Operator ! digunakan untuk melakukan negasi pada hasil evaluasi kondisi, mengubah true menjadi false dan sebaliknya.
    */
    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }
}