package com.example.instaclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.row_profile_grid_item.view.*

class ProfileGridAdapter(var profilePostList: List<String>): RecyclerView.Adapter<ProfileGridAdapter.ProfileGridViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileGridViewHolder {
        var rowView = LayoutInflater.from(parent.context).inflate(R.layout.row_profile_grid_item,parent, false)
        return ProfileGridViewHolder(rowView)
    }

    override fun getItemCount(): Int {
        return profilePostList.size
    }

    override fun onBindViewHolder(holder: ProfileGridViewHolder, position: Int) {
        Glide.with(holder.rowview.context)
            .load(profilePostList.get(position))
            .into(holder.rowview.ivProfilePost)

    }

    class ProfileGridViewHolder(val rowview: View): RecyclerView.ViewHolder(rowview)
}