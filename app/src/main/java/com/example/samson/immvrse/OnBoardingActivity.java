package com.example.samson.immvrse;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.samson.immvrse.databinding.ActivityOnboardingBinding;

public class OnBoardingActivity extends FragmentActivity {

    ActivityOnboardingBinding binding;
    FragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_onboarding);
        ViewPager viewPager = binding.viewpager;
        fragmentPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);
        viewPager.setOffscreenPageLimit(1);
    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 3;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return OnboardingFragment.newInstance(0, "First page");
                case 1:
                    return OnboardingFragmentTwo.newInstance(1, "Second page");
                case 2:
                    return OnboardingFragmentThree.newInstance(2, "Third page");
                default:
                    return null;
            }
        }
    }
}
