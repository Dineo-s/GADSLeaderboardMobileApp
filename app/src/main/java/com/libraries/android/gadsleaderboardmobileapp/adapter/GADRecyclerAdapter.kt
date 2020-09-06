package com.libraries.android.gadsleaderboardmobileapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.libraries.android.gadsleaderboardmobileapp.R
import com.libraries.android.gadsleaderboardmobileapp.Repository.StudentsSkillIQ
import com.libraries.android.gadsleaderboardmobileapp.Repository.skillsIQ

class GADRecyclerAdapter(context: Context, private val data: List<skillsIQ>?) :
    RecyclerView.Adapter<GADRecyclerAdapter.ViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(
            R.layout.list_item,
            parent,
            false
        )//false because we dont want it to attached to parent
        return ViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return data?.size ?: 0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = data?.get(position)
        // holder.logo?. = data.getBadgeUrl() load image using picasso
        holder.textName?.text = data?.name
        holder.textContent?.text = "${data?.score} SkillsIQ, ${data?.country}"
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //contains the information of the inflated information

        val textName = itemView.findViewById<TextView?>(R.id.nameTextView)
        val textContent = itemView.findViewById<TextView?>(R.id.contentTextView)
        val logo = itemView.findViewById<ImageView?>(R.id.imageView)

    }

}