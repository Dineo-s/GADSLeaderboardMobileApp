package com.libraries.android.gadsleaderboardmobileapp.Repository.services

import com.libraries.android.gadsleaderboardmobileapp.Repository.StudentsSkillIQ
import com.libraries.android.gadsleaderboardmobileapp.Repository.skillsIQ
import retrofit2.Call
import retrofit2.http.GET

interface GADService {
    @GET("skilliq")
    fun getSkillIq(): Call<List<skillsIQ>>
}