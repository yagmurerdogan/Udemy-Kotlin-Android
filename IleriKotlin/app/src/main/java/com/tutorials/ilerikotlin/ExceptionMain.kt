package com.tutorials.ilerikotlin

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.IndexOutOfBoundsException

fun main() {
    val x = 10
    val y = 0

    val dizi = Array<Int>(2){0}

    try {
        println("Sonuç: ${x/y}")
        println("işlem tamam")
        dizi[4] = 8
    }catch (e:Exception){
        if (e is ArithmeticException){
            println("Sayı sıfıra bölünemez")
        }
        if(e is ArrayIndexOutOfBoundsException){
            println("Dizinin boyutunu aştınız")
        }
    }


}