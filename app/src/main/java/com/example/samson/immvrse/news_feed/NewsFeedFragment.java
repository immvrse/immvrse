//package com.example.samson.immvrse.news_feed;
//
//import android.databinding.DataBindingUtil;
//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.support.v7.widget.LinearLayoutManager;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import com.example.samson.immvrse.R;
//import com.example.samson.immvrse.databinding.FragmentNewsFeedBinding;
//
//public class NewsFeedFragment extends Fragment {
//    FragmentNewsFeedBinding binding;
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_feed, container, false);
//        return binding.getRoot();
//    }
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        NewsFeedAdapter adapter = new NewsFeedAdapter(getContext());
//        binding.newsFeed.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
//        binding.newsFeed.setAdapter(adapter);
//    }
//}
