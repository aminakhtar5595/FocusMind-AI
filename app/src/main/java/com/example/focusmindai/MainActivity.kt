package com.example.focusmindai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.focusmindai.ui.screens.suggestions.SuggestionsScreen
import com.example.focusmindai.ui.screens.task.BreakScreen
import com.example.focusmindai.ui.screens.timer.TimerScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuggestionsScreen()
        }
    }
}