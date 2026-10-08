package com.example.smilesmartapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.smilesmartapp.ui.theme.SmileSmartAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SmileSmartAppTheme {
                SmileSmartApp()
            }
        }
    }
}