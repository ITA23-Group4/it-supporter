package com.example.it_supporter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.it_supporter.ui.theme.components.CustomProgressBar
import com.example.it_supporter.ui.theme.screens.BabyScreen
import com.example.it_supporter.ui.theme.screens.CookieScreen
import com.example.it_supporter.ui.theme.screens.TimeScreen
import com.example.it_supporter.ui.theme.screens.DescriptionScreen
import com.example.it_supporter.ui.theme.screens.Device
import com.example.it_supporter.ui.theme.screens.SolutionScreen
import com.example.it_supporter.ui.theme.screens.SpecificScreen
import com.example.it_supporter.ui.theme.screens.WelcomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val everythingViewModel: EverythingViewModel = remember { EverythingViewModel() }

    NavHost(navController = navController, startDestination = "device"){
        composable("welcome"){
            WelcomeScreen()
        }
        composable("device"){
            Device(
                navController = navController,
                everythingViewModel = everythingViewModel,
                CustomProgressBar(0.1f)
            )
        }
        composable("time"){
            TimeScreen(
                navController = navController,
                everythingViewModel = everythingViewModel,
                CustomProgressBar(0.5f)
            )
        }
        composable("description"){
            DescriptionScreen(
                navController = navController,
                everythingViewModel = everythingViewModel
            )
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
            CookieScreen(
                navController = navController,
                everythingViewModel = everythingViewModel
            )
        }
        // TODO composable("silent"){}
        composable("solution"){
            SolutionScreen(
                navController = navController,
                everythingViewModel = everythingViewModel,
                customProgressBarProgress = 0.7f
            )
        }
    }

}