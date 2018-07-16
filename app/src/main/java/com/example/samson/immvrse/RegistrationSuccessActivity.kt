package com.example.samson.immvrse

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.samson.immvrse.databinding.ActivityRegistrationSuccessBinding
import kotlinx.android.synthetic.main.activity_registration_success.*

class RegistrationSuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityRegistrationSuccessBinding>(this, R.layout.activity_registration_success)
        binding.root

        button.setOnClickListener {
            startActivity(Intent(this, OnBoardingActivity::class.java))
        }
    }

}