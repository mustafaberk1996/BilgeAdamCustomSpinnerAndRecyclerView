package com.example.customspinnerlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class UsersActivity : AppCompatActivity() {


    val users = listOf(
        User(1,"Mustafa","Berk",R.drawable.user4, Gender.MAN),
        User(2,"Elif","Cinar",R.drawable.user5, Gender.WOMAN),
        User(3,"Busra","Ustunel",R.drawable.user1, Gender.WOMAN),
        User(4,"Tolga","Unal",R.drawable.user2, Gender.MAN),
        User(5,"Oguzhan","Yigit",R.drawable.user6, Gender.MAN),
        User(6,"Gozde","Aykent",R.drawable.user7, Gender.WOMAN),
        User(7,"Kaan","Yagan",R.drawable.user, Gender.MAN),
        User(8,"Oguz","Toruntay",R.drawable.user3, Gender.MAN)
    )

    lateinit var rvUsers:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)

     rvUsers = findViewById(R.id.rvUsers)


        rvUsers.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvUsers.adapter = UserAdapter(this, users)


    }


}