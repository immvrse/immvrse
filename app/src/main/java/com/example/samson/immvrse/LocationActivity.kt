package com.example.samson.immvrse

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_my_location.*

class LocationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_location)

        not_now_button.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}