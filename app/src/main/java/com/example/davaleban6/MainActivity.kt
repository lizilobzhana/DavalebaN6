package com.example.davaleban6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.davaleban6.adapter.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager2 : ViewPager2
    private lateinit var tabLayout : TabLayout
    private lateinit var viewPagerFragmentadapter : ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        viewPager2.adapter = viewPagerFragmentadapter
        TabLayoutMediator(tabLayout, viewPager2){tab,position->
            tab.text = "tab ${position+1}"
        }.attach()


    }
    private fun init(){
        viewPager2 = findViewById(R.id.viewPager2)
        tabLayout = findViewById(R.id.tabLayout)
        viewPagerFragmentadapter = ViewPagerFragmentAdapter(this)
    }
}