package com.example.customspinnerlesson

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomSpinnerAdapter(val context: Context, val fruits: List<Fruit>) : BaseAdapter() {

    override fun getCount(): Int {
        return fruits.size
    }

    override fun getItem(position: Int): Any {
        return fruits[position]
    }

    override fun getItemId(position: Int): Long {
        return fruits[position].id.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_spinner_item, parent, false)

        val tvName = view.findViewById<TextView>(R.id.tvName)
        val ivFruit: ImageView = view.findViewById(R.id.ivFruit)


        val fruit = fruits[position]

        tvName.text = context.getString(fruit.name)
        ivFruit.setImageResource(fruit.image)

        return view
    }
}