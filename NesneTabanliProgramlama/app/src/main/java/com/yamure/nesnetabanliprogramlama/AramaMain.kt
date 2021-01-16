package com.yamure.nesnetabanliprogramlama

fun main() {

    val bmw = Araba("kırmızı",10,false)

    bmw.bilgiAl()

    bmw.calisiyorMu = true
    bmw.hiz = 900
    bmw.renk = "beyaz"

    bmw.bilgiAl()

    bmw.durdur()
    bmw.bilgiAl()

    bmw.hizlan(100)
    bmw.bilgiAl()

    bmw.yavasla(50)
    bmw.bilgiAl()

    val sahin = Araba("Sarı",100,true)
    sahin.bilgiAl()

    sahin.hizlan(80)
    sahin.bilgiAl()

}