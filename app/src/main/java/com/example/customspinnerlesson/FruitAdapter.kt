package com.example.customspinnerlesson

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(
    val context: Context,
    val fruits: MutableList<RecyclerViewInsertRemoveUpdateActivity.Fruit>,
    val onClick: (fruit: RecyclerViewInsertRemoveUpdateActivity.Fruit,position:Int) -> Unit
) :
    RecyclerView.Adapter<FruitAdapter.CustomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            LayoutInflater.from(context).inflate(R.layout.fruit_list_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return fruits.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val fruit = fruits[position]
        holder.tvFruitName.text = fruit.name

        holder.myItemView.setOnClickListener {
            onClick(fruit,position)
        }
    }

    class CustomViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val myItemView = itemView
        val tvFruitName: TextView = itemView.findViewById(R.id.tvFruitName)
    }
}