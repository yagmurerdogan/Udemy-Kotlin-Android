package com.yamure.nesnetabanliprogramlama

fun main() {
    /*
    Global değişken oluştururken değişkene belirli bir değer vermeden oluşturmak isteyebiliriz
    örneğin var str:String = 2 yerine var str:String = null
    değişkeni ? ile tanımlamalıyız
    tanımladıktan sonra kullanılırken ? kullanılırsa null hatasından kaynaklı çökmelerden korunulur
    tanımladıktan sonra kullanırken !! kulllanılırsa bu değişkenin null olabileceğini belirtmiş oluruz
     */

    var str1:String? = null
    //str1?.trim() //? bunu null ise çallıştırma anlamına gelmektedir
    //str1!!.trim() //!! bunu her halikarda çalıştır demek ve null ise çöker

    //3.yöntem
    if(str1 != null){
        str1.trim()
    }
}