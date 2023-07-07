package com.b.alkhatib.cinematicketsreservations

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.b.alkhatib.cinematicketsreservations.ui.theme.CinemaTicketsReservationsTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CinemaTicketsReservationsApp() {
    CinemaTicketsReservationsTheme(){
        Scaffold {
            val navController = rememberNavController()
            CinemaTicketsNavGraph(navController = navController)
        }
    }
}
