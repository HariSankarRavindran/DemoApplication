package com.demo.application

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProfilePostAdapter(val context: Context) :
    RecyclerView.Adapter<ProfilePostAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.adapter_posts, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = 15

    class ViewHolder(itemsView: View) : RecyclerView.ViewHolder(itemsView) {

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }
}