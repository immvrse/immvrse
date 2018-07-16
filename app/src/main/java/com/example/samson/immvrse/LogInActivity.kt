package com.example.samson.immvrse

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.PasswordTransformationMethod
import kotlinx.android.synthetic.main.activity_log_in.*

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        sign_up.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        sign_in_button.setOnClickListener {
            startActivity(Intent(this, OnBoardingActivity::class.java))
        }

        password.typeface = Typeface.DEFAULT
        password.transformationMethod = PasswordTransformationMethod()
    }
}