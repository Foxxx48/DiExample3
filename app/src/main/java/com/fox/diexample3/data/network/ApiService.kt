package com.fox.diexample3.data.network

import android.content.Context
import android.util.Log
import javax.inject.Inject

class ApiService @Inject constructor(
    private  val context: Context
) {
    fun method() {
        Log.d(TAG, "ApiService")
    }

    companion object {
        private const val TAG = "TAG_APP"
    }
}