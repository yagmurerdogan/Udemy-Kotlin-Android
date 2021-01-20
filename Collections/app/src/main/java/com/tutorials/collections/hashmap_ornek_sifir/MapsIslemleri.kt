package com.tutorials.collections.hashmap_ornek_sifir

fun main() {
    val sayilar = mapOf<Int,String>(1 to "Bir", 2 to "İki")
    val oranlar = mutableMapOf<Double,String>(1.5 to "Oran1",3.4 to "Oran2")
    val iller = HashMap<Int,String>()
    iller.put(1,"Adana")
    iller.put(34,"İstanbul")
    iller.put(37,"Kastamonu")
    println(iller.toString())

    iller.put(34,"Yeni İstanbul")
    println(iller.toString())

    println(iller.get(34)) //İstanbul
    println(iller.size)
    println(iller.count())
    println(iller.isEmpty())
    println(iller.containsKey(1)) //true
    println(iller.containsValue("İstanbul")) //true

    for ((anahtar,deger) in iller){
        println("$anahtar : $deger")
    }

    iller.remove(1)
    println(iller.toString())

    iller.clear()
    println(iller.toString())

}