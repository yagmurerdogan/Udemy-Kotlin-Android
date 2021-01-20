package com.tutorials.collections

fun main() {
    val meyveler = ArrayList<String>()
    meyveler.add("Çilek")
    meyveler.add("Muz")
    meyveler.add("Elma")
    meyveler.add("Kivi")
    meyveler.add("Kiraz")

    println(meyveler.isEmpty()) //false dönecek
    println(meyveler.count())
    println(meyveler.size)
    println(meyveler.first())
    println(meyveler.last())
    println(meyveler.contains("Kiraz")) //true
    println(meyveler.max())
    /*
    max() yerine -> val max = amplitudes.maxOrNull() ?: 0  öneriliyor artık
     */
    println(meyveler.min())

    meyveler.sort()
    println(meyveler.toString())

    meyveler.reverse() //arraylisti terse çevirmek için kullanılır
    println(meyveler.toString())

    meyveler.removeAt(3)
    println(meyveler.toString())

    meyveler.remove("Kivi")
    println(meyveler.toString())

    meyveler.clear() //listeyi temizlemek için
    println(meyveler.toString())
}