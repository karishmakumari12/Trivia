package com.example.trivia.roomdatabase

import androidx.room.*

@Dao
interface QuizDao {
    @Insert
    suspend fun insert(user: Quiz): Long

    @Query("select * from Quiz")
    suspend fun getHistoryData(): List<Quiz>
}