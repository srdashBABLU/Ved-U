package com.srdash.ved_u.ui.splashScreens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.srdash.ved_u.ui.theme.UrbanistMedium
import com.srdash.ved_u.ui.theme.offWhite

@Composable
fun AstrologyTypes(){
    Column (
        modifier = Modifier.fillMaxSize().padding(start = 16.dp, end = 16.dp, top = 48.dp, bottom = 16.dp)
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Please select your preferred type of \nAstrology!",
                textAlign = TextAlign.Center,
                fontSize = 18.sp,
                style = TextStyle(
                    fontFamily = UrbanistMedium,
                    fontSize = 14.sp
                )
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Column {
            Card(
                modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp).height(56.dp),
                colors = CardDefaults.cardColors(offWhite),
                shape = RoundedCornerShape(32.dp)
            ) {
                Row (
                    modifier = Modifier.fillMaxSize().clickable(onClick = {}),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Western Astrology",
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp,
                        style = TextStyle(
                            fontFamily = UrbanistMedium,
                            fontSize = 14.sp
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp).height(56.dp),
                colors = CardDefaults.cardColors(offWhite),
                shape = RoundedCornerShape(32.dp)
            ) {
                Row (
                    modifier = Modifier.fillMaxSize().clickable(onClick = {}),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Vedic Astrology",
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp,
                        style = TextStyle(
                            fontFamily = UrbanistMedium,
                            fontSize = 14.sp
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Card(
                modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp).height(56.dp),
                colors = CardDefaults.cardColors(offWhite),
                shape = RoundedCornerShape(32.dp)
            ) {
                Row (
                    modifier = Modifier.fillMaxSize().clickable(onClick = {}),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Chinese Astrology",
                        textAlign = TextAlign.Center,
                        fontSize = 18.sp,
                        style = TextStyle(
                            fontFamily = UrbanistMedium,
                            fontSize = 14.sp
                        )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ATPrev(){
    AstrologyTypes()
}