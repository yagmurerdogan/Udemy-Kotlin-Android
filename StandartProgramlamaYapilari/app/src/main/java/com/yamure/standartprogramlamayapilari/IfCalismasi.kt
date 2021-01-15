package com.yamure.standartprogramlamayapilari

fun main() {
    var yas = 19
    var isim = "Yağmur"

    //Örnek 1

    if(yas >= 18) {
        println("Reşitsiniz")
    }

    //Örnek 2

    if(yas >= 18) {
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz.")
    }

    //Örnek 3

    if(isim=="Ahmet") {
        println("Merhaba Ahmet")
    }else {
        println("Tanınmayan kişi")
    }

    //Örnek 4

    if(isim=="Ahmet") {
        println("Merhaba Ahmet")
    }else if(isim=="Mehmet") {
        println("Merhaba Mehmet")
    }else{
        println("Tanınmayan kişi")
    }

    //Örnek 5 - Çoklu Şart &&

    var kullaniciAdi = "admin"
    var sifre = 12345
    if(sifre==12345 && kullaniciAdi=="admin") {
        println("Hoşgeldiniz")
    }else{
        println("Hatalı giriş")
    }

    //Örnek 6 - Çoklu Şart ||

    var sinif = 8
    if (sinif==9 || sinif == 10 || sinif == 11) {
        println("AYT sınavına hazırlanabilirsiniz")
    }

    //Örnek 7 kısaltma

    var a = 10
    var b = 10

    if(a == b) println("Eşittir") else println("Eşit Değildir")
}