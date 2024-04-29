package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.components.CustomColumn
import java.lang.reflect.Modifier

@Composable
fun TimeScreen(
    //TODO Add everything viewmodel
    navController: NavController
) {

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
        Text(text = "How long have you had issues with your device?")
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
            onClick = { navController.navigate("description") }) {
            Text(text = "Continue")
        }
    }
}