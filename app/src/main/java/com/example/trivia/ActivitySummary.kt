package com.example.trivia

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.trivia.roomdatabase.Quiz
import com.example.trivia.roomdatabase.QuizDao
import com.example.trivia.roomdatabase.QuizDatabase
import com.example.trivia.utility.QuizShareData
import kotlinx.android.synthetic.main.activity_summary.*
import kotlinx.coroutines.runBlocking

class ActivitySummary : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        setToolBar()
        initViews()
        setSummaryData()

    }

    /*
    * Method help to set user details on summary screen
    * */
    private fun setSummaryData() {
        val quizShareData: QuizShareData = ActivityName.quizShareData
        tv_name_value.text = quizShareData.userNameEntered
        tv_date_time_value.text = quizShareData.quizStartDateTime
        tv_cricketer_value.text = quizShareData.bestCricketerSelected
        tv_flag_value.text = quizShareData.finalFlagColorsSelected.trim().replace(" ",",")

        runBlocking { insertUserData(quizShareData) }
    }

    /*
    * Method help to insert user details into database
    * */
   private suspend fun insertUserData(quizShareData: QuizShareData) {
        val quiz: Quiz = Quiz(
            null,
            quizShareData.userNameEntered,
            quizShareData.quizStartDateTime,
            quizShareData.bestCricketerSelected,
            quizShareData.finalFlagColorsSelected
        )
        val userDatabase: QuizDatabase = QuizDatabase.getInstance(this@ActivitySummary)
        val userDao: QuizDao = userDatabase.contactDao()
        val n: Long = userDao.insert(quiz)
        if (n>0){
            Toast.makeText(this@ActivitySummary,getString(R.string.insert_data_successfully),Toast.LENGTH_SHORT).show()
        }
    }

    /*
    * Initialize views
    * */
    private fun initViews() {
        history_button.setOnClickListener(this)
        finish_button.setOnClickListener(this)
    }

    /*
   * Initialize toolbar things
   * */
    private fun setToolBar() {
        supportActionBar?.title = getString(R.string.quiz_summary_titile)
    }

    override fun onClick(v: View?) {
        val id: Int? = v?.id
        when (id) {
            R.id.history_button -> {
                val intent: Intent = Intent(this@ActivitySummary, ActivityQuizHistory::class.java)
                startActivity(intent)
            }
            R.id.finish_button -> {
                val mainIntent = Intent(this@ActivitySummary, ActivityName::class.java)
                startActivity(mainIntent)
                finish()
            }
        }
    }
}