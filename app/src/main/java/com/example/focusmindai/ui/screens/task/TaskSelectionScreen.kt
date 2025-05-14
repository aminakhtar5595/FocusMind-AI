package com.example.focusmindai.ui.screens.task

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun TaskSelectionScreen() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Row (
            modifier = Modifier.padding(bottom = 20.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier
                    .size(30.dp)
                    .clickable { }
            )
            Text(
                text = "TASK SELECTION",
                style = MaterialTheme.typography.headlineLarge.copy(textAlign = TextAlign.Center),
                modifier = Modifier.fillMaxWidth()
            )
        }

        Column (
            modifier = Modifier
                .padding(bottom = 20.dp)
                .border(width = 0.5.dp, color = Color.Black, shape = RoundedCornerShape(10))
                .padding(15.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "25:00",
                style = MaterialTheme.typography.displayLarge,
                modifier = Modifier.padding(bottom = 5.dp)
            )

            Text(
                text = "Study biology",
                style = MaterialTheme.typography.titleLarge
            )
        }

        Column (
            modifier = Modifier
                .padding(bottom = 20.dp)
                .border(width = 0.5.dp, color = Color.Black, shape = RoundedCornerShape(10))
                .padding(15.dp)
                .fillMaxWidth(),
        ) {
            Row {
                Icon(
                    imageVector = Icons.Filled.Settings,
                    contentDescription = "Settings",
                    modifier = Modifier
                        .size(28.dp)
                        .clickable { }
                )
                Text(
                    text = "SUGGESTIONS",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

            Text(
                text = "Listen to this focus playlist!",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(vertical = 10.dp)
            )

            Button(
                onClick = {  },
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(vertical = 10.dp),
                border = BorderStroke(1.5.dp, Color(0xFF4F7CCB)),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Color(0xFF4F7CCB),
                    containerColor = Color.Transparent
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Dismiss",
                    style = MaterialTheme.typography.titleLarge
                )
            }
        }
    }
}