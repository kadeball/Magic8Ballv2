package com.bignerdranch.android.magic8ballv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var ball_text: TextView

    val answers = arrayOf(
        "Yes",
        "Prolly",
        "Don't Ask Again",
        "I Already Told You",
        "My Sources Say No",
        "Stop Asking",
        "No",
        "HYFR"
    )

    lateinit var random: Random

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        random  = Random

        ball_text = findViewById(R.id.ball_text);

        ball_text.setOnClickListener{
            ball_text.text = answers[random.nextInt(answers.size)]

        }
    }
}