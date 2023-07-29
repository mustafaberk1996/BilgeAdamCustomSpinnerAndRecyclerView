package com.example.customspinnerlesson

import java.util.Date

data class Video(
    val id: Int,
    val title: String,
    val publisherName: String,
    val viewCount: Long,
    val videoPreviewUrl: String,
    val publisherProfileUrl: String,
    val uploadTime: Date,
    val duration:String
)