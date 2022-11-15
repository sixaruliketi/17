package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //I varianti
    lateinit var number : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // I varianti
        number = findViewById(R.id.numberTextView)


        // II varianti
        val playButton = findViewById<TextView>(R.id.playButton)

        playButton.setOnClickListener {
            Toast.makeText(this ,"congrats", Toast.LENGTH_SHORT).show()
        }


        // III varianti
        findViewById<TextView>(R.id.continueButton).setOnClickListener {
            var num = number.text.toString().toInt()
            num++
            number.text = num.toString()
        }

        var num1 = findViewById<TextView>(R.id.num1)
        var num2 = findViewById<TextView>(R.id.num2)
        var sum = findViewById<TextView>(R.id.sum)

        findViewById<Button>(R.id.button).setOnClickListener {
            var number1 = num1.text.toString().toInt()
            var number2 = num2.text.toString().toInt()
            var sum2 = number1 + number2
            sum.text = sum2.toString()
        }

    }
}