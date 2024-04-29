package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.components.CustomColumn

@Composable
fun WelcomeScreen(
    navController: NavController,
    ) {
    CustomColumn(

    ) {
        Text(
            text = "Welcome",
            textAlign = TextAlign.Center,
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier
            .size(10.dp)
        )
        Text(
            text = "This app is here to give you the best possible support for your IT problems.",
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier
            .size(60.dp)
        )
        Button(onClick = { navController.navigate("device") }) {
            Text(text = "Get Help")
        }
    }
}

