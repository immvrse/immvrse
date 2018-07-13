package com.example.samson.immvrse

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.graphics.Typeface
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import com.example.samson.immvrse.databinding.ActivityLogInBinding

class LogInActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        val binding = DataBindingUtil.setContentView<ActivityLogInBinding>(this, R.layout.activity_log_in)

        binding.signUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.signInButton.setOnClickListener {
            val intent = Intent(this, OnBoardingActivity::class.java)
            startActivity(intent)
        }

        binding.password.typeface = Typeface.DEFAULT
        binding.password.transformationMethod = PasswordTransformationMethod()
    }
}
