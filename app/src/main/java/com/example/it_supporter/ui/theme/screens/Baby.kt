package com.example.it_supporter.ui.theme.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.CustomColorScheme
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.ui.theme.components.CustomProgressBar

@Composable
fun BabyScreen(
    navController: NavController,
    customProgressBarProgress: Float

) {
    CustomColumn (
        backgroundColor = CustomColorScheme.butterflyBushColor
    ){
        CustomProgressBar(progress = customProgressBarProgress)

        Text(text = "Can you not just stop being a baby about it?")
        Button(
            onClick = { navController.navigate("specific") }) {
            Text(text = "ok.")
        }
        Button(
            onClick = { navController.navigate("specific") }) {
            Text(text = "what?")
        }
    }
}