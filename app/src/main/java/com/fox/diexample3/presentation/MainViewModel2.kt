package com.fox.diexample3.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.fox.diexample3.domain.Repository
import com.fox.diexample3.domain.UseCase
import javax.inject.Inject

class MainViewModel2 @Inject constructor(
    private val repository: Repository
) : ViewModel() {
        fun method() {
            repository.method()
            Log.d("TEST", "Main_ViewMODEL_2")
        }
}