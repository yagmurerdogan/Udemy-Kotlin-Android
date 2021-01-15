package com.yamure.standartprogramlamayapilari

import java.util.*

fun main(){
    val girdi = Scanner(System.`in`)
    println("Toplama(1)")
    println("Çıkarma(2)")
    println("Çarpma(3)")
    println("Bölme(4)")

    val tercih = girdi.nextInt()

    println("Birinci sayıyı giriniz")
    val sayi1 = girdi.nextInt()

    println("İkinci sayıyı giriniz")
    val sayi2 = girdi.nextInt()

    if(tercih == 1) {
        val toplam = sayi1 + sayi2
        println("Sonuç: $toplam")
    } else if(tercih ==2) {
        val cikarma = sayi1- sayi2
        println("Sonuç: $cikarma")
    } else if(tercih == 3) {
        val carpim = sayi1 * sayi2
        println("Sonuç: $carpim")
    } else if(tercih == 4) {
        val bolum = sayi1 / sayi2
        println("Sonuç: $bolum")
    }else{
        println("Geçerli bir tuşlama yapmadınız")
    }

}