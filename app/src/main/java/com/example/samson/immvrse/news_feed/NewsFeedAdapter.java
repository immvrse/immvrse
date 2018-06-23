package com.example.samson.immvrse.news_feed;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samson.immvrse.R;
import com.example.samson.immvrse.VideoViewerActivity;
import com.example.samson.immvrse.databinding.ViewNewsFeedBinding;


public class NewsFeedAdapter extends RecyclerView.Adapter<NewsFeedViewHolder> {

    private Context context;

    public NewsFeedAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public NewsFeedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewNewsFeedBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.view_news_feed, parent, false);
        return new NewsFeedViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull NewsFeedViewHolder holder, int position) {
        holder.getBinding().newsFeedImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, VideoViewerActivity.class);
                context.startActivity(intent);
            }
        });
        }

    @Override
    public int getItemCount() {
        return 1;
    }
}
