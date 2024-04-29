package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.it_supporter.EverythingViewModel
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.ui.theme.components.CustomProgressBar

@Composable
fun CookieScreen(
    navController: NavController,
    customProgressBarProgress: Float,
    everythingViewModel: EverythingViewModel
) {
    var isChecked by remember { mutableStateOf(false) }

    CustomColumn {
        CustomProgressBar(progress = customProgressBarProgress)

        Text(text = "Have you tried giving your device a cookie")


        Row (modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = "Turn on cookies to continue")

            Switch(
                checked = isChecked,
                onCheckedChange = { isChecked = it },
                colors = SwitchDefaults.colors(
                    uncheckedBorderColor = Color.LightGray,
                    checkedBorderColor = Color.LightGray,
                    checkedTrackColor = Color.Green,
                    checkedThumbColor = Color.LightGray
                )
            )
        }

        Button(
            onClick = {
                navController.navigate("solution")
                everythingViewModel.allowCookies = true
            }) {
            Text(text = "Apply")
        }
    }

}