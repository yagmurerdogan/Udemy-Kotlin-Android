package com.yamure.standartprogramlamayapilari

fun main() {
    /*
    switch yapısının adı değişmiş halidir
    esle if yapısının daha pratik kullanımıdır
    case denilen durumlar sağlanırsa kod çalışır
     */

    var x:Int = 5
    when(x) {
        1 -> println("x, 1'e eşittir")
        2 -> println("x, 2'ye eşittir")
        else -> {
            println("x, 1 veya 2'ye eşit değildir")
        }
    }
}