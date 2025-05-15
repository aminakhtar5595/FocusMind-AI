package com.example.focusmindai.ui.screens.timer

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun TimerScreen() {
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
                text = "POMODORO TIMER",
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
        ) {
            Row {
                Icon(
                    imageVector = Icons.Filled.Check,
                    contentDescription = "Tick Icon",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { }
                )

                Column (
                    modifier = Modifier.padding(start = 10.dp)
                ) {
                    Text(
                        text = "Practice Piano",
                        style = MaterialTheme.typography.headlineSmall,
                    )
                    Text(
                        text = "Break",
                        style = MaterialTheme.typography.bodyLarge,
                    )
                }
            }
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
                    imageVector = Icons.Filled.Check,
                    contentDescription = "Tick Icon",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { }
                )
                Column (
                    modifier = Modifier.padding(start = 10.dp)
                ) {
                    Text(
                        text = "Study Biology",
                        style = MaterialTheme.typography.headlineSmall,
                    )
                    Text(
                        text = "Study",
                        style = MaterialTheme.typography.bodyLarge,
                    )
                }
            }
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
                    imageVector = Icons.Filled.Check,
                    contentDescription = "Tick Icon",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable { }
                )
                Column (
                    modifier = Modifier.padding(start = 10.dp)
                ) {
                    Text(
                        text = "Read book",
                        style = MaterialTheme.typography.headlineSmall,
                    )
                }
            }
        }
    }
}