package com.example.counterapp.app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.counterapp.screens.NavigationArena

@Composable
fun CounterApp(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(android.graphics.Color.parseColor("#fbfbfd"))),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                Column(
                    verticalArrangement = Arrangement.Center
                ) {
                    IconButton(onClick = {
                        navController.navigate("home")
                    }) {
                        Icon(
                            imageVector = Icons.Outlined.Home,
                            contentDescription = "Home Icon",
                            modifier = Modifier.size(55.dp),
                            tint = Color(android.graphics.Color.parseColor("#8a4af3"))
                        )
                    }
                    Text(text = "Home", color = Color(android.graphics.Color.parseColor("#8a4af3")))
                }

                Column(
                    verticalArrangement = Arrangement.Center
                ) {
                    IconButton(onClick = {
                        navController.navigate("settings")
                    }) {
                        Icon(
                            imageVector = Icons.Outlined.Settings,
                            contentDescription = "Settings Icon",
                            modifier = Modifier.size(55.dp),
                            tint = Color(android.graphics.Color.parseColor("#8a4af3")),
                            )
                    }
                    Text(
                        text = "Settings",
                        color = Color(android.graphics.Color.parseColor("#8a4af3"))
                    )
                }

            }
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            color = Color(android.graphics.Color.parseColor("#fbfbfd"))
        ) {
            NavigationArena(navController)
        }
    }
}