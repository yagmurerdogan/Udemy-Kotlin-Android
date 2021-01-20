package com.tutorials.collections

fun main() {
    val meyveler = ArrayList<String>()
    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    for(meyve in meyveler) {
        println("Sonuç: $meyve")
    }

    for((indeks,meyve) in meyveler.withIndex()){
        println("Sonuç: $indeks. meyve: $meyve")
    }
}