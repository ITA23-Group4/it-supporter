package com.example.it_supporter.ui.theme.screens

import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.EverythingViewModel
import com.example.it_supporter.ui.theme.components.PopUpDialog

@Composable
fun DescriptionScreen(
    navController: NavController,
    everythingViewModel: EverythingViewModel
) {
    var isChecked by remember { mutableStateOf(false) }

    CustomColumn {
        Text(
            text = "Can you describe the problem you're experiencing in detail",
            textAlign = TextAlign.Center
        )

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

        PopUpDialog(
            navController = navController,
            promptText = "Please enter your email",
            buttonText = "Continue",
            destination = "baby",
            inputFieldLabel = "Email"
        ) { email ->
            everythingViewModel.email = email
        }
    }
}
