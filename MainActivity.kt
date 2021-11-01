package com.rhtth.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightEditText : EditText = findViewById(R.id.edit_height)  //명시적
        val weightEditText = findViewById<EditText>(R.id.edit_weight) //추론적

        val resultButton : Button = findViewById(R.id.btn_result)

        resultButton.setOnClickListener {

            if  (heightEditText.text.isEmpty() || weightEditText.text.isEmpty()){
                Toast.makeText(this, "값을 입력해 주세요.",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            val height : Int = heightEditText.text.toString().toInt()
            val weight : Int = weightEditText.text.toString().toInt()

            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra("height",height)
            intent.putExtra("weight",weight)

            startActivity(intent)



        }

    }


}
