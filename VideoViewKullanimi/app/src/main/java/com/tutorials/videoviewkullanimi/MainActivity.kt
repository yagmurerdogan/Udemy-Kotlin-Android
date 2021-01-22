package com.tutorials.videoviewkullanimi

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonBasla.setOnClickListener {
            val adres = Uri.parse("android.resource://"+packageName+"/"+R.raw.video)
            videoView.setVideoURI(adres)
            videoView.start()
        }

        buttonDur.setOnClickListener {
            videoView.stopPlayback()
        }
    }
}