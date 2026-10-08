package com.example.smilesmartapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BrushingScreen(
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
                text = "🪥 Brushing",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Good brushing habits help remove plaque and protect your teeth and gums.",
                fontSize = 17.sp
            )

            Spacer(modifier = Modifier.height(28.dp))

            InformationSection(
                title = "How Often Should You Brush?",
                text = "Brush your teeth twice a day with fluoride toothpaste."
            )

            InformationSection(
                title = "How Long Should You Brush?",
                text = "Brush for about two minutes each time. Clean the outer, inner, and chewing surfaces of your teeth."
            )

            InformationSection(
                title = "Brushing Technique",
                text = "Use gentle, short strokes and carefully clean around the gumline. Avoid aggressive scrubbing."
            )

            InformationSection(
                title = "Choosing a Toothbrush",
                text = "A soft-bristled toothbrush is generally recommended. Choose one that comfortably reaches all areas of your mouth."
            )

            InformationSection(
                title = "Toothpaste",
                text = "Fluoride toothpaste helps strengthen tooth enamel and protect against cavities."
            )

            InformationSection(
                title = "Replace Your Toothbrush",
                text = "Replace your toothbrush or electric toothbrush head when the bristles become worn or frayed."
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

@Composable
fun InformationSection(
    title: String,
    text: String
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        shape = RoundedCornerShape(16.dp)
    ) {

        Column(
            modifier = Modifier.padding(18.dp)
        ) {

            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = text,
                fontSize = 16.sp,
                lineHeight = 23.sp
            )
        }
    }
}

