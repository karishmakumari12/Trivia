package com.example.trivia

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trivia.roomdatabase.Quiz
import com.example.trivia.roomdatabase.QuizDao
import com.example.trivia.roomdatabase.QuizDatabase
import kotlinx.android.synthetic.main.activity_quiz_history.*
import kotlinx.coroutines.runBlocking

class ActivityQuizHistory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_history)

        setToolBar()
        initViews()

    }

    /*
    * Get save game history from room database
    * */
    private suspend fun getGameHistoryData(): List<Quiz> {
        val userDatabase: QuizDatabase = QuizDatabase.getInstance(this@ActivityQuizHistory)
        val userDao: QuizDao = userDatabase.contactDao()
        val quizList: List<Quiz> = userDao.getHistoryData()
        return quizList
    }

    /*
    * Initialize views
    * */
    private fun initViews() {
        val quizList: List<Quiz> = runBlocking { getGameHistoryData() }
        val quizHistoryAdapter = QuizHistoryAdapter(quizList,this@ActivityQuizHistory)
        // this creates a vertical layout Manager
        val mLayoutManager = LinearLayoutManager(
            this@ActivityQuizHistory
        )
        history_recyclerview.layoutManager = mLayoutManager
        // Setting the Adapter with the recyclerview
        history_recyclerview.adapter = quizHistoryAdapter
    }

    /*
    * Initialize toolbar things
    * */
    private fun setToolBar() {
        supportActionBar?.title = getString(R.string.quiz_history)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

    }

    /*back button click handling here
    * */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}