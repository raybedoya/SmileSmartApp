package com.example.smilesmartapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FlossingScreen(
    onBack: () -> Unit
) {

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
                .padding(24.dp)
        ) {

            TextButton(
                onClick = onBack
            ) {
                Text("← Back")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "🧵 Flossing",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Cleaning between your teeth helps remove plaque and food from areas that a toothbrush may not reach well.",
                fontSize = 17.sp
            )

            Spacer(modifier = Modifier.height(28.dp))

            InformationSection(
                title = "Why Clean Between Your Teeth?",
                text = "Plaque and food can collect between teeth and near the gumline. Cleaning these areas is an important part of maintaining healthy teeth and gums."
            )

            InformationSection(
                title = "How Often?",
                text = "Clean between your teeth every day. Choose a time that makes it easy to maintain the habit consistently."
            )

            InformationSection(
                title = "How to Floss",
                text = "Gently guide the floss between two teeth. Curve it around the side of one tooth and move it gently along the tooth surface and near the gumline. Repeat on the neighboring tooth before moving to the next space."
            )

            InformationSection(
                title = "Be Gentle",
                text = "Avoid snapping floss forcefully into the gums. Gentle technique helps clean the area while reducing unnecessary irritation."
            )

            InformationSection(
                title = "Other Interdental Cleaners",
                text = "Traditional dental floss is not the only option. Depending on your needs, interdental brushes, floss holders, or other interdental cleaning devices may be useful."
            )

            InformationSection(
                title = "If Your Gums Bleed",
                text = "Bleeding gums can occur when gums are inflamed. Persistent or significant bleeding should be discussed with a dental professional."
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "SmileSmart provides general educational information and is not a substitute for advice from a dental professional.",
                fontSize = 13.sp
            )

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}