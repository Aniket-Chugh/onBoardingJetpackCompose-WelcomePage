package com.example.onboardingjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.onboardingjetpackcompose.screens.HomeScreen
import com.example.onboardingjetpackcompose.screens.MainContent
import com.example.onboardingjetpackcompose.screens.SignUp

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) {
            HomeScreen(navController)
        }
        composable(Screen.SignUpScreen.route) {
            SignUp()
        }
    }
}