package com.yamure.standartprogramlamayapilari

fun main() {
    for(i in 1..5){
        if(i==3) {
            break // döngüyü durdurur
        }
        println("Döngü 1: $i")
    }

    for (i in 1..5) {
        if(i==3) {
            continue //bu adımı atla demek
        }
        println("Döngü 2: $i")
    }
}