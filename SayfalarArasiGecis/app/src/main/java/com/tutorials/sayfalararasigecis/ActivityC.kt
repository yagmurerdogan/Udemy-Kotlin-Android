package com.tutorials.sayfalararasigecis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }

    override fun onBackPressed() {
        val intent = Intent(this@ActivityC,MainActivity::class.java)
        startActivity(intent)
    }
}