package com.yagmurerdgn.degiskenlerveveritipleri

class GlobalVeLocalDegisken {
    var x = 10 // Global degisken
    var y = 20 // Global degisken

    fun topla() {
        var x = 40 // Local degisken
        x = x + y
        /*
        burada x lokal y global degiskendir
        lokal degisken global degiskene baskın gelmiştir
        lokal değişken değeri geçerlidir
         */
        print(x)
    }
}