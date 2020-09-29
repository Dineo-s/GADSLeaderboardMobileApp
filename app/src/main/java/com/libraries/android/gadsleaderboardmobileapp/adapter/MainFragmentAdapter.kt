package com.libraries.android.gadsleaderboardmobileapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.libraries.android.gadsleaderboardmobileapp.LearningLeadersListFragment
import com.libraries.android.gadsleaderboardmobileapp.SkillsIQListActivity

class MainFragmentAdapter(activity: FragmentActivity, var titles: Array<String>) :
    FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = titles.size

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return SkillsIQListActivity()
            1 -> return LearningLeadersListFragment()

        }
        return SkillsIQListActivity()
    }
}