package com.dicoding.kotlin

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val statement = "Kotlin is \"Awesome!\""
    val name = "Unicode test: \u00A9"

//    Escaped String memungkinkan kita untuk mengurangi ambiguitas nilai yang berada di dalam sebuah String.
//    \t: menambah tab ke dalam teks.
//    \n: membuat baris baru di dalam teks.
//    \’: menambah karakter single quote kedalam teks.
//    \”: menambah karakter double quote kedalam teks.
//    \\: menambah karakter backslash kedalam teks.

    println(statement)
    print(name)
}