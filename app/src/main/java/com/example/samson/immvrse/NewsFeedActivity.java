package com.example.samson.immvrse;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.example.samson.immvrse.databinding.ActivityNewsFeedBinding;


public class NewsFeedActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityNewsFeedBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_news_feed);
    }
}
