package com.fox.diexample3.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.fox.diexample3.App
import com.fox.diexample3.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding!!

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val mainViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]
    }

    private val mainViewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[MainViewModel2::class.java]
    }

    private val myComponent by lazy {
        (application as App).myComponent
//            .activityComponentFactory()
//            .create()
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myComponent.inject(this)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModel.method()

        binding.act1BtnGo.setOnClickListener {
            Intent(this, MainActivity2::class.java).apply {
                putExtra("Key", "Hello from MainActivity")
                startActivity(this)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}