package com.tutorials.stringyapisi

import java.util.*

fun main() {
    val girdi = Scanner(System.`in`)
    println("Kelimeyi Giriniz:")
    val kelime = girdi.next()

    for(i in kelime.length-1 downTo 0){
        print(kelime[i])
    }
}