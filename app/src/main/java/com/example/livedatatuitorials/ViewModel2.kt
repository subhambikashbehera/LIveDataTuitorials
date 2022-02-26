package com.example.livedatatuitorials

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel2 : ViewModel() {
    var editData = MutableLiveData<Int>()
    var number = MutableLiveData<String>()


    init {
        number.value = "0"
        editData.value = 0
    }

    fun add() {
        editData.value = number.value?.let { editData.value!!.plus(it.toInt()) }
    }

}