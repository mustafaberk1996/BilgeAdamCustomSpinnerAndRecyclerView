package com.example.customspinnerlesson

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.Button
import android.widget.Spinner
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    val fruits = listOf(
        Fruit(1, R.string.apple, R.drawable.apple,"#eb4034"),
        Fruit(2, R.string.banana, R.drawable.banana,"#e5eb34"),
        Fruit(4, R.string.cherry, R.drawable.cherry,"#eb5834"),
        Fruit(5, R.string.pear, R.drawable.pear,"#34eb5b"),
        Fruit(6, R.string.pineapple, R.drawable.pineapple,"#c034eb"),
    )


    lateinit var spFruits:Spinner
    lateinit var clMain:ConstraintLayout
    lateinit var btnGoUsersPage:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spFruits = findViewById(R.id.spFruits)
        clMain = findViewById(R.id.clMain)
        btnGoUsersPage = findViewById(R.id.btnGoUsersPage)



        spFruits.adapter = CustomSpinnerAdapter(this, fruits)

        spFruits.onItemSelectedListener = object: OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                clMain.setBackgroundColor(Color.parseColor(fruits[position].color))
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        btnGoUsersPage.setOnClickListener {
            val intent = Intent(this, UsersActivity::class.java)
            startActivity(intent)
        }



    }


}