package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.it_supporter.EverythingViewModel
import com.example.it_supporter.ui.theme.CustomColorScheme
import com.example.it_supporter.ui.theme.components.CustomColumn

@Composable
fun SummaryScreen(
    navController: NavHostController,
    everythingViewModel: EverythingViewModel,
) {
    CustomColumn (
        backgroundColor = CustomColorScheme.mantisColor
    ){

        Spacer(modifier = Modifier.size(40.dp))
        Text(text = "You have choosen the following options")
        Text(text = "Based on the information you've provided:")
        Spacer(modifier = Modifier.size(102.dp))
        Text(text = "Device: ${everythingViewModel.device}")
        Text(text = "Duration: ${everythingViewModel.time}")
        Text(text = "Email: ${everythingViewModel.email}")
        Text(text = "Cookies: ${if (everythingViewModel.allowCookies) "Enabled" else "Disabled"}")
        Spacer(modifier = Modifier.size(60.dp))
        Text(text = "Our custom solution is now just one click away")
        Spacer(modifier = Modifier.size(20.dp))
        FilledTonalButton(
            onClick = { navController.navigate("loading") },
            modifier = Modifier
                .padding(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = CustomColorScheme.mexicanRedColor),
            shape = RoundedCornerShape(0.dp)
        ){
            Text(text = "Get Solution")
        }
    }
}
