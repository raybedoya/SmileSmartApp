package com.example.smilesmartapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopicsScreen(
    onBack: () -> Unit,
    onBrushingClick: () -> Unit,
    onFlossingClick: () -> Unit,
    onGumHealthClick: () -> Unit,
    onBadBreathClick: () -> Unit
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
                text = "Dental Health Topics",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Explore information about keeping your teeth and gums healthy.",
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            InfoTopicCard(
                emoji = "🪥",
                title = "Brushing",
                description = "Proper brushing techniques and healthy habits.",
                onClick = onBrushingClick
            )

            InfoTopicCard(
                emoji = "🧵",
                title = "Flossing",
                description = "Cleaning between your teeth and along the gumline.",
                onClick = onFlossingClick
            )

            InfoTopicCard(
                emoji = "❤️",
                title = "Gum Health",
                description = "Information about keeping your gums healthy.",
                onClick = onGumHealthClick
            )

            InfoTopicCard(
                emoji = "👅",
                title = "Bad Breath",
                description = "Common causes and ways to manage bad breath.",
                onClick = onBadBreathClick
            )
        }
    }
}

@Composable
private fun InfoTopicCard(
    emoji: String,
    title: String,
    description: String,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = emoji,
                fontSize = 30.sp
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {

                Text(
                    text = title,
                    fontSize = 19.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = description,
                    fontSize = 14.sp
                )
            }
        }
    }
}

