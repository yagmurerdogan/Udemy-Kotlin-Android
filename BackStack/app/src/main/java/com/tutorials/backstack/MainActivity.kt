package com.tutorials.backstack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGoToB.setOnClickListener {
//            val intent = Intent(this@MainActivity,ActivityB::class.java)
//            startActivity(intent) ancak veri taşınmayacağı için kolay geçişi yapalım;

            startActivity(Intent(this@MainActivity,ActivityB::class.java))

        }
    }
}