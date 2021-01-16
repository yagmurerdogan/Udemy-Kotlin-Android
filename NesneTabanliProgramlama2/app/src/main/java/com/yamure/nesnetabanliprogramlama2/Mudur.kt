package com.yamure.nesnetabanliprogramlama2

class Mudur:Personel() {
    fun iseAl(p:Personel) {
        p.iseAlindi()
    }

    fun terfiEttir(p:Personel) {

        if(p is Ogretmen) {
            p.maasArttir()  // (p as Ogretmen).maasArttir() //downcasting
        }

        if(p is Isci) {
            println("İşçiler terfi alamaz")
        }
    }
}