package com.example.counterapp.viewmodels

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    var counterValue by mutableIntStateOf(8)
        private set

    var updatedCounter by mutableIntStateOf(0)
        private set

    var leftOfCounter by mutableIntStateOf(counterValue)
        private set

    fun incrementCounter () {
        updatedCounter++
        leftOfCounter--
    }

    fun decrementCounter () {
        updatedCounter--
        leftOfCounter++
    }

    fun clearCounter () {
        updatedCounter = 0
        leftOfCounter = counterValue
    }

    fun setUserCounterValue (userValue: Int) {
        counterValue = userValue
        leftOfCounter = userValue
        updatedCounter = 0
    }
}