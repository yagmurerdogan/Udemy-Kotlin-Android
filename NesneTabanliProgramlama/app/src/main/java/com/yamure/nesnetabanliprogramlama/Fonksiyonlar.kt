package com.yamure.nesnetabanliprogramlama

fun main() {
    //no parameter no return type
    fun selamla() {
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }
    selamla()

    //no parameter yes return type
    fun selamla1():String{
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }
    val gelenSonuc = selamla1()
    println(gelenSonuc)

    //yes parameter no return type
    fun selamla2(isim:String){
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }
    selamla2("Zeynep")

    //yes parameter yes return type
    fun toplama(sayi1:Int,sayi2:Int):Int{
        val toplam = sayi1 + sayi2
        return toplam
    }
    val t = toplama(100,200)
    println(t)

}