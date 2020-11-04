package com.example.instaclone.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instaclone.MainActivity
import com.example.instaclone.R
import com.example.instaclone.StoriesAdapter
import com.example.instaclone.Story


class HomeFragment : Fragment() {
    override fun onCreateView(
        Inflater: LayoutInflater, container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        return Inflater.Inflate(R.layout.fragment_home,container, attachToRoot.false)
    }
    overide fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity?)!!.setSupportActionBar(toolbarHome)
        (activity as MainActivity?)!!.supportActionBar? setDisplayShowTitleEnabled(false)
        setHasOptionsMenu(true)
        showStories()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_home, menu)
    }
    fun showStories(){
        var storiesList = ArrayList<Story>()
        storiesList.add(Story(imageUrl: "https://images.unsplash.com/photo-1542840843-3349799cded6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80",username: "Buyole"))
        storiesList.add(Story(imageUrl: "https://images.unsplash.com/photo-1542840843-3349799cded6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80",username: "Buyole"))
        storiesList.add(Story(imageUrl: "https://images.unsplash.com/photo-1542840843-3349799cded6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80",username: "Buyole"))
        storiesList.add(Story(imageUrl: "https://images.unsplash.com/photo-1542840843-3349799cded6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80",username: "Buyole"))
        storiesList.add(Story(imageUrl: "https://images.unsplash.com/photo-1542840843-3349799cded6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80",username: "Buyole"))
        storiesList.add(Story(imageUrl: "https://images.unsplash.com/photo-1542840843-3349799cded6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80",username: "Buyole"))
        val storiesAdapter = StoriesAdapter(storiesList)
        rvStories.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, reverseLayout: false)
        rvStories.adapter = storiesAdapter
    }

}




