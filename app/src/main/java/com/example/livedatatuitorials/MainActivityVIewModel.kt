package com.example.livedatatuitorials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityVIewModel(total:Int,name:String):ViewModel() {

    private var totalValue=MutableLiveData<Int>()
     var nameX=MutableLiveData<String>()

    init {
        totalValue.value=total
        nameX.value=name
    }
        val getTotal:LiveData<Int>
        get() = totalValue

        val getName:LiveData<String>
        get()= nameX

    fun getAdditionWithOne(){
        totalValue.value= totalValue.value?.plus(1)
    }






}