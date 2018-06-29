package com.example.samson.immvrse;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;

import com.example.samson.immvrse.databinding.ActivityLogInBinding;

public class LogInActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        ActivityLogInBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_log_in);

        binding.signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        binding.signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this, OnBoardingActivity.class);
                startActivity(intent);
            }
        });

        binding.password.setTypeface(Typeface.DEFAULT);
        binding.password.setTransformationMethod(new PasswordTransformationMethod());
    }
}
