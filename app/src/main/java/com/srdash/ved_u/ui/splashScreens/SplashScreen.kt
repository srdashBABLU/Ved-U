package com.srdash.ved_u.ui.splashScreens

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import com.srdash.ved_u.R
import com.srdash.ved_u.ui.theme.Purple40
import com.srdash.ved_u.ui.theme.Purple80
import com.srdash.ved_u.ui.theme.UrbanistSemiBold
import com.srdash.ved_u.ui.theme.black
import com.srdash.ved_u.ui.theme.gray
import com.srdash.ved_u.ui.theme.lightGray
import com.srdash.ved_u.ui.theme.offWhite2
import com.srdash.ved_u.ui.theme.white
import kotlin.random.Random

@Composable
fun SplashScreen() {
    var startAnimation by remember { mutableStateOf(false) }

    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(durationMillis = 1500)
    )

    val scaleAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0.8f,
        animationSpec = tween(durationMillis = 1500, easing = FastOutSlowInEasing)
    )

    LaunchedEffect(Unit) {
        startAnimation = true
        delay(3000)
    }

    val transition = rememberInfiniteTransition()

    val rotationAngle by transition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 40000, easing = LinearEasing), // 40s for slow rotation
            repeatMode = RepeatMode.Restart
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFF1E1A3A), Color(0xFF000000))
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        AnimatedBokehEffect() // Moving Bokeh Effect
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.zodiac_wheel),
                contentDescription = "Zodiac Wheel",
                modifier = Modifier
                    .size(300.dp)
                    .graphicsLayer {
                        alpha = alphaAnim.value
                        scaleX = scaleAnim.value
                        scaleY = scaleAnim.value
                        rotationZ = rotationAngle
                    }
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Welcome to",
                color = offWhite2,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.alpha(alphaAnim.value)
            )

            Text(
                text = "Ved-U",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.alpha(alphaAnim.value)
            )

            Text(
                text = "Unlock the Mysteries of the Universe",
                color = Color.LightGray,
                fontSize = 12.sp,
                modifier = Modifier.alpha(alphaAnim.value)
            )
        }
    }

    // the continue button
    Column(
        modifier = Modifier.fillMaxSize().padding(start = 24.dp, end = 24.dp, bottom = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Card(
            modifier = Modifier.fillMaxWidth().height(64.dp),
            shape = RoundedCornerShape(42.dp),
            colors = CardDefaults.cardColors(Purple40.copy(0.4f))
        ) {
            Row(
                modifier = Modifier.fillMaxSize().clickable(onClick = {

                }).padding(start = 16.dp, end = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier.size(50.dp),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(Color.Transparent)
                ) {}
                Text(
                    text = "Continue",
                    fontSize = 18.sp,
                    color = white,
                    fontWeight = FontWeight.SemiBold
                )

                Card(
                    modifier = Modifier.size(50.dp),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(Purple80),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Row (
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ){
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null
                        )
                    }
                }

            }
        }
    }
}

@Composable
fun SplashScreenLight() {
    var startAnimation by remember { mutableStateOf(false) }

    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(durationMillis = 1500)
    )

    val scaleAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0.8f,
        animationSpec = tween(durationMillis = 1500, easing = FastOutSlowInEasing)
    )

    LaunchedEffect(Unit) {
        startAnimation = true
        delay(3000)
    }

    val transition = rememberInfiniteTransition()

    val rotationAngle by transition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 40000, easing = LinearEasing), // 40s for slow rotation
            repeatMode = RepeatMode.Restart
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color(0xFFFFFFFF), lightGray)
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        AnimatedBokehEffect() // Moving Bokeh Effect
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.zodiac_wheel),
                contentDescription = "Zodiac Wheel",
                modifier = Modifier
                    .size(300.dp)
                    .graphicsLayer {
                        alpha = alphaAnim.value
                        scaleX = scaleAnim.value
                        scaleY = scaleAnim.value
                        rotationZ = rotationAngle
                    }
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Welcome to",
                color = gray,
                fontSize = 22.sp,
                style = TextStyle(
                    fontFamily = UrbanistSemiBold
                ),
                modifier = Modifier.alpha(alphaAnim.value)
            )

            Text(
                text = "Ved-U",
                color = black,
                fontSize = 32.sp,
                style = TextStyle(
                    fontFamily = UrbanistSemiBold
                ),
                modifier = Modifier.alpha(alphaAnim.value)
            )

            Text(
                text = "Unlock the Mysteries of the Universe",
                color = gray,
                style = TextStyle(
                    fontFamily = UrbanistSemiBold
                ),
                fontSize = 12.sp,
                modifier = Modifier.alpha(alphaAnim.value)
            )
        }
    }

    // the continue button
    Column(
        modifier = Modifier.fillMaxSize().padding(start = 24.dp, end = 24.dp, bottom = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Card(
            modifier = Modifier.fillMaxWidth().height(64.dp),
            shape = RoundedCornerShape(42.dp),
            colors = CardDefaults.cardColors(Purple40)
        ) {
            Row(
                modifier = Modifier.fillMaxSize().clickable(onClick = {

                }).padding(start = 16.dp, end = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier.size(50.dp),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(Color.Transparent)
                ) {}
                Text(
                    text = "Continue",
                    fontSize = 18.sp,
                    color = white,
                    fontWeight = FontWeight.SemiBold
                )

                Card(
                    modifier = Modifier.size(50.dp),
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(Purple80),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Row (
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ){
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null
                        )
                    }
                }

            }
        }
    }
}


// 🌟 Moving Glowing Bokeh Effect
@Composable
fun AnimatedBokehEffect() {
    val colors = listOf(
        Color(0xFFFFC107), // Gold
        Color(0xFF6200EE), // Purple
        Color(0xFF03DAC5), // Aqua
        Color(0xFFE91E63), // Pink
        Color(0xFF673AB7), // Deep Purple
    )

    val bokehSpots = remember {
        List(10) {
            BokehSpot(
                startX = Random.nextFloat() * 1000f, // Random X Position
                startY = Random.nextFloat() * 1500f, // Random Y Position
                color = colors.random(),
                radius = 350f // Bigger glow effect
            )
        }
    }

    val transition = rememberInfiniteTransition()

    val animatedOffsets = bokehSpots.map { spot ->
        val animatedX = transition.animateFloat(
            initialValue = spot.startX,
            targetValue = spot.startX + Random.nextFloat() * 100f - 50f,
            animationSpec = infiniteRepeatable(
                animation = tween(durationMillis = 6000, easing = LinearEasing),
                repeatMode = RepeatMode.Reverse
            )
        )

        val animatedY = transition.animateFloat(
            initialValue = spot.startY,
            targetValue = spot.startY + Random.nextFloat() * 100f - 50f,
            animationSpec = infiniteRepeatable(
                animation = tween(durationMillis = 6000, easing = LinearEasing),
                repeatMode = RepeatMode.Reverse
            )
        )

        animatedX to animatedY
    }

    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .blur(142.dp)
    ) {
        animatedOffsets.forEachIndexed { index, (xAnim, yAnim) ->
            drawCircle(
                color = bokehSpots[index].color.copy(alpha = 0.6f),
                radius = bokehSpots[index].radius,
                center = Offset(xAnim.value, yAnim.value)
            )
        }
    }
}

// Data class for a Bokeh Spot
data class BokehSpot(val startX: Float, val startY: Float, val color: Color, val radius: Float)

@Preview(showBackground = true)
@Composable
fun PreviewSplashScreen() {
    SplashScreen()
}
