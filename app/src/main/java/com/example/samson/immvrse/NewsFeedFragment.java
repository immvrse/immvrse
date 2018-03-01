package com.example.samson.immvrse;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samson.immvrse.databinding.FragmentNewsFeedBinding;

public class NewsFeedFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        FragmentNewsFeedBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_feed, container, false);
        return binding.getRoot();
    }
}
