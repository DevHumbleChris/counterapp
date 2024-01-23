package com.example.counterapp.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.counterapp.viewmodels.CounterViewModel

@Composable
fun NavigationArena(navController: NavHostController, counterViewModel: CounterViewModel) {

    NavHost(navController = navController, startDestination = "home") {
        composable(route = "home") {
            HomeScreen(counterViewModel)
        }
        composable(route = "settings") {
            SettingsScreen(counterViewModel)
        }
    }
}