package com.yamure.nesnetabanliprogramlama

fun main(){
    fun toplam(vararg sayilar:Int):Int{
        var sonuc = 0
        for (s in sayilar){
            sonuc += s
        }
        return  sonuc
    }

    val t1 = toplam(1,2,3,4,5)
    println("t1: $t1")
}