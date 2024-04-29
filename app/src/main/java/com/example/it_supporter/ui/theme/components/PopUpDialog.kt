package com.example.it_supporter.ui.theme.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavController

@Composable
fun PopUpDialogButton(
    navController: NavController,
    promptText: String,
    buttonText: String,
    destination: String,
    inputFieldLabel: String,
    onConfirm: (String) -> Unit
) {
    var isDialogOpen by remember { mutableStateOf(false) }
    var inputText by remember { mutableStateOf(TextFieldValue()) }

    Column {
        Button(onClick = { isDialogOpen = true }) {
            Text(text = buttonText)
        }

        if (isDialogOpen) {
            AlertDialog(
                onDismissRequest = { isDialogOpen = false },
                title = { Text(text = promptText) },
                text = {
                    TextField(
                        value = inputText,
                        onValueChange = { inputText = it },
                        label = { Text(text = inputFieldLabel) }
                    )
                },
                confirmButton = {
                    Button(
                        onClick = {
                            isDialogOpen = false
                            onConfirm(inputText.text)
                            navController.navigate(destination)
                        }
                    ) {
                        Text(text = "OK")
                    }
                }
            )
        }
    }
}
