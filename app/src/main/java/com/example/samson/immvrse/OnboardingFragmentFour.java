package com.example.samson.immvrse;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.samson.immvrse.databinding.FragmentOnboardingFourBinding;

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
<<<<<<< HEAD
        FragmentOnboardingFourBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding_four, container, false);
        binding.getRoot();
        binding.continueButton.setOnClickListener(new View.OnClickListener() {

=======
        View view = inflater.inflate(R.layout.fragment_onboarding_four, container, false);
        FragmentOnboardingFourBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_onboarding_four, container, false);

        binding.continueButton.setOnClickListener(new View.OnClickListener() {
>>>>>>> d864b51286ad764d33933163487c1f48bcb0757a
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LocationActivity.class);
                startActivity(intent);
            }
        });
<<<<<<< HEAD
        return binding.getRoot();
    }
=======
        return view;
    }




>>>>>>> d864b51286ad764d33933163487c1f48bcb0757a
}
