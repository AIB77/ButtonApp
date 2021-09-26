package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


var count =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button4= findViewById<Button>(R.id.button4)
        val button3= findViewById<Button>(R.id.button3)
        val  mytextView=findViewById<TextView>(R.id.mytextView)
        button4.setOnClickListener {
            //Toast.makeText(this,"the Botton is work ",Toast.LENGTH_LONG).show()
            count++
            mytextView.text= count.toString()

        }
        button3.setOnClickListener {
            //Toast.makeText(this,"the Botton is work ",Toast.LENGTH_LONG).show()
            count--
            mytextView.text= count.toString()

        }

    }
}