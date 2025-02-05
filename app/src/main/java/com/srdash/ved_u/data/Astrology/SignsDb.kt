package com.srdash.ved_u.data.Astrology

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.collections.listOf
import com.srdash.ved_u.R
import com.srdash.ved_u.ui.theme.UrbanistRegular
import com.srdash.ved_u.ui.theme.UrbanistSemiBold
import com.srdash.ved_u.ui.theme.black
import com.srdash.ved_u.ui.theme.grayLXC
import com.srdash.ved_u.ui.theme.offWhiteLXC
import com.srdash.ved_u.ui.theme.white

val AllSigns = listOf<String>(
    "Aries" ,
    "Taurus" ,
    "Gemini" ,
    "Cancer" ,
    "Leo" ,
    "Virgo" ,
    "Libra" ,
    "Scorpio" ,
    "Sagittarius" ,
    "Capricorn" ,
    "Aquarius" ,
    "Pisces"
)
val AllSignsImages = listOf<Int>(
    R.drawable.aries,
    R.drawable.taurus,
    R.drawable.gemini,
    R.drawable.cancer,
    R.drawable.leo,
    R.drawable.virgo,
    R.drawable.libra,
    R.drawable.scorpio,
    R.drawable.sagittarius,
    R.drawable.capricorn,
    R.drawable.aquarius,
    R.drawable.pisces
)

@Preview(showBackground = true)
@Composable
fun AllSigns(){
    Column(
        modifier = Modifier.fillMaxSize().padding(start = 16.dp, end = 16.dp, top = 48.dp, bottom = 16.dp),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        Text(
            text = "Daily Horoscope",
            style = TextStyle(
                fontFamily = UrbanistSemiBold
            ),
            fontSize = 18.sp,
            color = black
        )
        LazyRow {
            AllSigns.forEachIndexed { index, sign ->
                item{
                    Column(
                        modifier = Modifier.padding(4.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Card(
                            modifier = Modifier.size(64.dp),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(offWhiteLXC)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxSize(),
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(id = AllSignsImages[index]),
                                    contentDescription = null,
                                    contentScale = ContentScale.FillWidth
                                )
                            }
                        }
                        Text(
                            text = sign,
                            style = TextStyle(
                                fontFamily = UrbanistRegular
                            ),
                            fontSize = 12.sp,
                            color = grayLXC
                        )
                    }
                }
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(128.dp)
            .padding()
            .clip(RoundedCornerShape(16.dp))
            .clickable(onClick = {})){
            Box(
                modifier = Modifier.fillMaxSize()
            ){
                Image(
                    painter = painterResource(id = R.drawable.vedic), // Replace with your image
                    contentDescription = "Zodiac Background",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize(),
                    alpha = 0.9f
                )
            }

            Column(
                modifier = Modifier.padding(12.dp).fillMaxSize(),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "What will my future\nbe in the next\n5 years?",
                    style = TextStyle(
                        fontFamily = UrbanistSemiBold
                    ),
                    fontSize = 20.sp,
                    color = white
                )

                Card (
                    modifier = Modifier.height(28.dp).width(96.dp),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(white)
                ){
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Ask Astrologer",
                            style = TextStyle(
                                fontFamily = UrbanistSemiBold
                            ),
                            fontSize = 12.sp,
                            color = black
                        )
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(12.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom
            ) {
                Image(
                    painter = painterResource(id = R.drawable.vedicbramhinpng),
                    contentDescription = null
                )
            }
        }
    }
}