package com.srdash.ved_u.logics.Formattings

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.srdash.ved_u.ui.theme.white

@Composable
fun ScreenWidthExample() {
    val configuration = LocalConfiguration.current
    val screenWidthDp = configuration.screenWidthDp
    val screenHeight = configuration.screenHeightDp
    val totalArea = (screenHeight * screenWidthDp)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Screen Width: $screenWidthDp")
        Text(text = "Screen height: $screenHeight")
        Text(text = "Total area: $totalArea")
        Card(
            modifier = Modifier.width(300.dp).height(20.dp),
            colors = CardDefaults.cardColors(white)
        ) {  }
        Card (
            modifier = Modifier.height(700.dp).width(20.dp),
            colors = CardDefaults.cardColors(white)
        ){ }
    }
}
