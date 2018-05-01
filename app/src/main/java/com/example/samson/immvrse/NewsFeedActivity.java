package com.example.samson.immvrse;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.example.samson.immvrse.databinding.ActivityNewsFeedBinding;


public class NewsFeedActivity extends FragmentActivity {

    ActivityNewsFeedBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_news_feed);

//        binding.menuButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(NewsFeedActivity.this, MenuNavigationActivity.class);
//                startActivity(intent);
//            }
//
    }
}
