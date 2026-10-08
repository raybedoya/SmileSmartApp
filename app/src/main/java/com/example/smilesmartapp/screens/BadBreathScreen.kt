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
fun BadBreathScreen(
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
                text = "👅 Bad Breath",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Bad breath can have many causes, including bacteria in the mouth, dry mouth, certain foods, and oral health problems.",
                fontSize = 17.sp
            )

            Spacer(modifier = Modifier.height(28.dp))

            InformationSection(
                title = "What Causes Bad Breath?",
                text = "Bacteria and food debris in the mouth can contribute to unpleasant odors. Bad breath can also be associated with dry mouth, certain foods, tobacco use, gum disease, and other conditions."
            )

            InformationSection(
                title = "Oral Hygiene",
                text = "Regular brushing and cleaning between your teeth help remove plaque and food debris that may contribute to bad breath."
            )

            InformationSection(
                title = "Clean Your Tongue",
                text = "Bacteria and debris can collect on the tongue. Gently cleaning your tongue may help reduce odor-causing buildup."
            )

            InformationSection(
                title = "Dry Mouth",
                text = "Saliva helps clean the mouth. When the mouth becomes dry, bad breath may become more noticeable. Drinking water can help maintain hydration."
            )

            InformationSection(
                title = "Food and Tobacco",
                text = "Certain foods can temporarily affect breath. Tobacco products can also contribute to persistent unpleasant breath and other oral health problems."
            )

            InformationSection(
                title = "Persistent Bad Breath",
                text = "If bad breath continues despite good oral hygiene, consider speaking with a dentist or other healthcare professional. Persistent bad breath can sometimes be associated with an oral or medical condition."
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