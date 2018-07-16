package com.example.samson.immvrse

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.samson.immvrse.databinding.ActivityOnboardingBinding

class OnBoardingActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityOnboardingBinding>(this, R.layout.activity_onboarding)
        val viewPager = binding.viewpager
        val fragmentPagerAdapter = MyPagerAdapter(supportFragmentManager)
        viewPager.adapter = fragmentPagerAdapter
        viewPager.offscreenPageLimit = 1
    }

    class MyPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

        override fun getCount(): Int {
            return NUM_ITEMS
        }

        override fun getItem(position: Int): Fragment? {
            return when (position) {
                0 -> OnboardingFragment.newInstance(0, "First page")
                1 -> OnboardingFragmentTwo.newInstance(1, "Second page")
                2 -> OnboardingFragmentThree.newInstance(2, "Third page")
                3 -> OnboardingFragmentFour.newInstance(3, "Fourth page")
                else -> null
            }
        }

        companion object {
            private val NUM_ITEMS = 4
        }
    }
}
