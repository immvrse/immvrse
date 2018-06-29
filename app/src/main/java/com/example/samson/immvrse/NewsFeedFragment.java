package com.example.samson.immvrse;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samson.immvrse.databinding.FragmentNewsFeedBinding;

public class NewsFeedFragment extends Fragment {

    private NewsFeedViewModel viewModel;
    private NewsFeedProvider provider = new NewsFeedProvider();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        FragmentNewsFeedBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_feed, container, false);
        provider.setName("Harry Potter");
        provider.setDescription("You are a Wizard");
        viewModel = new NewsFeedViewModel(provider.getName(), provider.getDescription());
        binding.setViewModel(viewModel);
        binding.newsFeedImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), VideoViewerActivity.class);
                startActivity(intent);
            }
        });
        return binding.getRoot();
    }
}
