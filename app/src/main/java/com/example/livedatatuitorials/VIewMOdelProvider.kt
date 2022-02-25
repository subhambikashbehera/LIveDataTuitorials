package com.example.livedatatuitorials

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class VIewMOdelProvider(var total:Int):ViewModelProvider.Factory {



    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return  when(modelClass){
            MainActivityVIewModel::class.java->{
                MainActivityVIewModel(total)
            }
            else->throw IllegalArgumentException("error")
        } as T
    }
}