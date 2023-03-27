package com.example.viewpagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import androidx.fragment.app.FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import com.example.viewpagerapp.adapter.ViewPagerAdapter
import com.example.viewpagerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Whathappent"
        supportActionBar?.elevation = 0.0f

        val adapter = ViewPagerAdapter(supportFragmentManager,
            BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)

        binding.viewPager.adapter = adapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)

        val iconCommunityTab = LayoutInflater.from(this).inflate(R.layout.community_tab_icon, null)

        binding.tabLayout.getTabAt(0)?.customView = iconCommunityTab

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_navigation, menu)
        return super.onCreateOptionsMenu(menu)
    }
}