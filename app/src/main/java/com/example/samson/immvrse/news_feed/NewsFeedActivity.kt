package com.example.samson.immvrse.news_feed

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import com.example.samson.immvrse.R
import com.example.samson.immvrse.databinding.ActivityNewsFeedBinding


class NewsFeedActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityNewsFeedBinding = DataBindingUtil.setContentView(this, R.layout.activity_news_feed)
        binding.root
        binding.executePendingBindings()
    }

}
