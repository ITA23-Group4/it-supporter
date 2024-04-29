package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.EverythingViewModel
import com.example.it_supporter.ui.theme.CustomColorScheme
import com.example.it_supporter.ui.theme.components.CustomProgressBar
import com.example.it_supporter.ui.theme.components.PopUpDialogButton

@Composable
fun DescriptionScreen(
    navController: NavController,
    everythingViewModel: EverythingViewModel,
    customProgressBarProgress: Float
) {
    var isChecked by remember { mutableStateOf(false) }

    CustomColumn (
        backgroundColor = CustomColorScheme.mexicanRedColor
    ){
        Spacer(modifier = Modifier.size(50.dp))

        CustomProgressBar(progress = customProgressBarProgress)

        Spacer(modifier = Modifier.size(100.dp))

        Text(
            text = "Can you describe the problem you're experiencing in detail",
            textAlign = TextAlign.Center,
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp, color = CustomColorScheme.goldColor)
        )

        Row (modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Text(text = "NO",style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp, color = CustomColorScheme.duneColor)
            )
            Spacer(modifier = androidx.compose.ui.Modifier.size(20.dp))

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
            Spacer(modifier = androidx.compose.ui.Modifier.size(90.dp))

            Text(text = "YES", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp, color = CustomColorScheme.mantisColor))
        }

        Spacer(modifier = androidx.compose.ui.Modifier.size(400.dp))

        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Spacer(modifier = androidx.compose.ui.Modifier.size(70.dp))
            PopUpDialogButton(
                navController = navController,
                promptText = "Please enter your email",
                buttonText = "Continue",
                destination = "baby",
                inputFieldLabel = "Email",
                showTextField = true,
                showDismissButton = false,
                onConfirm = { email ->
                    everythingViewModel.email = email
                    everythingViewModel.description = true
                }
            )
        }
    }
}
