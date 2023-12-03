package com.eurico.secretdex.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.eurico.secretdex.service.model.pokemon

enum class RouterSet() {
    SplashScreen,
    PokemonListScreen,
    PokemonInfoScreen
}

@Composable
fun Router() {
    val navController = rememberNavController()

    Scaffold(
        content = { padding ->
            NavHostContainer(navController = navController, padding = padding)
        }
    )
}

@Composable
fun NavHostContainer(
    navController: NavHostController,
    padding: PaddingValues,
) {
    NavHost(
        navController = navController,
        startDestination = RouterSet.SplashScreen.name,
        modifier = Modifier.padding(paddingValues = padding),
        builder = {
            composable(RouterSet.SplashScreen.name) {

            }
            composable(RouterSet.PokemonListScreen.name) {

            }
            composable(RouterSet.PokemonInfoScreen.name) {

            }
        }
    )
}