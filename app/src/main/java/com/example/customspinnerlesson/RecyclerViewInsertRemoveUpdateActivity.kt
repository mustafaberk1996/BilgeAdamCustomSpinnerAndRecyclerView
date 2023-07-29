package com.example.customspinnerlesson

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewInsertRemoveUpdateActivity : AppCompatActivity() {


    val fruits = mutableListOf("Elma", "Armut", "Kiraz", "Muz", "Visne")


    lateinit var rvFruits: RecyclerView
    lateinit var btnInsert:Button
    lateinit var btnRemove:Button
    lateinit var fruitTxt:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview_insert_remove_update)

        rvFruits = findViewById(R.id.rvFruits)
        btnInsert=findViewById(R.id.btnInsert)
        btnRemove=findViewById(R.id.btnRemove)
        fruitTxt=findViewById(R.id.etFruitName)



        val adapter = FruitAdapter(this, fruits)
        rvFruits.adapter = adapter

        btnInsert.setOnClickListener {
            fruits.add(fruitTxt.text.toString())
            //adapter.notifyDataSetChanged()
            adapter.notifyItemInserted(fruits.lastIndex)
        }

        btnRemove.setOnClickListener {
            val fruit = fruitTxt.text.toString()

            if (fruits.contains(fruit)){
                //kaldima isleme

                val removedFruitIndex = fruits.indexOf(fruit)
                fruits.remove(fruit)
                adapter.notifyItemRemoved(removedFruitIndex)

            }


        }





    }
}