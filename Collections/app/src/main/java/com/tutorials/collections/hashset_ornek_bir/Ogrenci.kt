package com.tutorials.collections.hashset_ornek_bir

class Ogrenci(var no:Int,var ad:String,var sinif:String) {

    override fun hashCode(): Int {
        return this.no
    }

    override fun equals(other: Any?): Boolean {
        if(this.no == (other as Ogrenci).no){
            return true
        }else{
            return false
        }
    }
}