package com.example.customspinnerlesson

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class UserAdapter constructor(val context:Context,val users:List<User>):RecyclerView.Adapter<UserAdapter.CustomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.user_list_item, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val user = users[position]

        holder.ivUser.setImageResource(user.profilePhoto)
        holder.tvUserFullName.text = "${user.name} ${user.surname}"
        holder.ivGender.setImageResource(user.gender.resourceId)

    }

    class CustomViewHolder(itemView: View):ViewHolder(itemView){

        val ivUser:ImageView = itemView.findViewById(R.id.ivUser)
        val tvUserFullName:TextView = itemView.findViewById(R.id.tvUserFullName)
val ivGender: ImageView = itemView.findViewById(R.id.ivGender)
    }

}