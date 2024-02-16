package com.example.onboardingjetpackcompose

import androidx.annotation.DrawableRes

sealed class WelcomeScreen( val dtitle : String  , val des : String  , @DrawableRes val icon : Int) {


    object Welcome : WelcomeScreen("Welcome"  , "Hi there and welcome to our App. We hope you will like it", R.drawable.ic_welcome)
    object Details : WelcomeScreen("Details" , "This app is a simple example on the implementation of the on boarding.", R.drawable.ic_details)
    object Signup : WelcomeScreen("Sign Up" , " you like the concept of our app :) ? " , R.drawable.ic_login)

}