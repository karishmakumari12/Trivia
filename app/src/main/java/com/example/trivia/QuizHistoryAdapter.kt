package com.example.trivia

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.trivia.roomdatabase.Quiz
import kotlinx.android.synthetic.main.quiz_history_adapter_raw.view.*

class QuizHistoryAdapter(var quizList: List<Quiz>,var activity:Activity) : RecyclerView.Adapter<QuizHistoryAdapter.QuizViewHolder>() {
    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.quiz_history_adapter_raw, parent, false)

        return QuizViewHolder(view)
    }


    override fun getItemCount(): Int {
        return quizList.size
    }

    override fun onBindViewHolder(holder: QuizViewHolder, position: Int) {
        val quiz:Quiz=quizList[position]
        holder.tv_name_value.text=quiz.userName
        holder.game_number_value.text=String.format(
            activity.resources.getString(R.string.game),
            position+1
        )
        holder.tv_date_time_value.text=quiz.gameDateTime
        holder.tv_cricketer_value.text=quiz.cricketerName
        holder.tv_flag_value.text=quiz.flagColor
    }

    class QuizViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tv_name_value:TextView=itemView.tv_name_value
        var game_number_value:TextView=itemView.game_number_value
        var tv_date_time_value:TextView=itemView.tv_date_time_value
        var tv_cricketer_value:TextView=itemView.tv_cricketer_value
        var tv_flag_value:TextView=itemView.tv_flag_value

    }

}

