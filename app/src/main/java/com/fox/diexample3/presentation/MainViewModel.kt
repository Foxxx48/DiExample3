package com.fox.diexample3.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.fox.diexample3.domain.UseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val useCase: UseCase
) : ViewModel() {
    fun method() {
        useCase()
        Log.d("TEST", "Main_ViewMODEL_1")
    }
}