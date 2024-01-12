package com.own_world.popupmenubar

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val customeview = CostomeClass()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val popupMenu = findViewById<Button>(R.id.button)

        popupMenu.setOnClickListener {
            customeview.test(this,popupMenu)
        }


    }
}