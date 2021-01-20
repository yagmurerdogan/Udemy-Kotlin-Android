package com.tutorials.collections.arraylist_ornek_dokuz

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val girdi = Scanner(System.`in`)

    var sayac = 1

    val ogrenciler = ArrayList<Ogrenci>()

    while (true){

        println("Öğrenci Adı Giriniz:")
        val ad = girdi.next()

        println("Öğrenci Sınıfı Giriniz")
        val sinif = girdi.next()

        val yeniOgrenci = Ogrenci(sayac,ad,sinif)
        sayac += 1

        ogrenciler.add(yeniOgrenci)

        println("çıkmak için -> 1\nDevam etmek için diğer sayılar")
        val cikis = girdi.nextInt()

        if(cikis == 1) {

            for(ogrenci in ogrenciler){
                println("*************")
                println("Öğrenci ad: ${ogrenci.ad}")
                println("Öğrenci no: ${ogrenci.no}")
                println("Öğrenci sınıf: ${ogrenci.sinif}")
            }
            println("Çıkış yapıldı.")
            break
        }
    }
}