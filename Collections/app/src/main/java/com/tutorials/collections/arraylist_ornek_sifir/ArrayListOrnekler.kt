package com.tutorials.collections

fun main() {
    val liste = ArrayList<String>()
    val liste2 : ArrayList<Int> = ArrayList<Int>()

    val meyveler = ArrayList<String>()
    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler.toString())
    println(meyveler.get(2))

    meyveler.add("Mandalina")
    println(meyveler.toString())

    meyveler[2] = "Ananas"
    println(meyveler.toString())

    meyveler.add(3,"Portakal") //veri kaybı olmadan ekler
    println(meyveler.toString())
}