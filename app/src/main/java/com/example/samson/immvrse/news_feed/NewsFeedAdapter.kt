package com.example.samson.immvrse.news_feed

import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.samson.immvrse.R
import com.example.samson.immvrse.VideoViewerActivity
import com.example.samson.immvrse.databinding.ViewNewsFeedBinding


class NewsFeedAdapter(private val context: Context) : RecyclerView.Adapter<NewsFeedViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsFeedViewHolder {
        val binding = DataBindingUtil.inflate<ViewNewsFeedBinding>(LayoutInflater.from(parent.context), R.layout.view_news_feed, parent, false)
        return NewsFeedViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: NewsFeedViewHolder, position: Int) {
        holder.binding.newsFeedImage.setOnClickListener {
            val intent = Intent(context, VideoViewerActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return 1
    }
}
