package com.example.trivia.utility

import java.io.Serializable

data class QuizShareData(var value:String):Serializable {
    var quizStartDateTime: String = ""
    var userNameEntered: String = ""
    var bestCricketerSelected: String = ""
    var finalFlagColorsSelected: String = ""

}