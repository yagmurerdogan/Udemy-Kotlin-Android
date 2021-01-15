package com.yamure.standartprogramlamayapilari

import java.util.*

fun main() {
    val girdi = Scanner(System.`in`)

    while (true) {
        println("Sayı Giriniz")
        val sayi = girdi.nextInt()
        val sonuc = sayi %2

        if(sonuc == 0) {
            println("Çift sayıdır")
        }
        if(sonuc == 1) {
            println("Tek Sayıdır")
        }
        println("Çıkmak için (1) \n Devam etmek için diğer sayıları giriniz")
        val cikis = girdi.nextInt()

        if (cikis == 1) {
            println("Çıkış yapıldı")
            break
        }
    }
}