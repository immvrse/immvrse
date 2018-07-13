package com.example.samson.immvrse

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.example.samson.immvrse.databinding.ActivitySignupBinding

class SignUpActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val binding = DataBindingUtil.setContentView<ActivitySignupBinding>(this, R.layout.activity_signup)

        binding.signUp.setOnClickListener {
            val intent = Intent(this, OnBoardingActivity::class.java)
            startActivity(intent)
        }

        binding.signIn.setOnClickListener {
            val intent = Intent(this, RegistrationSuccessActivity::class.java)
            startActivity(intent)
        }
    }
}
