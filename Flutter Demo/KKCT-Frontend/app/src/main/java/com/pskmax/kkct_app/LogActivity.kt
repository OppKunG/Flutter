package com.pskmax.kkct_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)
        supportActionBar?.hide()
    }
}