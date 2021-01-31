package com.example.myandroid.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.example.myandroid.R
import com.example.myandroid.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment() {
    private val binding: FragmentFirstBinding by lazy {
        FragmentFirstBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        return inflater.inflate(R.layout.fragment_first, container, false)
        Log.i(logTag, "onCreateView")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButton.setOnClickListener {
            (activity as? ExampleFragmentActivity)?.run {
                supportFragmentManager.commit {
                    setReorderingAllowed(true)
                    replace<SecondFragment>(R.id.fragment_container_view)
                    addToBackStack(null)
                }
            }
        }
    }
}