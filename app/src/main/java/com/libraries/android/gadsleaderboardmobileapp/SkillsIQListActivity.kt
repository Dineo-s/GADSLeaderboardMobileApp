package com.libraries.android.gadsleaderboardmobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_skills_i_q_list.*

class SkillsIQListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills_i_q_list)

        skills_iq_list.layoutManager = LinearLayoutManager(this)
    }
}