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
fun GumHealthScreen(
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
                text = "❤️ Gum Health",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Healthy gums are an important part of maintaining good oral health.",
                fontSize = 17.sp
            )

            Spacer(modifier = Modifier.height(28.dp))

            InformationSection(
                title = "Why Gum Health Matters",
                text = "Your gums help support and protect your teeth. Keeping them healthy is an important part of maintaining your overall oral health."
            )

            InformationSection(
                title = "Plaque and Your Gums",
                text = "Plaque is a sticky film of bacteria that forms on teeth. If plaque is not removed regularly, it can irritate the gums and contribute to gum disease."
            )

            InformationSection(
                title = "What Is Gingivitis?",
                text = "Gingivitis is an early form of gum disease. The gums may become red, swollen, tender, or bleed during brushing or cleaning between the teeth."
            )

            InformationSection(
                title = "Keeping Your Gums Healthy",
                text = "Brush your teeth regularly with fluoride toothpaste and clean between your teeth every day. Good daily oral hygiene helps remove plaque from around the teeth and gumline."
            )

            InformationSection(
                title = "Be Gentle",
                text = "Brushing harder does not necessarily clean your teeth better. Use a soft-bristled toothbrush and gentle technique around the gumline."
            )

            InformationSection(
                title = "Warning Signs",
                text = "Bleeding, swollen, tender, or receding gums can be signs that your gums need attention. Persistent changes should be evaluated by a dental professional."
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