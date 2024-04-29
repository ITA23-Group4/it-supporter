package com.example.it_supporter.ui.theme.screens

import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.tooling.preview.Preview
import com.example.it_supporter.ui.theme.components.CustomColumn

@Preview(showBackground = true)
@Composable
fun DescriptionScreen() {
    CustomColumn (
    ){
        var isChecked by remember { mutableStateOf(false) }

        Text(
            text = "Can you describe the problem you're experiencing in detail",
            textAlign = TextAlign.Center
        )

        Switch(
            checked = isChecked,
            onCheckedChange = { isChecked = !isChecked },
            colors = SwitchDefaults.colors(
                uncheckedBorderColor = Color.LightGray,
                checkedBorderColor = Color.LightGray,
                checkedTrackColor = Color.Green,
                checkedThumbColor = Color.LightGray
            )
        )

    }
}