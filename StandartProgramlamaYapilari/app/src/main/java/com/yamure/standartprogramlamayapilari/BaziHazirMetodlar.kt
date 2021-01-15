package com.yamure.standartprogramlamayapilari

import java.lang.Math.*
import kotlin.math.pow
import kotlin.random.Random

fun main() {

    for (i in 1..10) {
        val rastgeleSayi = Random.nextInt(0,10) //0 ile 9
        println(rastgeleSayi)
    }

    val c = ceil(6.5)
    println("c: $c")

    val f = floor(6.5)
    println("f: $f")

    val s = sqrt(4.0)
    println("s: $s")

    val a = abs(-10)
    println("a: $a")

    val mx = max(100,200)
    val mn = min(50,90)
    println("max: $mx")
    println("min: $mn")

    val p = 2.0.pow(3.0) // 2^3
    println("p: $p")

}