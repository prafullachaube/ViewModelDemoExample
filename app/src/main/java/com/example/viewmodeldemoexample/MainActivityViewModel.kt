package com.example.viewmodeldemoexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(val initialValue:Int) : ViewModel() {

    //private var count:Int = 0
    var mutableLiveData = MutableLiveData<Int>()

    init {
       // count = initialValue
        mutableLiveData.value = initialValue
    }

    public fun updateCount(){
        //count++;
    }

    public fun setValue(input :Int){
        mutableLiveData.value = mutableLiveData.value?.plus(input)
    }

  /*  public fun  getCount(): Int{
        return count
    }*/

}