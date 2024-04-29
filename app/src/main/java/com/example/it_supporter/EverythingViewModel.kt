package com.example.it_supporter

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class EverythingViewModel : ViewModel() {
    var email: String = ""
    var device: String by mutableStateOf("")
}