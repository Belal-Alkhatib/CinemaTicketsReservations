package com.b.alkhatib.cinematicketsreservations

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.b.alkhatib.cinematicketsreservations.screens.BuyTicketScreen
import com.b.alkhatib.cinematicketsreservations.screens.FilmDetailsScreen
import com.b.alkhatib.cinematicketsreservations.screens.HomeScreen
import com.b.alkhatib.cinematicketsreservations.ui.theme.CinemaTicketsReservationsTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CinemaTicketsReservationsApp() {
    CinemaTicketsReservationsTheme(){
        Scaffold {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "home_screen"){
                composable(Screen.HomeScreen.rout){ HomeScreen(navController) }
                composable(Screen.FilmDetailsScreen.rout){ FilmDetailsScreen(navController) }
                composable(Screen.BuyTicketScreen.rout){ BuyTicketScreen(navController) }
            }
            //FilmDetailsScreen()
            //HomeScreen()
            //BuyTicketScreen()
        }
    }

}
