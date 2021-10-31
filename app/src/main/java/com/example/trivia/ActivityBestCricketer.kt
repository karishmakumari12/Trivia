package com.example.trivia

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.trivia.utility.QuizShareData
import kotlinx.android.synthetic.main.activity_best_cricketer.*

class ActivityBestCricketer : AppCompatActivity(), View.OnClickListener {

    //variable to get selected cricketer name
    private var selectedCricketerName: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_best_cricketer)
        initViews()
    }

    /*
    * Initialize views
    * */
    private fun initViews() {
        next_button.setOnClickListener(this)
        rb_jacques.setOnClickListener(this)
        rb_virat.setOnClickListener(this)
        rb_adam.setOnClickListener(this)
        rb_sachin.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val id: Int? = v?.id
        when (id) {
            R.id.next_button -> {
                if (rb_jacques.isChecked || rb_adam.isChecked || rb_virat.isChecked || rb_sachin.isChecked) {
                    val quizShareData: QuizShareData = ActivityName.quizShareData
                    quizShareData.bestCricketerSelected = selectedCricketerName
                    val intent = Intent(this@ActivityBestCricketer, ActivityFlagColor::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(
                        this@ActivityBestCricketer, getString(R.string.please_select_option),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            R.id.rb_jacques -> {
                if (rb_jacques.isChecked) {
                    rb_adam.isChecked = false
                    rb_virat.isChecked = false
                    rb_sachin.isChecked = false
                    selectedCricketerName = rb_jacques.text.toString()
                }

            }
            R.id.rb_adam -> {
                if (rb_adam.isChecked) {
                    rb_jacques.isChecked = false
                    rb_virat.isChecked = false
                    rb_sachin.isChecked = false
                    selectedCricketerName = rb_adam.text.toString()

                }
            }
            R.id.rb_virat -> {
                if (rb_virat.isChecked) {
                    rb_adam.isChecked = false
                    rb_jacques.isChecked = false
                    rb_sachin.isChecked = false
                    selectedCricketerName = rb_virat.text.toString()
                }
            }
            R.id.rb_sachin -> {
                if (rb_sachin.isChecked) {
                    rb_adam.isChecked = false
                    rb_virat.isChecked = false
                    rb_jacques.isChecked = false
                    selectedCricketerName = rb_sachin.text.toString()
                }
            }
        }
    }
}