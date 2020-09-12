package com.regadeveloper.instaclone

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.regadeveloper.instaclone.adapter.ImagesAdapter
import com.regadeveloper.instaclone.adapter.PostAdapter
import com.regadeveloper.instaclone.adapter.PostProfileAdapter
import com.regadeveloper.instaclone.model.Post
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_post_p.*
import kotlinx.android.synthetic.main.list_post_p.view.*

class PostProfileActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_profile)

        val intent = intent
        val caption = intent.getStringExtra("caption")
        val userId = intent.getStringExtra("username")
        val postImage = intent.getStringExtra("postimage")
        val postId = intent.getStringExtra("postId")
//
//        val view = layoutInflater.inflate(R.layout.list_post_p, contentView, false)
//
//        Picasso.get()
//            .load(postImage)
//            .into(view.image_post3)
//
//        view
    }

}