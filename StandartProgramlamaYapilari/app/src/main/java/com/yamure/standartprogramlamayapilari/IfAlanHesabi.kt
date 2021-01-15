package com.yamure.standartprogramlamayapilari

import java.util.*

fun main() {
    val girdi = Scanner(System.`in`)
    println("Dikdörtgen Alanı (1)")
    println("Çember Alanı (2)")

    val secim = girdi.nextInt()
    println("Seçiminiz: $secim")

    if(secim==1) {
        println("Kısa kenarı giriniz:")
        val kisaKenar = girdi.nextInt()

        println("Uzun kenarı giriniz:")
        val uzunKenar = girdi.nextInt()

        println("Dikdörtgen Alanı")
        val dikdortgenAlani = kisaKenar * uzunKenar
        println("Sonuç: $dikdortgenAlani")
    }

    if(secim==2) {
        println("Yarıçapı giriniz:")
        val yariCap = girdi.nextDouble()
        val pi = 3.14
        println("Çember Alanı")
        val cemberAlani = pi * yariCap * yariCap
        println("Sonuç: $cemberAlani")
    }
}