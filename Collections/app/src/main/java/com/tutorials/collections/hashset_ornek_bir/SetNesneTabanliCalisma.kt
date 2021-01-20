package com.tutorials.collections.hashset_ornek_bir

fun main() {
    val o1 = Ogrenci(1,"Ahmet","11/F")
    val o2 = Ogrenci(2,"Zeynep", "10A")
    val o3 = Ogrenci(3,"Ceyda","9/Z")
    val o4 = Ogrenci(1,"Ece","12/A")

    val ogrenciler = HashSet<Ogrenci>()
    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)

    for (o in ogrenciler){
        println("**************")
        println("Öğrenci No: ${o.no}")
        println("Öğrenci Ad: ${o.ad}")
        println("Öğrenci Sınıf: ${o.sinif}")
    }

}