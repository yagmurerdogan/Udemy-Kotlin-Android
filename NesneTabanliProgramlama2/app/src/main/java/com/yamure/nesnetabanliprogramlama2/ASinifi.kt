package com.yamure.nesnetabanliprogramlama2

class ASinifi {
    /*
Bir değişkenin veya metodun, bulunduğu sınıftan(class) nesne oluşturmaya
gerek kalmadan erişilmek istenirse kullanılır.
bunu companion object ile yaparız
 */
    companion object{
        var x = 10

        fun metod(){
            println("Merhaba")
        }
    }
}