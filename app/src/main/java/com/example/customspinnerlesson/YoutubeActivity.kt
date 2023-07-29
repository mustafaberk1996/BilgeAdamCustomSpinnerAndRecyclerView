package com.example.customspinnerlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.provider.ContactsContract.Data
import android.widget.ProgressBar
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import kotlin.concurrent.timer

class YoutubeActivity : AppCompatActivity() {


    lateinit var rvVideos: RecyclerView
    lateinit var progressBar: ProgressBar

    var countDownTimer: CountDownTimer = object : CountDownTimer(3000, 1000) {
        override fun onTick(millisUntilFinished: Long) {

        }

        override fun onFinish() {
            progressBar.isVisible = false
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        rvVideos = findViewById(R.id.rvVideos)
        progressBar = findViewById(R.id.progressBar)


        countDownTimer.start()

        rvVideos.adapter = VideoAdapter(this, Database.videos)


    }


}