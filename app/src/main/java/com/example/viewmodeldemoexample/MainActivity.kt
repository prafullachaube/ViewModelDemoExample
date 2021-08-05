package com.example.viewmodeldemoexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodeldemoexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainActivityViewModel :MainActivityViewModel;
    lateinit var binding:ActivityMainBinding
    lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this,R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(1)
        mainActivityViewModel = ViewModelProvider(this,viewModelFactory).get(MainActivityViewModel::class.java)
        binding.textView.text = mainActivityViewModel.getCount().toString()
        binding.button.setOnClickListener {
            mainActivityViewModel.updateCount()
            binding.textView.text = mainActivityViewModel.getCount().toString()
        }

    }
}