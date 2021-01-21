package com.tutorials.sayfalararasiveritasimagorselnesne

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGonder.setOnClickListener {

            val alinanVeri = editTextGirdi.text.toString()
            val yeniIntent = Intent(this@MainActivity,ActivityB::class.java)
            yeniIntent.putExtra("mesaj",alinanVeri)
            startActivity(yeniIntent)
        }
    }
}