package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        Text(text = "Congratulations! 🎉", fontSize = 23.sp)
        Text(text = "Try restarting your ${everythingViewModel.device}! 🔄", fontSize = 23.sp)

        Spacer(modifier = Modifier.size(250.dp))

        Text(text = "Your email ${everythingViewModel.email} has also been added to our newsletter! ✅", fontSize = 13.sp)
        Text(text = "(Our servers are not secure)", fontSize = 13.sp)

    }
}
