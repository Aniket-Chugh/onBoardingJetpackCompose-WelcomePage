package com.example.onboardingjetpackcompose

import androidx.annotation.DrawableRes

sealed class Screen(val title : String , val route : String ) {
 object HomeScreen : Screen("Home" , "home")
    object SignUpScreen : Screen("Sign  Up" , "sign")
}