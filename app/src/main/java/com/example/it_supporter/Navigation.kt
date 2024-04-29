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
import com.example.it_supporter.ui.theme.screens.LoadingScreen
import com.example.it_supporter.ui.theme.screens.SolutionScreen
import com.example.it_supporter.ui.theme.screens.SpecificScreen
import com.example.it_supporter.ui.theme.screens.SummaryScreen
import com.example.it_supporter.ui.theme.screens.WelcomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val everythingViewModel: EverythingViewModel = remember { EverythingViewModel() }

    NavHost(navController = navController, startDestination = "welcome"){
        composable("welcome"){
            WelcomeScreen(
                navController = navController
            )
        }
        composable("device"){
            Device(
                navController = navController,
                everythingViewModel = everythingViewModel,
                customProgressBarProgress = 0.1f
            )
        }
        composable("time"){
            TimeScreen(
                navController = navController,
                everythingViewModel = everythingViewModel,
                customProgressBarProgress = 0.8f
            )
        }
        composable("description"){
            DescriptionScreen(
                navController = navController,
                everythingViewModel = everythingViewModel,
                customProgressBarProgress = 0.3f
            )
        }
        composable("baby"){
            BabyScreen(
                navController = navController,
                customProgressBarProgress = 0.2f
            )
        }
        composable("specific"){
            SpecificScreen(
                navController = navController,
                customProgressBarProgress = 0.6f
            )
        }
        composable("cookie"){
            CookieScreen(
                navController = navController,
                customProgressBarProgress = 1.0f,
                everythingViewModel = everythingViewModel
            )
        }
        composable("summary"){
            SummaryScreen(
                navController = navController,
                everythingViewModel = everythingViewModel
            )
        }
        composable("loading"){
            LoadingScreen(navController = navController)
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