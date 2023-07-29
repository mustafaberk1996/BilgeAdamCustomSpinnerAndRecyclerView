package com.example.customspinnerlesson

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(val context: Context, val fruits: List<String>) :
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
        holder.tvFruitName.text = fruits[position]
    }

    class CustomViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFruitName: TextView = itemView.findViewById(R.id.tvFruitName)
    }
}