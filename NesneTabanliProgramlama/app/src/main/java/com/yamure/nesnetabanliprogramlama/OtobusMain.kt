package com.yamure.nesnetabanliprogramlama

fun main() {
    val kamilKoc = Otobus(50,"Bursa","Ankara",10)
    kamilKoc.bilgiAl()

    kamilKoc.kapasite = 100
    kamilKoc.nereye = "İzmir"
    kamilKoc.nereden = "İstanbul"
    kamilKoc.mevcutYolcu = 30

    kamilKoc.bilgiAl()

    kamilKoc.yolcuAl(20)
    kamilKoc.bilgiAl()

    kamilKoc.yolcuIndir(40)
    kamilKoc.bilgiAl()
}