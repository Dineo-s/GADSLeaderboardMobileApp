package com.libraries.android.gadsleaderboardmobileapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.libraries.android.gadsleaderboardmobileapp.Repository.services.GADService
import com.libraries.android.gadsleaderboardmobileapp.Repository.services.ServiceBuilder
import com.libraries.android.gadsleaderboardmobileapp.Repository.skillsIQ
import com.libraries.android.gadsleaderboardmobileapp.adapter.GADRecyclerAdapter
import kotlinx.android.synthetic.main.activity_skills_i_q_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class SkillsIQListActivity : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_skills_i_q_list, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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
                        layoutManager = LinearLayoutManager(activity)
                        adapter = GADRecyclerAdapter(context, response.body())

                        print(response.body())
                    }
                }
            }

            override fun onFailure(call: Call<List<skillsIQ>>, t: Throwable) {
                Toast.makeText(context, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }

}



