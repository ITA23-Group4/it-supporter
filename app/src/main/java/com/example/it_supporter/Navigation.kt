package com.example.it_supporter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.it_supporter.ui.theme.screens.BabyScreen
import com.example.it_supporter.ui.theme.screens.TimeScreen
import com.example.it_supporter.ui.theme.screens.DescriptionScreen
import com.example.it_supporter.ui.theme.screens.Device
import com.example.it_supporter.ui.theme.screens.SpecificScreen
import com.example.it_supporter.ui.theme.screens.WelcomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val everythingViewModel: EverythingViewModel = remember { EverythingViewModel() }

    NavHost(navController = navController, startDestination = "baby"){
        composable("welcome"){
            WelcomeScreen()
        }
        composable("device"){
            Device(
                navController = navController,
                everythingViewModel = everythingViewModel
            )
        }
        composable("time"){
            TimeScreen(
                navController = navController
            )
        }
        composable("description"){
            DescriptionScreen(
                navController = navController,
                everythingViewModel = everythingViewModel
            )
        }
        composable("pop-up"){

        }
        composable("baby"){
            BabyScreen(
                navController = navController
            )
        }
        composable("specific"){
            SpecificScreen(
                navController = navController
            )
        }
        composable("cookie"){

        }
        composable("silent"){

        }
        composable("solution"){

        }
    }

}