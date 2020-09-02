package com.libraries.android.gadsleaderboardmobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_learning_leaders_list.*

class LearningLeadersListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learning_leaders_list)

        leaders_list.layoutManager = LinearLayoutManager(this)
    }
}