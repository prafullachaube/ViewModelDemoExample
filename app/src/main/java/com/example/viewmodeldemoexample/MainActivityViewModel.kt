package com.example.viewmodeldemoexample

import androidx.lifecycle.ViewModel

class MainActivityViewModel(val initialValue:Int) : ViewModel() {

   private var count:Int = 0;

    init {
        count = initialValue
    }

    public fun updateCount(){
        count++;
    }

    public fun  getCount(): Int{
        return count
    }

}