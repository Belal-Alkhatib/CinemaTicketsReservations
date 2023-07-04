package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.b.alkhatib.cinematicketsreservations.modifier.blurImage

@Composable
fun BlurImage(resourceId: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = resourceId),
        contentDescription = null,
        modifier = modifier
            .fillMaxWidth()
        .background(
            brush = Brush.verticalGradient(
                colors = listOf(Color.Transparent, Color.White),
                startY = 0f,
                endY = Float.POSITIVE_INFINITY
            )
        ).blurImage(),
    )
}