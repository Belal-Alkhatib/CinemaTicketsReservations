package com.b.alkhatib.cinematicketsreservations



sealed class Screen(val rout: String){
    object HomeScreen: Screen("home_screen")
    object FilmDetailsScreen: Screen("film_details_screen")
    object BuyTicketScreen: Screen("buy_ticket_screen")
}