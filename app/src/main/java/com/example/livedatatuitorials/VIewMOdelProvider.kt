package com.example.livedatatuitorials

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class VIewMOdelProvider(var total:Int,var name:String):ViewModelProvider.Factory {



    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return  when(modelClass){
            MainActivityVIewModel::class.java->{
                MainActivityVIewModel(total,name)
            }
            else->throw IllegalArgumentException("error")
        } as T
    }
}