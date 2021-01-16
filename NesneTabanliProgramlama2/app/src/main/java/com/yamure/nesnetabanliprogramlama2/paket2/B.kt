package com.yamure.nesnetabanliprogramlama2.paket2
import com.yamure.nesnetabanliprogramlama2.paket1.A

class B : A() {

    fun fonksiyon(){

        println(varsayilanDegisken)
        println(publicDegisken)
        //println(nesne.privateDegisken) -> erişilemez
        println(internalDegisken)
        println(protectedDegisken) //-> erişilemez, erişilmesi için A önüne open yazıp kalıtım almasını sağlamak lazım
    }
}