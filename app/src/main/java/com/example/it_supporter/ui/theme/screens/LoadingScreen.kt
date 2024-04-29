package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.CustomColorScheme
import kotlinx.coroutines.delay


@Composable
fun LoadingScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(CustomColorScheme.goldColor),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Loading...", fontSize = 16.sp)
        CircularProgressIndicator()
    }
    Text(text = "Using latest AI technology..", fontSize = 16.sp)
    CircularProgressIndicator()

    LaunchedEffect(key1 = true) {
        delay(8000) // delay for 8 seconds
        navController.navigate("solution")
    }
}

