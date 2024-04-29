package com.example.it_supporter.ui.theme.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.it_supporter.EverythingViewModel
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.ui.theme.components.CustomProgressBar

@Composable
fun SolutionScreen(
    navController: NavHostController,
    everythingViewModel: EverythingViewModel,
    customProgressBarProgress: Float
) {
    CustomProgressBar(progress = customProgressBarProgress)

    CustomColumn {

    }
}