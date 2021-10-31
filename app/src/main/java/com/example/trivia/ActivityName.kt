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
        val suffixes = arrayOf(
            "th",
            "st",
            "nd",
            "rd",
            "th",
            "th",
            "th",
            "th",
            "th",
            "th",  //    10    11    12    13    14    15    16    17    18    19
            "th",
            "th",
            "th",
            "th",
            "th",
            "th",
            "th",
            "th",
            "th",
            "th",  //    20    21    22    23    24    25    26    27    28    29
            "th",
            "st",
            "nd",
            "rd",
            "th",
            "th",
            "th",
            "th",
            "th",
            "th",  //    30    31
            "th",
            "st"
        )

    }

    /*
    * Initialize views
    * */
    private fun initViews() {
        txt_btn.setOnClickListener {
            if (et_txt.text.toString().isEmpty()) {
                Toast.makeText(this, getString(R.string.enter_name), Toast.LENGTH_SHORT).show()

            } else {
                var finalFormatDate: String = getDayOfMonth()
                finalFormatDate = finalFormatDate + " " + getGameStartDateTime()
                quizShareData.quizStartDateTime = finalFormatDate
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
        val dateFormat: DateFormat = SimpleDateFormat("MMMM HH:mm a", Locale.ENGLISH)
        val cal: Calendar = Calendar.getInstance()
        val gameStartDateTime: String = dateFormat.format(cal.time)
        return gameStartDateTime
    }

    /*
    * Method help to get day of the month with suffix
    * */
    private fun getDayOfMonth(): String {
        val date = Date()
        val formatDayOfMonth: SimpleDateFormat = SimpleDateFormat("d", Locale.ENGLISH)
        val day: Int = formatDayOfMonth.format(date).toInt()
        val dayStr: String = day.toString().plus(suffixes[day])
        return dayStr
    }
}