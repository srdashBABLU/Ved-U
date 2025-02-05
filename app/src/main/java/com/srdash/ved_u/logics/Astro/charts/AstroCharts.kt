package com.srdash.ved_u.logics.Astro.charts

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun AstrologicalChart() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.size(300.dp)) {
            val radius = size.minDimension / 2
            val center = Offset(size.width / 2, size.height / 2)

            // Draw the outer circle (Zodiac Wheel)
            drawCircle(
                color = Color.White,
                center = center,
                radius = radius,
                style = Stroke(width = 4.dp.toPx())
            )

            // Draw inner circle (Smaller wheel inside)
            drawCircle(
                color = Color.White.copy(alpha = 0.5f),
                center = center,
                radius = radius * 0.8f,
                style = Stroke(width = 2.dp.toPx())
            )

            // Draw dividing lines (12 sections)
            for (i in 0 until 12) {
                val angle = (i * 30).toFloat()
                val endX = center.x + cos(Math.toRadians(angle.toDouble())).toFloat() * radius
                val endY = center.y + sin(Math.toRadians(angle.toDouble())).toFloat() * radius

                drawLine(
                    color = Color.White,
                    start = center,
                    end = Offset(endX, endY),
                    strokeWidth = 2.dp.toPx()
                )
            }
        }

        // Add Zodiac Symbols
        ZodiacSymbols()
    }
}

@Composable
fun ZodiacSymbols() {
    val zodiacSigns = listOf(
        "♈", "♉", "♊", "♋", "♌", "♍",
        "♎", "♏", "♐", "♑", "♒", "♓"
    )
    val angles = List(12) { index -> (index * 30).toFloat() }

    Box(
        modifier = Modifier.size(300.dp),
        contentAlignment = Alignment.Center
    ) {
        zodiacSigns.forEachIndexed { index, sign ->
            val angleRad = Math.toRadians(angles[index].toDouble())
            val offsetX = cos(angleRad).toFloat() * 120f
            val offsetY = sin(angleRad).toFloat() * 120f

            Text(
                text = sign,
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier.offset(x = offsetX.dp, y = offsetY.dp)
            )
        }
    }
}

