package com.tutorials.collections.hashmap_ornek_bir

fun main() {
    val o1 = Ogrenci(1,"Ahmet","11/F")
    val o2 = Ogrenci(2,"Zeynep","10/R")
    val o3 = Ogrenci(3,"Ceyda","12/A")

    val ogrenciler = HashMap<Int,Ogrenci>()
    ogrenciler.put(o1.no,o1)
    ogrenciler.put(o2.no,o2)
    ogrenciler.put(o3.no,o3)

    for ((ogrenciNo,nesne) in ogrenciler){
        println("*****************")
        println("Öğrenci No: ${ogrenciNo}")
        println("Öğrenci Ad: ${nesne.ad}")
        println("Öğrenci Sınıf: ${nesne.sinif}")
    }
}