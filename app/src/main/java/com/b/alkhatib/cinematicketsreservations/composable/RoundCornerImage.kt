package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.b.alkhatib.cinematicketsreservations.R

@Composable
fun RoundCornerImage(painter: Painter) {
    Image(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .clip(RoundedCornerShape(32.dp)),
        contentScale = ContentScale.Crop,
        painter = painter, contentDescription = null,

        )


}

@Preview
@Composable
fun testt() {
    RoundCornerImage(painter = painterResource(id = R.drawable.main_poster))
}