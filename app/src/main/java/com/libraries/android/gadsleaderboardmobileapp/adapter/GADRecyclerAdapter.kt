package com.libraries.android.gadsleaderboardmobileapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.libraries.android.gadsleaderboardmobileapp.R

class GADRecyclerAdapter(private val context: Context) :
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
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //contains the information of the inflated information

        val textName = itemView.findViewById<TextView?>(R.id.nameTextView)
        val textContent = itemView.findViewById<TextView?>(R.id.contentTextView)
        val logo = itemView.findViewById<ImageView?>(R.id.imageView)

    }

}