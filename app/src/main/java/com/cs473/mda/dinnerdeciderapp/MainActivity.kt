package com.cs473.mda.dinnerdeciderapp

import android.R.attr.button
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var titleTextView: TextView? = null
    private var addFoodEditText: EditText? = null
    private var addFoodButton: Button? = null
    private var decideButton: Button? = null
    private var foodList = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListener()


    }


    private fun setupView() {
        titleTextView = findViewById(R.id.titleTextView)
        addFoodEditText = findViewById(R.id.addFoodEditText)
        addFoodButton = findViewById(R.id.addFoodButton)
        decideButton = findViewById(R.id.decideButton)
    }

    private fun setupListener() {
        add()
        decide()
    }

    private fun add() {
        addFoodButton?.setOnClickListener(View.OnClickListener {
            if (addFoodEditText!!.text!!.isNotEmpty()) {
                foodList.add(addFoodEditText?.text.toString())
                Toast.makeText(applicationContext,
                    R.string.successful_message, Toast.LENGTH_SHORT).show()
                addFoodEditText?.text?.clear()
            }
        })
    }

    private fun decide() {
        decideButton?.setOnClickListener(View.OnClickListener {
            titleTextView?.text = foodList.random()
        })
    }
}