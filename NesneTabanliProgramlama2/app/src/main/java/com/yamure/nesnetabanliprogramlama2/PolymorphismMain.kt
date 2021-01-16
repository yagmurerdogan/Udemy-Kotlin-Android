package com.yamure.nesnetabanliprogramlama2

fun main(){
    val hayvan:Hayvan = Kopek() //superclass - subclass
    hayvan.sesCikar() // hav hav

    val hayvan1:Hayvan = Kedi()
    hayvan1.sesCikar() //meow :3
}