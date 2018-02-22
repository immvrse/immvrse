package com.example.samson.immvrse;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OnboardingFragmentFour extends Fragment {

    private String title;
    private int page;

    public static OnboardingFragmentFour newInstance(int page, String title) {
        OnboardingFragmentFour fragment = new OnboardingFragmentFour();
        Bundle bundle = new Bundle();
        bundle.putInt("page", page);
        bundle.putString("title", title);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("page", 0);
        title = getArguments().getString("title");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_onboarding_four, container, false);
        return view;
    }
}
