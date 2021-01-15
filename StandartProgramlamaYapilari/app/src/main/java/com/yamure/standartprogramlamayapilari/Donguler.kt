package com.yamure.standartprogramlamayapilari

fun main() {
    for( i in 3..5) {
        println(i)
    }

    // 10-20 arası 5'er

    var baslangic = 10
    var bitis = 20
    var artis = 5
    for(a in baslangic..bitis step artis){
        println(a)
    }

    // 20-10 arası 2'şer

    for (b in 20 downTo 10 step 2){
        println(b)
    }

    //1-5 ve 5 dahil değil ise

    for(c in 1 until 5) {
        println(c)
    }

    var sayac = 1
    while(sayac < 4) {
        println(sayac)
        sayac += 1
    }


}