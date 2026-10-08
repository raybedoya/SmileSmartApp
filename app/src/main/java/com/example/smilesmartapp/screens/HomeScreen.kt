package com.example.smilesmartapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SmileSmartHomeScreen(
    onStartLearning: () -> Unit
) {

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "🦷 SmileSmart",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = "Dental Hygiene Education",
                fontSize = 17.sp
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Good oral health starts with good daily habits.",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(28.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp)
            ) {

                Column(
                    modifier = Modifier.padding(20.dp)
                ) {

                    Text(
                        text = "🦷 DAILY TIP",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Brush twice a day for two minutes each time.",
                        fontSize = 16.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Explore Dental Health",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                TopicButton(
                    text = "🪥 Brushing",
                    modifier = Modifier.weight(1f)
                )

                TopicButton(
                    text = "🧵 Flossing",
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                TopicButton(
                    text = "❤️ Gum Health",
                    modifier = Modifier.weight(1f)
                )

                TopicButton(
                    text = "👅 Bad Breath",
                    modifier = Modifier.weight(1f)
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = onStartLearning,
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = "Start Learning",
                    fontSize = 18.sp
                )
            }
        }
    }
}

@Composable
private fun TopicButton(
    text: String,
    modifier: Modifier = Modifier
) {

    OutlinedButton(
        onClick = {},
        modifier = modifier.height(60.dp),
        shape = RoundedCornerShape(14.dp)
    ) {

        Text(
            text = text,
            textAlign = TextAlign.Center
        )
    }
}

