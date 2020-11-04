package com.example.instaclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class InstaPostsAdapter(var instaPostsList: List<InstaPost>): RecyclerView.Adapter<InstaPostsAdapter.InstaPostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstaPostViewHolder {
        var itemView = LayoutInflater.from()
    }
}