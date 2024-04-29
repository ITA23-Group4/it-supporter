package com.example.it_supporter.ui.theme.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.it_supporter.EverythingViewModel
import com.example.it_supporter.ui.theme.CustomColorScheme
import com.example.it_supporter.ui.theme.components.CustomColumn

@Composable
fun SolutionScreen(
    navController: NavHostController,
    everythingViewModel: EverythingViewModel,
    customProgressBarProgress: Float
) {
    CustomColumn (
        backgroundColor = CustomColorScheme.butterflyBushColor
    ){
        Text(text = "Congratulations! 🎉")
        Text(text = "Based on the information you've provided:")
        Text(text = "Device: ${everythingViewModel.device}")
        Text(text = "Duration: ${everythingViewModel.time}")
        Text(text = "Email: ${everythingViewModel.email}")
        Text(text = "Cookies: ${if (everythingViewModel.allowCookies) "Enabled" else "Disabled"}")
        Text(text = "Our custom solution:")
        Text(text = "Try restarting your device! 🔄")
    }
}
