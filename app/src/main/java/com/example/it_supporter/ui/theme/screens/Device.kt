package com.example.it_supporter.ui.theme.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.example.it_supporter.EverythingViewModel
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.ui.theme.components.CustomDropDownMenu

@Composable
fun Device() {

    val everythingViewModel: EverythingViewModel = remember { EverythingViewModel() }


    val devices: List<String> = listOf("Laptop", "Desktop", "Tablet", "Phone", "Other")

    CustomColumn {
        Text(text = "")

        CustomDropDownMenu(
            selectedValue = everythingViewModel.device,
            options = devices,
            label = "Device" ,
            onValueChangedEvent = { newValue -> everythingViewModel.device = newValue }
        )
    }
}
