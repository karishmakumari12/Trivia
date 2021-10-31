package com.example.trivia

import android.content.Intent
import android.os.Bundle
import android.app.Activity
import android.os.Handler


class ActivitySplash : Activity() {
    /** Duration of wait  */
    private val SPLASH_DISPLAY_LENGTH = 3000

    /** Called when the activity is first created.  */
    public override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        setContentView(R.layout.activity_splash)

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        Handler().postDelayed(Runnable { /* Create an Intent that will start the Menu-Activity. */
            val mainIntent = Intent(this@ActivitySplash, ActivityName::class.java)
            startActivity(mainIntent)
            finish()
        }, SPLASH_DISPLAY_LENGTH.toLong())
    }
}