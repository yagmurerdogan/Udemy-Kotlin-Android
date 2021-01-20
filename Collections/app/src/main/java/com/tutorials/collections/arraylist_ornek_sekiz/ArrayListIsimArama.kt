package com.tutorials.collections.arraylist_ornek_sekiz

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val girdi = Scanner(System.`in`)
    val isimler = ArrayList<String>()
    isimler.add("ahmet")
    isimler.add("mehmet")
    isimler.add("zeynep")
    isimler.add("sedat")
    isimler.add("ercan")

    println("Aratmak için isim giriniz.")
    val isim = girdi.next()

    for(i in isimler){
        if(i == isim){
            println("isim mevcut")
            break //döngüyü durdur
        }
    }
}