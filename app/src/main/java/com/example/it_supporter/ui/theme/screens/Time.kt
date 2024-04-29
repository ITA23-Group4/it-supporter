package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.it_supporter.ui.theme.CustomColorScheme

@Composable
fun TimeScreen(
    navController: NavController,
    everythingViewModel: EverythingViewModel,
    customProgressBarProgress: Float
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


    CustomColumn (
        backgroundColor = CustomColorScheme.butterflyBushColor
    ){
        Spacer(modifier = androidx.compose.ui.Modifier.size(20.dp))

        Text(text = "For how long have you had issues with your ${everythingViewModel.device}?",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            color = CustomColorScheme.OffWhite
        )

        Spacer(modifier = androidx.compose.ui.Modifier.height(30.dp))
        Text(
            text = timeScale[(sliderPosition * (timeScale.size - 1)).toInt()],
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp, color = CustomColorScheme.goldColor)
        )


        Slider(
            value = sliderPosition,
            onValueChange = {
                sliderPosition = it
            },
            valueRange = 0f..1f,
            steps = 100,
            )

        Row (){
            Spacer(modifier = androidx.compose.ui.Modifier.size(140.dp))


            FilledTonalButton(
                onClick = { navController.navigate("description")
                    everythingViewModel.time = timeScale[(sliderPosition * (timeScale.size - 1)).toInt()]
                },
                modifier = androidx.compose.ui.Modifier
                    .padding(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = CustomColorScheme.goldColor),
                shape = RoundedCornerShape(0.dp)
            ){
                Text(text = "Continue forth", style = TextStyle(color = CustomColorScheme.mexicanRedColor), fontSize = 20.sp)
            }

        }
    }
}