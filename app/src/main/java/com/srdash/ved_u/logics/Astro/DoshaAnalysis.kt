package com.srdash.ved_u.logics.Astro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DoshaAnalysisScreen() {
    var name by remember { mutableStateOf("") }
    var birthDate by remember { mutableStateOf("") }
    var birthTime by remember { mutableStateOf("") }
    var birthPlace by remember { mutableStateOf("") }
    var selectedZodiac by remember { mutableStateOf("Select Zodiac Sign") }
    var showDoshas by remember { mutableStateOf(false) }

    val zodiacSigns = listOf(
        "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo",
        "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"
    )

    val detectedDoshas = remember { mutableStateListOf<String>() }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("🔮 Dosha Analysis", fontSize = 24.sp, color = Color.White)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Full Name") },
            keyboardOptions = KeyboardOptions.Default,
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(Color.White)
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = birthDate,
            onValueChange = { birthDate = it },
            label = { Text("Birth Date (DD/MM/YYYY)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(Color.White)
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = birthTime,
            onValueChange = { birthTime = it },
            label = { Text("Birth Time (HH:MM)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(Color.White)
        )

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = birthPlace,
            onValueChange = { birthPlace = it },
            label = { Text("Birth Place") },
            keyboardOptions = KeyboardOptions.Default,
            modifier = Modifier.fillMaxWidth(),
            colors = OutlinedTextFieldDefaults.colors(Color.White)
        )

        Spacer(modifier = Modifier.height(8.dp))

        ExposedDropdownMenuBox(
            expanded = showDoshas,
            onExpandedChange = { showDoshas = it }
        ) {
            OutlinedTextField(
                value = selectedZodiac,
                onValueChange = {},
                readOnly = true,
                label = { Text("Select Zodiac Sign") },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = showDoshas) },
                modifier = Modifier.fillMaxWidth(),
                colors = OutlinedTextFieldDefaults.colors(Color.White)
            )
            ExposedDropdownMenu(
                expanded = showDoshas,
                onDismissRequest = { showDoshas = false }
            ) {
                zodiacSigns.forEach { sign ->
                    DropdownMenuItem(
                        text = { Text(sign) },
                        onClick = {
                            selectedZodiac = sign
                            showDoshas = false
                        }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                detectedDoshas.clear()
                if (selectedZodiac == "Scorpio" || selectedZodiac == "Aries") {
                    detectedDoshas.add("⚠️ Mangal Dosha")
                }
                if (selectedZodiac == "Capricorn" || selectedZodiac == "Aquarius") {
                    detectedDoshas.add("⚠️ Shani Dosha")
                }
                if (birthDate.endsWith("4") || birthDate.endsWith("7")) {
                    detectedDoshas.add("⚠️ Kaal Sarp Dosha")
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFBB86FC))
        ) {
            Text("Check Doshas", color = Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (detectedDoshas.isNotEmpty()) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGray, shape = RoundedCornerShape(16.dp))
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("🛑 Detected Doshas", fontSize = 18.sp, color = Color.White)
                detectedDoshas.forEach {
                    Text(it, fontSize = 16.sp, color = Color.Red)
                }
            }
        }
    }
}
