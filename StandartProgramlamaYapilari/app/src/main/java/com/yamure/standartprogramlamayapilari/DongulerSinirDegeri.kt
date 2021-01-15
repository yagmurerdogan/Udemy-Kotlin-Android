package com.yamure.standartprogramlamayapilari

fun main() {
    // 3-6
    for(i in 3..6){
        println(i)
    }
    var sayac = 3
    while(sayac < 7) {
        println(sayac)
        sayac += 1
    }

    //0-8 2'şer

    for(i in 0..8 step 2) {
        println(i)
    }

    var sayac1 = 0
    while(sayac1 < 9) {
        println(sayac1)
        sayac1 += 2
    }

    // 8-0 2'şer
    for (i in 8 downTo 0 step 2) {
        println(i)
    }
    var sayac2 = 8
    while(sayac2 > -1) {
        println(sayac2)
        sayac2 -= 2
    }
}