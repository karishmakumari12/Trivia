package com.example.trivia.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Quiz::class], version = 1)
abstract class QuizDatabase : RoomDatabase(){
    abstract fun contactDao(): QuizDao
    companion object{
        var instance: QuizDatabase?=null
        fun getInstance(context: Context): QuizDatabase
        {
            if (instance ==null)
            {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    QuizDatabase::class.java,
                    "quiz_database.db").fallbackToDestructiveMigration().build()

            }
            return instance!!

        }
    }


}