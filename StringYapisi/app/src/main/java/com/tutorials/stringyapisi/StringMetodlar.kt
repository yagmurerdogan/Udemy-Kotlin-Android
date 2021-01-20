package com.tutorials.stringyapisi

fun main() {
    val str1 = "Merhaba"
    println(str1.subSequence(0,3))
    val str2 = "Merhaba"
    if (str2.contains("x")){
        println("içeriyor")
    }else{
        println("içermiyor")
    }
    val str3 = "Merhaba"
    println(str3.toUpperCase())
    println(str3.toLowerCase())

    val str4 = "Merhaba nasılsın?"
    val dizi = str4.split(" ")
    for(d in dizi){
        println(d)
    }

    val str5 = " Merhaba "
    println(str5.trim())
}