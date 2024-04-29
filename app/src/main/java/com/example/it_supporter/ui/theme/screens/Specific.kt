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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.it_supporter.ui.theme.CustomColorScheme
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.ui.theme.components.CustomProgressBar

@Composable
fun SpecificScreen(
    navController: NavController,
    customProgressBarProgress: Float


) {
    CustomColumn (
        backgroundColor = CustomColorScheme.duneColor
    ){
        CustomProgressBar(progress = customProgressBarProgress, height = 60)
        Spacer(modifier = Modifier.size(32.dp))
        Text(text = "Have you remembered to clean out all the cat hair from the charing port"
            , style = TextStyle(color = CustomColorScheme.mantisColor), fontSize = 30.sp)

        Spacer(modifier = Modifier.size(90.dp))

        FilledTonalButton(
            onClick = { navController.navigate("cookie") },
            modifier = Modifier
                .padding(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = CustomColorScheme.goldColor),
            shape = RoundedCornerShape(0.dp)
        ){
            Text(text = "yEs", style = TextStyle(color = CustomColorScheme.duneColor), fontSize = 45.sp)
        }

        Spacer(modifier = Modifier.size(60.dp))


        Row (modifier = Modifier.fillMaxWidth()){
            Spacer(modifier = Modifier.size(270.dp))
            FilledTonalButton(
                onClick = { navController.navigate("cookie") },
                modifier = Modifier
                    .padding(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = CustomColorScheme.mantisColor),
                shape = RoundedCornerShape(0.dp)
            ){
                Text(text = "NO", style = TextStyle(color = CustomColorScheme.mexicanRedColor), fontSize = 20.sp)
            }
        }
        

    }
}