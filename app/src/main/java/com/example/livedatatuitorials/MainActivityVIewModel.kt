package com.example.livedatatuitorials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityVIewModel(total:Int):ViewModel() {

    private var totalValue=MutableLiveData<Int>()
    init {
        totalValue.value=total
    }
    fun getTotalValue():LiveData<Int>{
        return totalValue
    }

    fun getAdditionWithOne(){
        totalValue.value= totalValue.value?.plus(1)
    }

}