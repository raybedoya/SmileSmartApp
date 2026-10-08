package com.example.smilesmartapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.smilesmartapp.screens.BrushingScreen
import com.example.smilesmartapp.screens.SmileSmartHomeScreen
import com.example.smilesmartapp.screens.TopicsScreen
import com.example.smilesmartapp.screens.FlossingScreen
import com.example.smilesmartapp.screens.GumHealthScreen
import com.example.smilesmartapp.screens.BadBreathScreen

@Composable
fun SmileSmartApp() {

    var currentScreen by remember {
        mutableStateOf("home")
    }

    when (currentScreen) {

        "home" -> {
            SmileSmartHomeScreen(
                onStartLearning = {
                    currentScreen = "topics"
                }
            )
        }

        "topics" -> {
            TopicsScreen(
                onBack = {
                    currentScreen = "home"
                },
                onBrushingClick = {
                    currentScreen = "brushing"
                },
                onFlossingClick = {
                    currentScreen = "flossing"
                },
                onGumHealthClick = {
                    currentScreen = "gumHealth"
                },
                onBadBreathClick = {
                    currentScreen = "badBreath"
                }
            )
        }

        "brushing" -> {
            BrushingScreen(
                onBack = {
                    currentScreen = "topics"
                }
            )
        }

        "flossing" -> {
            FlossingScreen(
                onBack = {
                    currentScreen = "topics"
                }
            )
        }

        "gumHealth" -> {
            GumHealthScreen(
                onBack = {
                    currentScreen = "topics"
                }
            )
        }

        "badBreath" -> {
            BadBreathScreen(
                onBack = {
                    currentScreen = "topics"
                }
            )
        }
    }
}

