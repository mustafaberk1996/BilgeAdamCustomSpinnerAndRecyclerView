package com.example.customspinnerlesson

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load

class VideoAdapter(val context:Context, val videos:List<Video>) : RecyclerView.Adapter<VideoAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(
           LayoutInflater.from(context).inflate(R.layout.video_list_item,parent,false)
       )
    }

    override fun getItemCount(): Int {
        return videos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val video = videos[position]
        holder.tvTitle.text = video.title
        holder.tvDuration.text = video.duration

        holder.ivVideoPreview.load(video.videoPreviewUrl) {
            placeholder(R.drawable.loading)
        }
        holder.ivPublisherProfile.load(video.publisherProfileUrl)
    }


    class ViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {

        val ivVideoPreview: ImageView = itemView.findViewById(R.id.ivVideoPreview)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvDuration: TextView = itemView.findViewById(R.id.tvDuration)
        val ivPublisherProfile: ImageView = itemView.findViewById(R.id.ivPublisherProfile)

    }
}