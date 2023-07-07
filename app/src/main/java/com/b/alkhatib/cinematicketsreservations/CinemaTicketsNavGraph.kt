package com.b.alkhatib.cinematicketsreservations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.b.alkhatib.cinematicketsreservations.screens.BuyTicketScreen
import com.b.alkhatib.cinematicketsreservations.screens.FilmDetailsScreen.filmDetailsRout
import com.b.alkhatib.cinematicketsreservations.screens.HomeScreen

@Composable
fun CinemaTicketsNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "home_screen"){
        composable(Screen.HomeScreen.rout){ HomeScreen(navController) }
        filmDetailsRout(navController)

        composable(Screen.BuyTicketScreen.rout){ BuyTicketScreen(navController) }
    }
}