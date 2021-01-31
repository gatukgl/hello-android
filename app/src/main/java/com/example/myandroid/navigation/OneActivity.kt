package com.example.myandroid.navigation

import android.content.Intent
import android.os.Bundle
import com.example.myandroid.databinding.ActivityOneBinding

class OneActivity : BaseNavigationActivity() {
    private val binding: ActivityOneBinding by lazy {
        ActivityOneBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpView()
    }

    private fun setUpView() {
        binding.btnNext.setOnClickListener {

            val name = binding.editName.text.toString()
            val intent  = Intent(this, TwoActivity::class.java)
//            intent.putExtra("name", name)
//            startActivity(intent)
            val twoModel = TwoModel(name = name)
            TwoActivity.startIntent(this, twoModel)
            finish() // This function use for destroy one activity from view stack
        }
    }
}