package com.example.myandroid.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myandroid.R

class TwoActivity : BaseNavigationActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)
    }
}