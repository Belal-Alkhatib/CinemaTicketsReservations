package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.b.alkhatib.cinematicketsreservations.R


@Composable
fun CinemaSeat(painter: Painter, degrees: Float = 0f, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
            .size(200.dp)
            .rotate(degrees)
            .clipToBounds()
    ) {
        Image(
            painter = painter, 
            contentDescription = "Rotated Image",
            modifier = Modifier.fillMaxSize()
        )
    }


}

@Preview
@Composable
fun tt() {
    CinemaSeat(
        painter = painterResource(id = R.drawable.ic_selected_seat),
        degrees = -10f
    )
}