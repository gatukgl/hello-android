package com.example.myandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myandroid.databinding.ActivityMainBinding
import com.example.myandroid.kotlin.OddsModel

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val oddsAdapter: OddsAdapter by lazy {
        OddsAdapter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpView()
    }

    private fun setUpView() {
        binding.rvOdds.adapter = oddsAdapter
        binding.rvOdds.layoutManager = LinearLayoutManager(this)
        oddsAdapter.update(mockOddsModel())
    }

    private fun mockOddsModel(): List<OddsModel> {
        return listOf(
            OddsModel(
                image = R.drawable.odds_logo,
                name = "Name 1"
            ),
            OddsModel(
                image = R.drawable.ic_launcher_foreground,
                name = "Name 2"
            )
        )
    }
}
