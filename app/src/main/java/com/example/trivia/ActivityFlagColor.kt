package com.example.trivia

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.trivia.utility.QuizShareData
import kotlinx.android.synthetic.main.activity_flag_color.*

class ActivityFlagColor : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flag_color)
        initViews()
    }

    /*
    * Initialize views
    * */
    private fun initViews() {
        next_button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id: Int? = v?.id
        when (id) {
            R.id.next_button -> {
                val finalFlagColors: String = getSelectedOptions()
                if (finalFlagColors.isEmpty()) {
                    Toast.makeText(
                        this@ActivityFlagColor,
                        getString(R.string.please_select_option),
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    val quizShareData: QuizShareData = ActivityName.quizShareData
                    quizShareData.finalFlagColorsSelected = finalFlagColors
                    val intent = Intent(this@ActivityFlagColor, ActivitySummary::class.java)
                    startActivity(intent)
                }
            }
        }
    }

    /*
    * Method to get selected options value in single string variable
    * */
    private fun getSelectedOptions(): String {
        var flagColors: String = ""
        if (cb_white.isChecked)
            flagColors = flagColors + cb_white.text.toString() + " "
        if (cb_green.isChecked)
            flagColors = flagColors + cb_green.text.toString() + " "
        if (cb_orange.isChecked)
            flagColors = flagColors + cb_orange.text.toString() + " "
        if (cb_yellow.isChecked)
            flagColors = flagColors + cb_yellow.text.toString() + " "
        return flagColors
    }
}