package com.example.livedatatuitorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.livedatatuitorials.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModelProvider: VIewMOdelProvider
    lateinit var mainActivityVIewModel: MainActivityVIewModel
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelProvider=VIewMOdelProvider(125,"dubgghgj")
        mainActivityVIewModel=ViewModelProvider(this,viewModelProvider)[MainActivityVIewModel::class.java]

        binding.myVIewModel=mainActivityVIewModel
        binding.lifecycleOwner=this



    }




}