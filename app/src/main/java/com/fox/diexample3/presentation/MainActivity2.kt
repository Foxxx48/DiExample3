package com.fox.diexample3.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.fox.diexample3.App
import com.fox.diexample3.R
import com.fox.diexample3.databinding.ActivityMain2Binding
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {
    private var _binding: ActivityMain2Binding? = null
    private val binding
        get() = _binding!!

    @Inject
    lateinit var viewModelFactory: ViewModelFactory


    private val mainViewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[MainViewModel2::class.java]
    }

    private val myComponent by lazy {
        (application as App).myComponent
//            .activityComponentFactory()
//            .create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        myComponent.inject(this)
        super.onCreate(savedInstanceState)
        _binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModel2.method()
        binding.act2Tv2.text = getIntent().getStringExtra("Key")

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}