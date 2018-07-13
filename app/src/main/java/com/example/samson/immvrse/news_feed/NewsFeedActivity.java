package com.example.samson.immvrse.news_feed;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.example.samson.immvrse.NewsFeedViewModel;
import com.example.samson.immvrse.R;
import com.example.samson.immvrse.databinding.ActivityNewsFeedBinding;


public class NewsFeedActivity extends FragmentActivity {

    private ActivityNewsFeedBinding binding;
    private NewsFeedViewModel newsFeedViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_news_feed);
        binding.getRoot();
        binding.setViewModel(newsFeedViewModel);
        binding.executePendingBindings();
    }

}
