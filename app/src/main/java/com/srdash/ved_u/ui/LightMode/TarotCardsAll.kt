package com.srdash.ved_u.ui.LightMode

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.srdash.ved_u.data.Astrology.Content
import com.srdash.ved_u.data.Astrology.Tarot.majorArcanaImages
import com.srdash.ved_u.data.Astrology.Tarot.minorArcanaImages

@Composable
fun TarotCardsAll(){
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            majorArcanaImages.forEachIndexed { index, item ->
                item{
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = item),
                            contentDescription = null,
//                            modifier = Modifier.height(400.dp).fillMaxWidth(),
                            contentScale = ContentScale.Fit
                        )
                    }
                }
            }
            minorArcanaImages.forEachIndexed { index, item ->
                item.forEachIndexed { index2 , item2 ->
                    item{
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(id = item2),
                                contentDescription = null,
//                            modifier = Modifier.height(400.dp).fillMaxWidth(),
                                contentScale = ContentScale.Fit
                            )
                        }
                    }
                }
            }
        }
    }
}