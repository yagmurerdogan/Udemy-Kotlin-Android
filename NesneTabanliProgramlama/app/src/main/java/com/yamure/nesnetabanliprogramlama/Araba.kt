package com.yamure.nesnetabanliprogramlama

class Araba(var renk:String = "kırmızı"
            ,var hiz:Int = 10
            ,var calisiyorMu:Boolean = false) {

    lateinit var otobus: Otobus

    fun calistir() {
        calisiyorMu = true
    }

    fun durdur() {
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int) {
        hiz = hiz + kacKm
    }

    fun yavasla(kacKm:Int){
        hiz = hiz - kacKm
    }

    fun bilgiAl() {
        println("Renk: $renk")
        println("Hız: $hiz")
        println("Çalışıyor Mu?: $calisiyorMu")
    }
}