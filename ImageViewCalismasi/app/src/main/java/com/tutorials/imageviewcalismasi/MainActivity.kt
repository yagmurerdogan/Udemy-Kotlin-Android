package com.tutorials.imageviewcalismasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonResim1.setOnClickListener {
            imageView.setImageResource(R.drawable.resim1)
        }

        buttonResim2.setOnClickListener {
            imageView.setImageResource(resources.getIdentifier("resim2","drawable",packageName))
        }
    }
}