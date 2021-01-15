package com.yamure.standartprogramlamayapilari

import java.util.*

fun main() {
    val girdi = Scanner(System.`in`)
    val isimler = Array<String>(5){""} //{"","","","",""}

    for(i in 0 until isimler.count()) { //0,1,2,3,4
        println("${i}. İsim Giriniz")
        val isim = girdi.next()
        isimler[i] = isim
    }

    for((indeks,isim) in isimler.withIndex()) {
        println("${indeks+1}.isim : $isim")
    }
}