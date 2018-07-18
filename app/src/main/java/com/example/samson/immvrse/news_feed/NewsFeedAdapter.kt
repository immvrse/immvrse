package com.example.samson.immvrse.news_feed

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.samson.immvrse.VideoViewerActivity
import kotlinx.android.synthetic.main.view_news_feed.view.*

class NewsFeedAdapter(private val context: Context) : RecyclerView.Adapter<NewsFeedViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsFeedViewHolder {
        return NewsFeedViewHolder(LayoutInflater.from(parent.context).inflate(viewType, parent, false))
    }

    override fun onBindViewHolder(holder: NewsFeedViewHolder, position: Int) {
        holder.itemView.news_feed_image.setOnClickListener {
            val intent = Intent(context, VideoViewerActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return 1
    }
}
