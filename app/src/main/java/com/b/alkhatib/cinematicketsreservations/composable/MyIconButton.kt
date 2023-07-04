package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.ui.theme.GrayIconColor

@Composable
fun IconButton(painter: Painter) {
    Icon(
        painter = painter,
        contentDescription = stringResource(id = R.string.play),
        tint = GrayIconColor
    )
}