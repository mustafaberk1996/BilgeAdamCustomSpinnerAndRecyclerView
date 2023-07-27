package com.example.customspinnerlesson

data class User(val id: Int, val name: String, val surname: String,val profilePhoto:Int, val gender: Gender)

enum class Gender(val resourceId: Int) {
    MAN(R.drawable.baseline_male_24), WOMAN(R.drawable.baseline_female_24)
}