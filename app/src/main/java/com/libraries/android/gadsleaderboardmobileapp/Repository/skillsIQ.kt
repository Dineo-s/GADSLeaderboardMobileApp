package com.libraries.android.gadsleaderboardmobileapp.Repository
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class skillsIQ {
    @SerializedName("name")
    @Expose
    private var name: String? = null

    @SerializedName("score")
    @Expose
    private var score: Int? = null

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

    fun getScore(): Int? {
        return score
    }

    fun setScore(score: Int?) {
        this.score = score
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