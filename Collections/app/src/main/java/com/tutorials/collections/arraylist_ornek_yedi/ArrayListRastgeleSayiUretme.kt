package com.tutorials.collections.arraylist_ornek_yedi

import kotlin.random.Random

fun main() {
    val sayilar = ArrayList<Int>()

    for (i in 1..100){
        val rastgeleSayi = Random.nextInt(0,101)
        sayilar.add(rastgeleSayi)
    }

    sayilar.sort()
    for (s in sayilar){
        println(s)
    }
}