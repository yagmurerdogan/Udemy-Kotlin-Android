package com.yamure.nesnetabanliprogramlama

fun main() {
    infix fun Int.carpi(sayi:Int):Int{
        return this *sayi
    }
    val sonuc = 5 carpi 2
    println(sonuc)
}