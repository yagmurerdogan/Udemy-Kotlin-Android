package com.tutorials.collections.arraylist_ornek_iki

fun main() {
    val k1 = Kisiler(1,"Ahmet")
    val k2 = Kisiler(2,"Zeynep")
    val k3 = Kisiler(3,"Berna")

    val kisilerArrayList = ArrayList<Kisiler>()
    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    println("Önce")
    for(k in kisilerArrayList) {
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("Sayısal küçükten büyüğe")

    val siralamaArrayList = kisilerArrayList.sortedWith(compareBy{it.kisiNo})

    for(k in siralamaArrayList){
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("Sayısal büyükten küçüğe")

    val siralamaArrayList2 = kisilerArrayList.sortedWith(compareByDescending {it.kisiNo })
    for(k in siralamaArrayList2) {
        println("${k.kisiNo} - ${k.kisiAd}")
    }

    println("Harfsel büyükten küçüğe")

    val siralamaArrayList3 = kisilerArrayList.sortedWith(compareByDescending {it.kisiAd})
    for(k in siralamaArrayList3) {
        println("${k.kisiNo} - ${k.kisiAd}")
    }

}