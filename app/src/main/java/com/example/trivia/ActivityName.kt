package com.example.trivia

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.trivia.utility.QuizShareData
import kotlinx.android.synthetic.main.activity_name.*
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class ActivityName : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        initViews()

    }

    /*
    * Local data storage class
    * */
    companion object {
        var quizShareData: QuizShareData = QuizShareData(ActivityName::javaClass.name)
    }

    /*
    * Initialize views
    * */
    private fun initViews() {
        txt_btn.setOnClickListener {
            if (et_txt.text.toString().isEmpty()) {
                Toast.makeText(this, getString(R.string.enter_name), Toast.LENGTH_SHORT).show()

            } else {
                quizShareData.quizStartDateTime = getGameStartDateTime()
                quizShareData.userNameEntered = et_txt.text.toString()
                val intent = Intent(this@ActivityName, ActivityBestCricketer::class.java)
                startActivity(intent)
                finish()
            }

        }
    }

    /*
    * Method helps to get game start date and time
    * */
    private fun getGameStartDateTime(): String {
        val dateFormat: DateFormat = SimpleDateFormat("MMM dd, yyyy HH:mm:ss", Locale.ENGLISH)
        val cal: Calendar = Calendar.getInstance()
        val gameStartDateTime: String = dateFormat.format(cal.time)
        return gameStartDateTime
    }
}