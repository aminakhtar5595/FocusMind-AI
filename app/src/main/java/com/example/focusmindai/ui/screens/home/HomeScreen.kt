package com.example.focusmindai.ui.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
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
fun HomeScreen() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
    ) {
        Row (
            modifier = Modifier.padding(bottom = 20.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Menu,
                contentDescription = "Arrow Back",
                modifier = Modifier
                    .size(30.dp)
                    .clickable { },
            )

            Text(
                text = "HOME",
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
                text = "20:15",
                style = MaterialTheme.typography.displayLarge,
                modifier = Modifier.padding(bottom = 5.dp)
            )

            Text(
                text = "Read book",
                style = MaterialTheme.typography.titleLarge
            )
        }

        Row (
            modifier = Modifier
                .padding(bottom = 20.dp)
                .border(width = 0.5.dp, color = Color.Black, shape = RoundedCornerShape(10))
                .padding(15.dp)
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Daily Goal",
                    style = MaterialTheme.typography.titleLarge,
                )
                Text(
                    text = "3/4 focus sessions",
                    style = MaterialTheme.typography.bodyLarge
                )
            }

            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "Arrow Forward",
                modifier = Modifier
                    .size(30.dp)
                    .clickable { },
            )
        }

        Column (
            modifier = Modifier
                .padding(bottom = 20.dp)
                .border(width = 0.5.dp, color = Color.Black, shape = RoundedCornerShape(10))
                .padding(15.dp)
                .fillMaxWidth(),
        ) {
            Text(
                text = "AI Tip of the Day",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 10.dp)
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
                    text = "Start of the day",
                    style = MaterialTheme.typography.titleLarge
                )
            }
        }
    }
}