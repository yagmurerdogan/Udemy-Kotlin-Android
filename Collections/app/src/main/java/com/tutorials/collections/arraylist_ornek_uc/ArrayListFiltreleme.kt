package com.tutorials.collections.arraylist_ornek_uc

fun main() {
    val o1 = Ogrenci(1,"Ahmet","11/F")
    val o2 = Ogrenci(2,"Zeynep","10/A")
    val o3 = Ogrenci(3,"Ceyda","12/A")
    val o4 = Ogrenci(4,"Mehmet","9/Z")
    val o5 = Ogrenci(5,"Yasin","11/F")

    val ogrenciler = ArrayList<Ogrenci>()
    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)

    //val sonucListe = ogrenciler.filter {it.no > 2 }
    val sonucListe = ogrenciler.filter {(it.ad).contains("a") }
    // val sonucListe = ogrenciler.filter{ it.sinif == "11/F"}


    for(o in sonucListe){
        println("*******************")
        println("Öğrenci no: ${o.no}")
        println("Öğrenci ad: ${o.ad}")
        println("Öğrenci sınıf: ${o.sinif}")
    }
}