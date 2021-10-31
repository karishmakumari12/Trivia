package com.example.trivia.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Quiz(
    @PrimaryKey(autoGenerate = true)
    val quizId: Int?,
    val userName: String?,
    val gameDateTime:String?,
    val cricketerName: String?,
    val flagColor: String?
)
