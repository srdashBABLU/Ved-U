package com.srdash.ved_u

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.srdash.ved_u.ui.DarkMode.LoginPageDark
import com.srdash.ved_u.ui.splashScreens.SplashScreen
import com.srdash.ved_u.ui.splashScreens.SplashScreenLight

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash") {
        composable("splash"){ if(isSystemInDarkTheme()) SplashScreen() else SplashScreenLight() }
        composable("login"){ if(isSystemInDarkTheme()) LoginPageDark() else LoginPageDark() }
    }
}