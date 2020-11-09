package com.example.instaclone.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.instaclone.ProfileGridAdapter
import com.example.instaclone.R
import kotlinx.android.synthetic.main.fragment_profile.*
import java.util.*


class ProfileFragment : androidx.fragment.app.Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showProfileGrid()

    }

    fun showProfileGrid() {
        var profilePostsList=ArrayList<String>()
        profilePostsList.add("https://media.istockphoto.com/photos/young-seedling-growing-out-of-soil-over-a-white-background-picture-id145922846?k=6&m=145922846&s=612x612&w=0&h=ktZlg2G5EEQHJUCzZSJbRhc2f2-cBd61wZ_wGRAtmc8=")
        profilePostsList.add("https://www.pngfind.com/pngs/m/55-552671_apple-iphone-clipart-samsung-logo-apple-logo-small.png")
        profilePostsList.add("https://risepeople.com/wp-content/uploads/small-business-quotes-1.jpg")
        profilePostsList.add("https://i.pinimg.com/474x/e4/ef/89/e4ef896ef33967c7be2835b9b2ea43ee.jpg")
        profilePostsList.add("https://www.smallworldfs.com/filemanager/userfiles/img/smallworldmoneytransferlogo.jpg")
        profilePostsList.add("https://comps.canstockphoto.com/hand-with-small-tiny-umbrella-stock-photograph_csp84412599.jpg")
        profilePostsList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Wiktionary_small.svg/350px-Wiktionary_small.svg.png")
        profilePostsList.add("https://media.istockphoto.com/photos/young-seedling-growing-out-of-soil-over-a-white-background-picture-id145922846?k=6&m=145922846&s=612x612&w=0&h=ktZlg2G5EEQHJUCzZSJbRhc2f2-cBd61wZ_wGRAtmc8=")
        profilePostsList.add("https://www.pngfind.com/pngs/m/55-552671_apple-iphone-clipart-samsung-logo-apple-logo-small.png")
        profilePostsList.add("https://risepeople.com/wp-content/uploads/small-business-quotes-1.jpg")
        profilePostsList.add("https://i.pinimg.com/474x/e4/ef/89/e4ef896ef33967c7be2835b9b2ea43ee.jpg")
        profilePostsList.add("https://www.smallworldfs.com/filemanager/userfiles/img/smallworldmoneytransferlogo.jpg")
        profilePostsList.add("https://comps.canstockphoto.com/hand-with-small-tiny-umbrella-stock-photograph_csp84412599.jpg")
        profilePostsList.add("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Wiktionary_small.svg/350px-Wiktionary_small.svg.png")

      var profileGridAdapter=ProfileGridAdapter(profilePostsList)
        rvProfilePost.layoutManager=GridLayoutManager(context, 3)
       rvProfilePost.adapter=profileGridAdapter
    }

}
