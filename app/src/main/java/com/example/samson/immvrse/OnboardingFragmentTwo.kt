package com.example.samson.immvrse

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class OnboardingFragmentTwo : Fragment() {

    private var title: String? = null
    private var page: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        page = arguments!!.getInt("page", 0)
        title = arguments!!.getString("title", "title")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_onboarding_two, container, false)
    }

    companion object {

        fun newInstance(page: Int, title: String): OnboardingFragmentTwo {
            val fragment = OnboardingFragmentTwo()
            val bundle = Bundle()
            bundle.putInt("page", page)
            bundle.putString("title", title)
            fragment.arguments = bundle
            return fragment
        }
    }
}
