package com.tutorials.collections.arraylist_ornek_bes

fun main() {
    val sayilar = ArrayList<Int>()

    sayilar.add(1)
    sayilar.add(2)
    sayilar.add(3)
    sayilar.add(4)
    sayilar.add(5) //[1,22,3,4,5] -> [2,4,6,8,10]

    for ((indeks,sayi) in sayilar.withIndex()){
        val sonuc = sayi * 2

        sayilar[indeks] = sonuc
    }

    for(s in sayilar) {
        println(s)
    }
}