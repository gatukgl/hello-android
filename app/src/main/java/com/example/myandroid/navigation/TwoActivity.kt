package com.example.myandroid.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myandroid.R

class TwoActivity : BaseNavigationActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val name = intent.getStringExtra("name")
        Log.d(logTag, "Name that sent from One Activity is $name")
    }
}