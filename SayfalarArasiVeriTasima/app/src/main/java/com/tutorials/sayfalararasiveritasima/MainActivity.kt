package com.tutorials.sayfalararasiveritasima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGonder.setOnClickListener {
            val kisi = Kisiler(123456,"Ahmet",1.98)
            val intent = Intent(this@MainActivity,ActivityB::class.java)
            intent.putExtra("mesaj","merhaba")
            intent.putExtra("yas",23)
            intent.putExtra("boy",1.78)
            intent.putExtra("nesne",kisi)
            startActivity(intent)
        }
    }
}