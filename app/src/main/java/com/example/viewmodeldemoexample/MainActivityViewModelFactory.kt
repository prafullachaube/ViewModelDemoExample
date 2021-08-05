package com.example.viewmodeldemoexample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(private val initialValue:Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel :: class.java)){
            return MainActivityViewModel(initialValue) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}