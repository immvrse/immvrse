package com.example.samson.immvrse.news_feed

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.samson.immvrse.R
import kotlinx.android.synthetic.main.fragment_news_feed.*

class NewsFeedFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         return inflater.inflate(R.layout.fragment_news_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = NewsFeedAdapter(requireContext())
        news_feed.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        news_feed.adapter = adapter
    }
}
