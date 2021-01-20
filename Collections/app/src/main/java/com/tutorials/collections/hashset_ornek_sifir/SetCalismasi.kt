package com.tutorials.collections.hashset_ornek_sifir

fun main() {
    val meyveler = setOf("Çilek","Muz","Elma","Kivi")

    val iller = mutableSetOf("Bursa","Istanbul","Ankara","Izmir")

    val sayilar = HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)
    println(sayilar.toString())

    sayilar.add(20)
    println(sayilar.toString()) //20 zaten yer aldığı için tekrar eklenmez

    sayilar.add(21)
    println(sayilar.toString())

    println(sayilar.elementAt(1))
    println(sayilar.count())

    println(sayilar.isEmpty()) //false
    println(sayilar.contains(20)) //true

    for(s in sayilar) {
        println(s)
    }

    for((i,s) in sayilar.withIndex()){
        println("$i. sayi : $s")
    }

    sayilar.remove(1)
    println(sayilar.toString())

    sayilar.clear()
    println(sayilar.toString())
}