package com.yagmurerdgn.degiskenlerveveritipleri

import java.lang.NumberFormatException

fun main() {
    /*
    Tür dönüşümü 3 ana başlıkta ele alınabilir
    1- Sayısaldan sayısala
    2- Sayısaldan metine
    3- Metinden sayısala
     */

    // Sayısaldan Sayısala Dönüşüm
    var i:Int = 42
    var d:Double = 42.45
    var f:Float = 42.89f

    var sonuc1:Int = d.toInt()
    var sonuc2:Int = f.toInt()
    var sonuc3:Float = i.toFloat()

    //Sayısaldan Metine Dönüşüm
    var sayi1:Int = 42
    var sayi2:Double = 42.45
    var sayi3:Float = 42.89f

    var srt1 = sayi1.toString()
    var srt2 = sayi2.toString()
    var str3 = sayi3.toString()

     // Metinden Sayısala Dönüşüm - metin içinde her zaman sorf sayı yer almaz hata ihtimali yüksektir

    // Yöntem 1
    var str = "48T"
    try {
        val sayi = str.toInt()
    }catch (nfe:NumberFormatException) {
        println("Dönüşümde sorun var")
    }

    //Yöntem 2
    var str0 = "48T"
    val sayi = str.toIntOrNull()
    if(sayi != null) {
        //hata yok işlem yapılabilir
    }else {
        //dönüşüm hatası var
    }

    //Yöntem 3 - Safe call
    var strr = "48T"
    val sayii = strr.toIntOrNull()
    sayii?.let {
        //dönüşümde sorun yoktur
    }

}