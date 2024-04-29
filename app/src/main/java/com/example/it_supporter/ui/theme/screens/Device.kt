package com.example.it_supporter.ui.theme.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import com.example.it_supporter.EverythingViewModel
import com.example.it_supporter.ui.theme.components.CustomColumn
import com.example.it_supporter.ui.theme.components.CustomDropDownMenu

@Composable
fun Device(
    navController: NavController,
    everythingViewModel: EverythingViewModel
) {



    val devices: List<String> = listOf("Laptop", "Desktop", "Tablet", "Phone", "Book", "Toaster", "HP series 720 (A1929A)", "HP series 725 (A1636A)", "HP series 730 (A1637A)", "HP series 735 (A1638A)", "HP series 750 (A1639A)", "HP series 755 (A1639A)", "HP series 360 (A1639A)", "HP series 370 (A1639A)", "HP series 380 (A1639A)", "HP series 385 (A1639A)", "HP series 390 (A1639A)", "HP series 395 (A1639A)", "HP series 9000 (A1639A)", "HP series 9200 (A1639A)", "HP series 9300 (A1639A)", "HP series 9500 (A1639A)", "HP series 9600 (A1639A)", "HP series 9800 (A1639A)", "HP series 9900 (A1639A)", "HP series 10000 (A1639A)", "HP series 10200 (A1639A)", "HP series 10300 (A1639A)", "HP series 10500 (A1639A)", "HP series 10600 (A1639A)", "HP series 10700 (A1639A)", "HP series 10800 (A1639A)", "HP series 10900 (A1639A)", "HP series 11000 (A1639A)", "HP series 11200 (A1639A)", "HP series 11300 (A1639A)", "HP series 11500 (A1639A)", "HP series 11600 (A1639A)", "HP series 11700 (A1639A)", "HP series 11800 (A1639A)", "HP series 11900 (A1639A)", "HP series 12000 (A1639A)", "HP series 12200 (A1639A)", "HP series 12300 (A1639A)", "HP series 12500 (A1639A)", "HP series 12600 (A1639A)", "HP series 12700 (A1639A)", "HP series 12800 (A1639A)", "HP series 12900 (A1639A)")

    CustomColumn {
        Text(text = "Please select the device you are using.")
        Text(text = "If you are using a device that is not listed, please select the closest match.")



        CustomDropDownMenu(
            selectedValue = everythingViewModel.device,
            options = devices,
            label = "Device" ,
            onValueChangedEvent = { newValue -> everythingViewModel.device = newValue }
        )

        Row {
            Button(onClick = { navController.popBackStack() }) {
                Text(text = "Back")
            }

            Button(onClick = { navController.navigate("time") }) {
                Text(text = "Continue")
            }
        }

    }
}
