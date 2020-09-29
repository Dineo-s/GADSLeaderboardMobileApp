package com.libraries.android.gadsleaderboardmobileapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.libraries.android.gadsleaderboardmobileapp.adapter.MainFragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    private val titles =
        arrayOf("Learning Leaders", "Skill IQ Leaders")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        viewPager = findViewById(R.id.pager)
        tabLayout = findViewById(R.id.tab_layout)
        viewPager.adapter = MainFragmentAdapter(this, titles)

        TabLayoutMediator(tab_layout, viewPager
        ) { tab, position -> tab.setText(titles.get(position)) }.attach()
    }
}
