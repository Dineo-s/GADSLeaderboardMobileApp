package com.libraries.android.gadsleaderboardmobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.libraries.android.gadsleaderboardmobileapp.Repository.StudentsSkillIQ
import com.libraries.android.gadsleaderboardmobileapp.Repository.services.GADService
import com.libraries.android.gadsleaderboardmobileapp.Repository.services.ServiceBuilder
import com.libraries.android.gadsleaderboardmobileapp.Repository.skillsIQ
import com.libraries.android.gadsleaderboardmobileapp.adapter.GADRecyclerAdapter
import kotlinx.android.synthetic.main.activity_skills_i_q_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SkillsIQListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills_i_q_list)

        //skills_iq_list.layoutManager = LinearLayoutManager(this)


        val request = ServiceBuilder.buildService(GADService::class.java)
        val call = request.getSkillIq()

        call.enqueue(object : Callback<List<skillsIQ>> {
            override fun onResponse(
                call: Call<List<skillsIQ>>,
                response: Response<List<skillsIQ>>
            ) {
                if (response.isSuccessful) {
                    //  progress_bar.visibility = View.GONE
                    skills_iq_list.apply {
                        setHasFixedSize(true)
                        layoutManager = LinearLayoutManager(this@SkillsIQListActivity)
                        adapter =
                            GADRecyclerAdapter(
                                this@SkillsIQListActivity,
                                response.body()
                            )

                        print(response.body())
                    }
                }
            }

            override fun onFailure(call: Call<List<skillsIQ>>, t: Throwable) {
                Toast.makeText(this@SkillsIQListActivity, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }


}
