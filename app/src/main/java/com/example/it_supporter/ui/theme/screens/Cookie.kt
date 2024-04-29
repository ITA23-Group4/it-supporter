package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.it_supporter.EverythingViewModel
import com.example.it_supporter.ui.theme.CustomColorScheme
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.ui.theme.components.CustomProgressBar

@Composable
fun CookieScreen(
    navController: NavController,
    customProgressBarProgress: Float,
    everythingViewModel: EverythingViewModel
) {
    var isChecked by remember { mutableStateOf(false) }

    CustomColumn (
        backgroundColor = CustomColorScheme.OffWhite
    ){

        Text(text = "Have you tried giving your device a cookie?"
            , style = TextStyle(color = CustomColorScheme.mexicanRedColor), fontSize = 30.sp)

        CustomProgressBar(progress = customProgressBarProgress, height = 40)

        Spacer(modifier = Modifier.size(90.dp))

        Row (modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
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
            Text(text = "Turn on cookies to continue")
        }

        Spacer(modifier = Modifier.size(20.dp))

        FilledTonalButton(
            onClick = {
                navController.navigate("loading")
                everythingViewModel.allowCookies = true
            },
            modifier = Modifier
                .padding(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = CustomColorScheme.duneColor),
            shape = RoundedCornerShape(0.dp)
        ){
            Text(text = "Apply changes", style = TextStyle(color = CustomColorScheme.goldColor), fontSize = 45.sp)
        }

    }

}