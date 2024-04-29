package com.example.it_supporter.ui.theme.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.CustomColorScheme
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.ui.theme.components.CustomProgressBar

@Composable
fun SpecificScreen(
    navController: NavController,
    customProgressBarProgress: Float


) {
    CustomColumn (
        backgroundColor = CustomColorScheme.butterflyBushColor
    ){
        CustomProgressBar(progress = customProgressBarProgress)
        Text(text = "Have you rememberd to clean out all the cat hair from the charing port")
        Button(
            onClick = { navController.navigate("cookie") }) {
            Text(text = "yes")
        }
        Button(
            onClick = { navController.navigate("cookie") }) {
            Text(text = "no")
        }
    }
}