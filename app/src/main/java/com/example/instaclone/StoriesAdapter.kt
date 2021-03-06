package com.example.instaclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.instaclone.StoriesAdapter.StoriesViewHolder
import kotlinx.android.synthetic.main.row_stories_item.view.*

class StoriesAdapter(var storiesList: List<Story>): RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesViewHolder {
        var rowView = LayoutInflater.from(parent.context).inflate(R.layout.row_stories_item,parent, false)
        return  StoriesViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        val story = storiesList.get(position)
        holder.rowView.tvStoryName.text = story.username
        Glide.with(holder.rowView.context)
            .load(story.imageUrl)
            .circleCrop()
            .placeholder(R.drawable.ic_profile_pic)
            .into(holder.rowView.imgStory)

    }
    override fun getItemCount(): Int {
        return  storiesList.size
    }
    class StoriesViewHolder(val rowView: View): RecyclerView.ViewHolder(rowView)
}
