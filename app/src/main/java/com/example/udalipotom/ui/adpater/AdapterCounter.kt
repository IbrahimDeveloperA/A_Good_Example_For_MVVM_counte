package com.example.udalipotom.ui.adpater

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.udalipotom.ui.FirstFragment
import com.example.udalipotom.ui.SecondFragment
import com.example.udalipotom.ui.ThereFragment

class AdapterCounter(fm: FragmentActivity) : FragmentStateAdapter(fm) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThereFragment()
            else -> FirstFragment()
        }
    }

}