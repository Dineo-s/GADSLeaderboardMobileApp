package com.libraries.android.gadsleaderboardmobileapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        val mHandler = Handler()
        mHandler.postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
        }, 3000L)
    }
}