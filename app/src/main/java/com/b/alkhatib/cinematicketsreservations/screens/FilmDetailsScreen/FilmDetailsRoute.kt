package com.b.alkhatib.cinematicketsreservations.screens.FilmDetailsScreen

import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

fun NavController.navigateToFilmDetails(filmName: String){
    navigate("$ROUT/$filmName")
}

private const val ROUT = "film_details_screen"
fun NavGraphBuilder.filmDetailsRout(navController: NavController) {
    composable("$ROUT/{${FilmDetailsArgs.FILM_ARG}}",
        arguments = listOf(
            navArgument(FilmDetailsArgs.FILM_ARG) { NavType.IntType }
        )
    ) { FilmDetailsScreen(navController) }
}

class FilmDetailsArgs(savedStateHandle: SavedStateHandle) {
    val filmImage: String = checkNotNull(savedStateHandle[FILM_ARG])

    companion object{
        const val FILM_ARG = "film"
    }
}