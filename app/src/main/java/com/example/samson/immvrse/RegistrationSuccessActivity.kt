package com.example.samson.immvrse

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.samson.immvrse.databinding.ActivityRegistrationSuccessBinding

class RegistrationSuccessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityRegistrationSuccessBinding>(this, R.layout.activity_registration_success)
    }

}