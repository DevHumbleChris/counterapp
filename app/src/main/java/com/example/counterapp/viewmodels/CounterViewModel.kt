package com.example.counterapp.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    var counterValue by mutableIntStateOf(8)
        private set

    var updatedCounter by mutableIntStateOf(counterValue - counterValue)
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
        updatedCounter = counterValue -counterValue
        leftOfCounter = counterValue
    }

    fun setUserCounterValue (userValue: String) {
        counterValue = userValue.toInt()
    }
}