package com.example.samson.immvrse.news_feed

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.samson.immvrse.VideoViewerActivity
import com.example.samson.immvrse.databinding.ViewNewsFeedBinding


class NewsFeedAdapter(private val context: Context) : RecyclerView.Adapter<NewsFeedViewHolder>() {

    lateinit var binding: ViewNewsFeedBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsFeedViewHolder {
        binding = ViewNewsFeedBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsFeedViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: NewsFeedViewHolder, position: Int) {
        binding.newsFeedImage.setOnClickListener {
            val intent = Intent(context, VideoViewerActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return 1
    }
}
