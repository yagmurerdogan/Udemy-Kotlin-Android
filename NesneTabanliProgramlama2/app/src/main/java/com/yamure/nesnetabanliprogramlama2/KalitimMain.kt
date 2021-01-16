package com.yamure.nesnetabanliprogramlama2

fun main() {
    val araba = Araba("kırmızı","otomatik","sedan")

    println(araba.renk)
    println(araba.vites)
    println(araba.kasaTipi)

    val nissan = Nissan("beyaz","manuel","sedan","micra")
    println(nissan.model)
    println(nissan.renk)
    println(nissan.kasaTipi)
}