package com.example.it_supporter

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.it_supporter.ui.theme.screens.DescriptionScreen
import com.example.it_supporter.ui.theme.screens.WelcomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val everythingViewModel: EverythingViewModel = remember { EverythingViewModel() }

    NavHost(navController = navController, startDestination = "welcome"){
        composable("welcome"){
            WelcomeScreen()
        }
        composable("device"){
            // everythingViewModel
        }
        composable("time"){

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

        }
        composable("specific"){

        }
        composable("cookie"){

        }
        composable("silent"){

        }
        composable("solution"){

        }
    }

}