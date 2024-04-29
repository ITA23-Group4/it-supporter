package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import com.example.it_supporter.EverythingViewModel
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.ui.theme.components.CustomProgressBar
import java.lang.reflect.Modifier
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp

@Composable
fun TimeScreen(
    navController: NavController,
    everythingViewModel: EverythingViewModel,
    customProgressBar: Unit
) {
    customProgressBar

    val timeScale = remember {
        listOf(
            "Boiling an Egg",
            "4 Minecraft Days",
            "Length of a Football Match",
            "Time to Read a Book",
            "A Day at Disneyland",
            "Flight from New York to Tokyo",
            "A Week of Work",
            "Growing a Flower from Seed",
            "Pregnancy",
            "1 Light Year"
        )
    }

    var sliderPosition by remember { mutableStateOf(0f) }


    CustomColumn {
        Text(text = "For how long have you had issues with your ${everythingViewModel.device}?")

        Spacer(modifier = androidx.compose.ui.Modifier.height(30.dp))
        Text(
            text = timeScale[(sliderPosition * (timeScale.size - 1)).toInt()],
        )


        Slider(
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            valueRange = 0f..1f,
            steps = 100,
        )

        Button(
            onClick = {
                navController.navigate("description")
            }) {
            Text(text = "Continue to")
        }
    }
}