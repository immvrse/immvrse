package com.example.samson.immvrse.news_feed

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.samson.immvrse.R
import com.example.samson.immvrse.databinding.FragmentNewsFeedBinding

class NewsFeedFragment : Fragment() {
    lateinit var binding: FragmentNewsFeedBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_feed, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = NewsFeedAdapter(requireContext())
        binding.newsFeed.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.newsFeed.adapter = adapter
    }
}
