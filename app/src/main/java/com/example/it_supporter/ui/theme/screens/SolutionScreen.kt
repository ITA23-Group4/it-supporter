package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    CustomColumn {
        Text(text = "Solution")
        Text(text = "Giving the information you've givin us:")
        Text(text = "Device:${everythingViewModel.device}")
        Text(text = "Length:${everythingViewModel.time}")
        Text(text = "Description:${everythingViewModel.description}")
        Text(text = "Email:${everythingViewModel.email}")
        Text(text = "Cookie:${everythingViewModel.allowCookies}")
    }
}