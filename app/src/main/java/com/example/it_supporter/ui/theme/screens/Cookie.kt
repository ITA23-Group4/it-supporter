package com.example.it_supporter.ui.theme.screens

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.components.CustomColumn

@Composable
fun CookieScreen(
    navController: NavController
) {
    CustomColumn {
        Text(text = "Have you tried giving your device a cookie")
        Text(text = "Turn on cookies to continue")

        Button(
            onClick = { navController.navigate("silent") }) {
            Text(text = "Turn on Cookies")
        }
    }

}