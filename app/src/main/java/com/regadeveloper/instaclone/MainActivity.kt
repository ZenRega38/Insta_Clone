package com.regadeveloper.instaclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.regadeveloper.instaclone.fragment.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav.setOnNavigationItemSelectedListener(onBottomNavListener)
        val frag = supportFragmentManager
    }

    private val onBottomNavListener = BottomNavigationView.OnNavigationItemSelectedListener { i->
        var selectedFragment: Fragment = HomeFragment()

        when(i.itemId){
            R.id.homeBtn -> {
                selectedFragment = HomeFragment()
            }
            R.id.exploreBtn -> {
                selectedFragment = ExploreFragment()
            }
            R.id.postBtn -> {
                startActivity(Intent(this, AddPostActivity::class.java))
            }
            R.id.activityBtn -> {
                selectedFragment = ActivityFragment()
            }
            R.id.profileBtn -> {
                selectedFragment = ProfileFragment()
            }
        }

        val frag = supportFragmentManager.beginTransaction()
        frag.add(R.id.item_container, selectedFragment)
        frag.commit()

        true
    }
}