package com.example.instaclone.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instaclone.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.rvStories as rvStories1


class HomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        showStories()
        showPosts()


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_home,menu)
    }

    fun showStories(){
        var storiesList = ArrayList<Story>()
        storiesList.add(Story("https://www.clker.com/cliparts/3/m/v/Y/E/V/small-red-apple-hi.png","Barre"))
        storiesList.add(Story("https://images.pexels.com/photos/1289845/pexels-photo-1289845.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500","Arbe"))
        storiesList.add(Story("https://cdn.vox-cdn.com/thumbor/TmgXcq6_4URVd0YN0SotUf5WYeA=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/9556001/chicks.0.0.0.jpg","John"))
        storiesList.add(Story("https://img.pngio.com/small-red-heart-png-transparent-png-download-for-free-316820-small-red-heart-png-920_770.png","Talaso"))
        storiesList.add(Story("https://images.unsplash.com/photo-1542840843-3349799cded6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80","Anah"))
        storiesList.add(Story("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/small-bedroom-ideas-love-17-1-1591391957.jpg","Mamo"))
        storiesList.add(Story("https://images.all-free-download.com/images/graphiclarge/goa_small_bird_202958.jpg","Lily"))

        val storiesAdapter = StoriesAdapter(storiesList)
        rvStories1.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        rvStories1.adapter = storiesAdapter



    }


    fun showPosts(){
        var instaPostsList = ArrayList<InstaPost>()
        instaPostsList.add(InstaPost("", "Michi","https://images.vans.com/is/image/Vans/D3HY28-HERO?\$583x583\$",50,"What a beautiful shoe"))
        instaPostsList.add(InstaPost("", "Kellie","https://m.media-amazon.com/images/I/81eUg0M2QGL._AC_UY218_.jpg",55,"Stunning"))
        instaPostsList.add(InstaPost("", "Ruth","https://m.media-amazon.com/images/I/81eUg0M2QGL._AC_UY218_.jpg",80,"What a day"))
        instaPostsList.add(InstaPost("", "Matete","https://m.media-amazon.com/images/I/81eUg0M2QGL._AC_UY218_.jpg",150,"Amaizing"))
        instaPostsList.add(InstaPost("", "joel","https://m.media-amazon.com/images/I/81eUg0M2QGL._AC_UY218_.jpg",350,"Waow, i like it"))


        val postsAdapter = InstaPostAdapter(instaPostsList)
        rvNewsFeed.layoutManager = LinearLayoutManager(context)
        rvNewsFeed.adapter = postsAdapter
    }



}




