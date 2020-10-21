package com.example.instaclone

import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.instaclone.fragments.AddFragment
import com.example.instaclone.fragments.HomeFragment
import com.example.instaclone.fragments.ProfileFragment
import com.example.instaclone.fragments.SearchFragment

@Suppress("DEPRECATION")
class ViewPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager){
    override fun getCount(): Int {
        return 5
    }
    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> HomeFragment()
            1-> SearchFragment()
            2-> AddFragment()
            else-> ProfileFragment()
        }
    }
}