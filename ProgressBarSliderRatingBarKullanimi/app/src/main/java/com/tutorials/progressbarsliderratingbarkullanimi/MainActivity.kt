package com.tutorials.progressbarsliderratingbarkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonBasla.setOnClickListener {
            progressBar.visibility = View.VISIBLE
        }

        buttonDur.setOnClickListener {
            progressBar.visibility = View.INVISIBLE
        }

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                textViewSonuc.text = "Sonuç: $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        buttonGoster.setOnClickListener {
            val gelenIlerleme = seekBar.progress
            val gelenOylama = ratingBar.rating

            Log.e("ilerleme",gelenIlerleme.toString())
            Log.e("oylama",gelenOylama.toString())
        }
    }
}