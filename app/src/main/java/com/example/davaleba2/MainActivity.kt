package com.example.davaleba2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button) //თუ დრე დამრჩება -> lateinit
        val eText = findViewById<EditText>(R.id.eText)
        val tView = findViewById<TextView>(R.id.tView)
        var str = ""

        button.setOnClickListener(View.OnClickListener {
            str = eText.text.toString()
            tView.text = numberConverter(str.toInt())
        })



    }
}
