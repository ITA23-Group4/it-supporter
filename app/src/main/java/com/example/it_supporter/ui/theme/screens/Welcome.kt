package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.CustomColorScheme
import com.example.it_supporter.ui.theme.components.CustomColumn

@Composable
fun WelcomeScreen(
    navController: NavController,
    ) {
    CustomColumn(
        backgroundColor = CustomColorScheme.goldColor
    ) {
        Spacer(modifier = Modifier.size(30.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Welcome",
            textAlign = TextAlign.Center,
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier
            .size(10.dp)
        )
        Text(
            text = "This app is here to give you the best possible support for your IT problems.",
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier
            .size(60.dp)
        )

        FilledTonalButton(
            onClick = { navController.navigate("device") },
            modifier = Modifier
                .padding(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = CustomColorScheme.mexicanRedColor),
            shape = RoundedCornerShape(0.dp)
        ){
            Text(text = "Get Help")
        }
    }
}

