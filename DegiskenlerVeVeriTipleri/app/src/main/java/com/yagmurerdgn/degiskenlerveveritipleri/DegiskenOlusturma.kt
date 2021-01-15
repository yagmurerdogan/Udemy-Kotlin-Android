package com.yagmurerdgn.degiskenlerveveritipleri

fun main() {
    /*
    var kalıcı hafızaya kaydedilmeyen değişkenleri oluştururken kullanılır
    = atama için == karşılaştırma için kullanılır
    tür belirtmeye gerek yoktur
     */
    /*
    --- Değişken İsimlendirme Kuralları---
    Case sensitive'dir.
    Rakamla başlayamaz
    @ $ ve % değişken içerisinde kullanılamaz
     */

    var ogrenciAdi = "Yağmur"
    var ogrenciYas = 21
    var ogrenciBoy = 1.98
    var ogrenciBasHarf = 'Y'
    var name:String = "yamure" //tür belirterek yazmak istiyorsak bu şekilde


    println("Öğrencinin adı:  ${ogrenciAdi}")
    println("Öğrenci Yaş: ${ogrenciYas}")
    println("Öğrenci Boy: ${ogrenciBoy}")

    var urun_id:Int = 3416
    var urun_ad:String ="Kol Saati"
    var urun_adet:Int = 100
    var urun_fiyat:Double=109.99
    var urun_tedarikci:String = "Rolex"

    println(urun_ad)
    println(urun_adet)
    println(urun_fiyat)
    println(urun_id)
    println(urun_tedarikci)

}