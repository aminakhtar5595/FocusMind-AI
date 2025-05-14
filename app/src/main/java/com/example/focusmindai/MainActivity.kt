package com.example.focusmindai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.focusmindai.ui.screens.home.HomeScreen
import com.example.focusmindai.ui.screens.task.TaskSelectionScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskSelectionScreen()
        }
    }
}