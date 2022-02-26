package com.example.livedatatuitorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.livedatatuitorials.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var viewModel2: ViewModel2
    lateinit var bindind:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindind=DataBindingUtil.setContentView(this,R.layout.activity_main2)
        viewModel2=ViewModelProvider(this)[ViewModel2::class.java]
        bindind.myviewMOdel2=viewModel2
        bindind.lifecycleOwner=this

        bindind.button2.setOnClickListener {
            if (TextUtils.isEmpty(bindind.editTextTextPersonName2.text.toString()))
            {
                bindind.editTextTextPersonName2.error="error"
                return@setOnClickListener
            }else{
                viewModel2.add()
                bindind.editTextTextPersonName2.text.clear()
            }

        }

    }
}