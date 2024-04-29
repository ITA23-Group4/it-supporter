package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.EverythingViewModel
import com.example.it_supporter.ui.theme.components.PopUpDialogButton

@Composable
fun DescriptionScreen(
    navController: NavController,
    everythingViewModel: EverythingViewModel,
) {
    var isChecked by remember { mutableStateOf(false) }

    CustomColumn {
        Text(
            text = "Can you describe the problem you're experiencing in detail",
            textAlign = TextAlign.Center
        )

        Row (modifier = Modifier
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            Text(text = "NO")

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

            Text(text = "YES")
        }

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
