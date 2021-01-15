package com.yamure.standartprogramlamayapilari

import java.util.*

fun main() {
    val girdi = Scanner(System.`in`)
    println("Sil (1)")
    println("Ekle (2)")

    val tercih = girdi.nextInt()
    when(tercih) {
        1 -> println("Veri silindi")
        2 -> println("Veri Eklendi")
        else -> println("Geçerli bir seçim yapmadınız")
    }
}