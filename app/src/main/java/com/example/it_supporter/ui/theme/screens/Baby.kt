package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.CustomColorScheme
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.ui.theme.components.CustomProgressBar

@Composable
fun BabyScreen(
    navController: NavController,
    customProgressBarProgress: Float

) {
    CustomColumn (
        backgroundColor = CustomColorScheme.butterflyBushColor
    ){
        Spacer(modifier = Modifier.size(20.dp))

        Spacer(modifier = Modifier.size(100.dp))

        Text(text = "Can you not just stop being a baby about it?", style = TextStyle(color = CustomColorScheme.mantisColor), fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.size(29.dp))

        FilledTonalButton(
            onClick = { navController.navigate("specific") },
            modifier = Modifier
                .padding(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = CustomColorScheme.goldColor),
            shape = RoundedCornerShape(0.dp)
        ){
            Text(text = "ok.", style = TextStyle(color = CustomColorScheme.mexicanRedColor), fontSize = 80.sp)
        }

        Row (
            modifier = Modifier.fillMaxWidth()
        ){
            Spacer(modifier = Modifier.size(20.dp))
            FilledTonalButton(
                onClick = { navController.navigate("specific") },
                modifier = Modifier
                    .padding(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = CustomColorScheme.goldColor),
                shape = RoundedCornerShape(0.dp)
            ){
                Text(text = "what?", style = TextStyle(color = CustomColorScheme.mexicanRedColor), fontSize = 20.sp)
            }
        }


        Spacer(modifier = Modifier.size(140.dp))
        CustomProgressBar(progress = customProgressBarProgress)

    }
}