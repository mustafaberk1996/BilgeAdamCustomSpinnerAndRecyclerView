package com.example.customspinnerlesson

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewInsertRemoveUpdateActivity : AppCompatActivity() {

data class Fruit(val id:Int,var name:String)
    val fruits = mutableListOf(
        Fruit(1,"Elma"),
        Fruit(2,"Armut"),
        Fruit(3,"Muz"),
        Fruit(4,"Karpuz")
    )


    lateinit var rvFruits: RecyclerView
    lateinit var btnInsert:Button
    lateinit var btnRemove:Button
    lateinit var btnUpdate:Button
    lateinit var fruitTxt:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview_insert_remove_update)

        rvFruits = findViewById(R.id.rvFruits)
        btnInsert=findViewById(R.id.btnInsert)
        btnRemove=findViewById(R.id.btnRemove)
        fruitTxt=findViewById(R.id.etFruitName)
        btnUpdate=findViewById(R.id.btnUpdate)


        val adapter = FruitAdapter(this, fruits){fruit,position->
            AlertDialog.Builder(this).setTitle("Secilen Meyve").setMessage("${fruit.name}, position:$position").create().show()
        }

        rvFruits.adapter = adapter

        btnInsert.setOnClickListener {
            fruits.add(Fruit(5,"Ananas"))
            //adapter.notifyDataSetChanged()
            adapter.notifyItemInserted(5)
        }

        btnRemove.setOnClickListener {
            val fruit = fruitTxt.text.toString()


            fruits.firstOrNull { it.name.equals(fruit,ignoreCase = true) }?.let {
                //kaldima isleme

                val removedFruitIndex = fruits.indexOf(it)
                fruits.remove(it)
                adapter.notifyItemRemoved(removedFruitIndex)
            }



        }

        btnUpdate.setOnClickListener {
            val fruit = fruitTxt.text.toString()
            val updatedFruit=fruits[0]
            updatedFruit.name=fruit
            adapter.notifyItemChanged(0)
        }





    }
}