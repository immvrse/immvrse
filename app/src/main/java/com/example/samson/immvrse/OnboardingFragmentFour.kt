package com.example.samson.immvrse

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.samson.immvrse.databinding.FragmentOnboardingFourBinding

class OnboardingFragmentFour : Fragment() {

    private var title: String? = null
    private var page: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        page = arguments!!.getInt("page", 0)
        title = arguments!!.getString("title")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentOnboardingFourBinding>(inflater, R.layout.fragment_onboarding_four, container, false)
        binding.root
        binding.continueButton.setOnClickListener { view ->
            val intent = Intent(activity, LocationActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }

    companion object {

        fun newInstance(page: Int, title: String): OnboardingFragmentFour {
            val fragment = OnboardingFragmentFour()
            val bundle = Bundle()
            bundle.putInt("page", page)
            bundle.putString("title", title)
            fragment.arguments = bundle
            return fragment
        }
    }
}
