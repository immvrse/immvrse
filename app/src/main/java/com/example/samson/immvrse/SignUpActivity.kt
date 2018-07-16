package com.example.samson.immvrse

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.method.PasswordTransformationMethod
import kotlinx.android.synthetic.main.activity_signup.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        sign_up.setOnClickListener {
            startActivity(Intent(this, RegistrationSuccessActivity::class.java))
        }

        sign_in.setOnClickListener {
            startActivity(Intent(this, LogInActivity::class.java))
        }

        password.typeface = Typeface.DEFAULT
        password.transformationMethod = PasswordTransformationMethod()
    }
}

