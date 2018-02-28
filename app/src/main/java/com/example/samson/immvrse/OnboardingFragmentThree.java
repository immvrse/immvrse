package com.example.samson.immvrse;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OnboardingFragmentThree extends Fragment {

    private String title;
    private int page;

    public static OnboardingFragmentThree newInstance(int page, String title) {
        OnboardingFragmentThree fragment = new OnboardingFragmentThree();
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
<<<<<<< HEAD
        return inflater.inflate(R.layout.fragment_onboarding_three, container, false);
=======
        View view = inflater.inflate(R.layout.fragment_onboarding_three, container, false);
        return view;
>>>>>>> d864b51286ad764d33933163487c1f48bcb0757a
    }
}
