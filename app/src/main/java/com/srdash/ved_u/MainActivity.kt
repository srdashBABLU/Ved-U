package com.srdash.ved_u

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.srdash.ved_u.data.Astrology.AllSigns
import com.srdash.ved_u.logics.Astro.DoshaAnalysisScreen
import com.srdash.ved_u.logics.Astro.charts.AstrologicalChart
import com.srdash.ved_u.ui.LightMode.TarotCardsAll
import com.srdash.ved_u.ui.splashScreens.AstrologyTypes
import com.srdash.ved_u.ui.splashScreens.SplashScreen
import com.srdash.ved_u.ui.splashScreens.SplashScreenLight
import com.srdash.ved_u.ui.theme.VedUTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VedUTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //SplashScreen()
                    //TarotCardsAll()
                    //AstrologyTypes()
                    //AllSigns()
                    //AstrologicalChart()
                    AppNavigation()
                    //DoshaAnalysisScreen()
                    //SplashScreenLight()
                }
            }
        }
    }
}