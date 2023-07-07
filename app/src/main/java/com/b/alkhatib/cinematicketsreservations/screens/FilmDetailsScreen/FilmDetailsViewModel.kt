package com.b.alkhatib.cinematicketsreservations.screens.FilmDetailsScreen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class FilmDetailsViewModel @Inject constructor(
    savedState: SavedStateHandle
) : ViewModel() {
    private val _state = MutableStateFlow("R.drawable.booking_cover")
    val state: StateFlow<String> = _state.asStateFlow()

    private val args: FilmDetailsArgs = FilmDetailsArgs(savedState)

    init {
        showSelectedFilmImage()
    }

    private fun showSelectedFilmImage(){
        _state.value = args.filmImage
    }
}