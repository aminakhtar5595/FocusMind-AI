package com.example.focusmindai.ui.screens.task

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun BreakScreen() {
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
                text = "BREAK",
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
                text = "5:00",
                style = MaterialTheme.typography.displayLarge,
                modifier = Modifier.padding(bottom = 5.dp)
            )

            Text(
                text = "Short Break",
                style = MaterialTheme.typography.titleLarge
            )
        }

        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c1/Google_%22G%22_logo.svg/480px-Google_%22G%22_logo.svg.png",
                contentDescription = "App logo",
                modifier = Modifier
                    .width(120.dp),
            )
            Text(
                text = "Suggested:",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.SemiBold),
                modifier = Modifier.padding(vertical = 5.dp)
            )
            Text(
                text = "Stretching exercises",
                style = MaterialTheme.typography.titleLarge
            )
        }
    }
}