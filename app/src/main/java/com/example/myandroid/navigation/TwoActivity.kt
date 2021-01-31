package com.example.myandroid.navigation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myandroid.R
import java.security.AccessControlContext

class TwoActivity : BaseNavigationActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val twoModel = intent.getParcelableExtra<TwoModel>("senderModel")
        Log.d(logTag, "TwoModel from one activity ${twoModel?.name}")

    }

    companion object {
        private const val EXTRA_NAME = "name"
        private const val EXTRA_TWO_MODEL = "two_name"

//        fun startIntent(context: Context, name: ) {
//            Intent(context, TwoActivity::class.java)
//                .putExtra(EXTRA_TWO_MODEL, twoModel)
//                .run { context.startActivity(this)}
//        }

        fun startIntent(context: Context, twoModel: TwoModel) {
            Intent(context, TwoActivity::class.java)
                .putExtra(EXTRA_TWO_MODEL, twoModel)
                .run { context.startActivity(this)}
        }
    }
}