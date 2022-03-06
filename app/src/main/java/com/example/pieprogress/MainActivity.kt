package com.example.pieprogress

import android.graphics.*
import android.graphics.Paint.Align
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.CountDownTimer
import android.util.Log
import android.widget.SeekBar


class MainActivity : AppCompatActivity() {
    var mPieAndBGprogress: PieAndBGprogressView? = null
    var currentProgress: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        mPieAndBGprogress = findViewById(R.id.pieAndBgProgress)

        val handler = Handler()

        handler.postDelayed(object : Runnable {

            override fun run() {
                if (currentProgress < 100) {
                    currentProgress += 1
                    mPieAndBGprogress!!.setProgress(currentProgress)
                }

                handler.postDelayed(this, 50)
            }
        }, 100)

    }
}
