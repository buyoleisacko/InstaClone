package com.example.instaclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import com.example.instaclone.ViewPagerAdapter as ViewPagerAdapter1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewPager()
    }


    fun setupViewPager() {
        val viewPagerAdapter = ViewPagerAdapter1(supportFragmentManager)
        viewpager.adapter = viewPagerAdapter
        bottom_nav_menu.setOnNavigationItemSelectedListener { item ->
            return@setOnNavigationItemSelectedListener when (item.itemId) {
                R.id.home -> {
                    viewpager.currentItem = 0
                    true
                }
                R.id.search -> {
                    viewpager.currentItem = 1
                    true
                }
                R.id.add -> {
                    viewpager.currentItem = 2
                    true
                }
                R.id.heart -> {
                    viewpager.currentItem = 3
                    true
                }
                R.id.profile -> {
                    viewpager.currentItem = 4
                    true
                }
                else -> {
                    true
                }
            }
        }
    }

    fun setupViewPager2() {
        val vpa = ViewPagerAdapter1(supportFragmentManager)
        ViewPagerAdapter1=vpa
    }
}












