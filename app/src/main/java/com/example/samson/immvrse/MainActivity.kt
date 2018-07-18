package com.example.samson.immvrse

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.view.Gravity
import android.widget.Toast
import com.example.samson.immvrse.news_feed.NewsFeedFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        menu_button.setOnClickListener {drawer_layout.openDrawer(Gravity.START) }

        supportFragmentManager.beginTransaction()
                .add(R.id.content_container, NewsFeedFragment())
                .commit()

        nav_drawer.itemIconTintList = null
        nav_drawer.setNavigationItemSelectedListener { item ->
            Toast.makeText(applicationContext, "Clicked " + item.title, Toast.LENGTH_SHORT).show()
            true
        }
    }
}


