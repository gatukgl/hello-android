package com.example.myandroid.kotlin

fun main() {
    val name = "Gatuk"
    println("hello world ${name[0]}!")
    println(name)

    // Switch-Case
    val x = 1
    when(1) {
        1 -> print("1")
        2 -> print("2")
    }

    // for in
    for (i: Int in 1..3) {
        print(i)
    }

    // using functional programming
    var fruits = listOf<String>("banana", "apple")
    fruits.filter { item -> item == "banana" }

    // extension
    fun String.removeDash(): String {
        return replace("-", "")
    }

//    fun String.removeDash(): String = replace("-", "")

    // Lambda expression
}