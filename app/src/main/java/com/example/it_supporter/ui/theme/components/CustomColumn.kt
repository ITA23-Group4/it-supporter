package com.example.it_supporter.ui.theme.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomColumn(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit // Lambda parameter for children composables
) {
    Column(
        modifier
            .padding(30.dp, 0.dp)
            .fillMaxSize()
    ) {
        content() // Call the lambda to include children composables
    }
}