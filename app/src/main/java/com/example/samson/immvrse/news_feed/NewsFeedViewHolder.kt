package com.example.samson.immvrse.news_feed

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.View

import com.example.samson.immvrse.databinding.ViewNewsFeedBinding

class NewsFeedViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val binding: ViewNewsFeedBinding? = DataBindingUtil.bind(itemView)
}
