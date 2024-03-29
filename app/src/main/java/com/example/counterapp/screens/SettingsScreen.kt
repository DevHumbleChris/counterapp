package com.example.counterapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.counterapp.viewmodels.CounterViewModel

@Composable
fun SettingsScreen(counterViewModel: CounterViewModel) {
    Column(
        modifier = Modifier.padding(20.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Update your initial Counter Value here.",
                color = Color(android.graphics.Color.parseColor("#c4a4f9"))
            )
            Spacer(modifier = Modifier.height(5.dp))
            OutlinedTextField(
                value = counterViewModel.counterValue.toString(), onValueChange = { text ->
                    val intValue = text.toIntOrNull() ?: 0
                    counterViewModel.setUserCounterValue(userValue = intValue)
                },
                label = {
                    Text(text = "Counter Value")
                },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Done
                )
            )
        }
    }
}