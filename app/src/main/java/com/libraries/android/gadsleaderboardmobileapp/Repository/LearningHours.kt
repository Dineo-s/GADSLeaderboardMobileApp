package com.libraries.android.gadsleaderboardmobileapp.Repository

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class LearningHours {
    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("hours")
    @Expose
    private var hours: Int? = null

    @SerializedName("country")
    @Expose
    private var country: String? = null

    @SerializedName("badgeUrl")
    @Expose
    private var badgeUrl: String? = null

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getHours(): Int? {
        return hours
    }

    fun setHours(hours: Int?) {
        this.hours = hours
    }

    fun getCountry(): String? {
        return country
    }

    fun setCountry(country: String?) {
        this.country = country
    }

    fun getBadgeUrl(): String? {
        return badgeUrl
    }

    fun setBadgeUrl(badgeUrl: String?) {
        this.badgeUrl = badgeUrl
    }

}