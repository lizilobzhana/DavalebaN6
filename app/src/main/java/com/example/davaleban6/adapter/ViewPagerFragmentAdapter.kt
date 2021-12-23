package com.example.davaleban6.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.davaleban6.fragments.BavshvobaFragment
import com.example.davaleban6.fragments.NoteFragment
import com.example.davaleban6.fragments.WowBroFragment

class ViewPagerFragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> NoteFragment()
            1 -> BavshvobaFragment()
            2 -> WowBroFragment()
            else -> NoteFragment()
        }
    }
}