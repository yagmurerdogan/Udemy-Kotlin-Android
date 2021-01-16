package com.yamure.nesnetabanliprogramlama2

fun main() {
    val adres = Adres("İstanbul","Ümraniye")
    val kisi = Kisiler1("Yağmur",21,adres)

    println("Kişi Ad: ${kisi.ad}")
    println("Kişi Yaş: ${kisi.yas}")
    println("Kişi İl: ${kisi.adres.il}")
    println("Kişi İlçe: ${kisi.adres.ilce}")
}