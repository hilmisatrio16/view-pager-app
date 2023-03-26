package com.example.viewpagerapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.viewpagerapp.fragment.CallFragment
import com.example.viewpagerapp.fragment.ChatFragment
import com.example.viewpagerapp.fragment.CommunityFragment
import com.example.viewpagerapp.fragment.StatusFragment

class ViewPagerAdapter (fragmentMan : FragmentManager, behavior : Int): FragmentStatePagerAdapter(fragmentMan, behavior) {
        private val tabName: Array<String> = arrayOf("Community","Chats", "Status", "Calls")

        override fun getCount(): Int {
            return 4
        }

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> CommunityFragment()
                1 -> ChatFragment()
                2 -> StatusFragment()
                3 -> CallFragment()
                else -> ChatFragment()
            }
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return tabName[position]
        }


    }