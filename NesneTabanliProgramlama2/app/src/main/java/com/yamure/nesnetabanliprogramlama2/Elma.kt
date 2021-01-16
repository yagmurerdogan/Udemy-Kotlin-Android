package com.yamure.nesnetabanliprogramlama2

open class Elma:Eatable,Squeezable {
    override fun howToEat() {
        println("Dilimle Ve Ye")
    }

    override fun howToSqueeze() {
        println("Meyve Sıkacağı İle Sık")
    }
}