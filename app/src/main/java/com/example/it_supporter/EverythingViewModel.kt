package com.example.it_supporter

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class EverythingViewModel : ViewModel() {
    var device: String by mutableStateOf("")
    var time: String by mutableStateOf("")
    var description: Boolean by mutableStateOf(true)
    var email: String by mutableStateOf("")
    var allowCookies: Boolean by mutableStateOf(true)
}