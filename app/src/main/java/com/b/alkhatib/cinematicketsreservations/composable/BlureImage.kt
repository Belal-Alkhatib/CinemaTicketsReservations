package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.modifier.blurImage
import com.b.alkhatib.cinematicketsreservations.ui.theme.CardBackground

@Composable
fun BlurImage(resourceId: Int, modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        CardBackground,
                        Color.Transparent,
                    ),
                    startY = 0.0f,
                    endY = 0.0f,
                ),
            )
            .fillMaxSize()

    ) {

        Image(
            painter = painterResource(id = resourceId),
            contentDescription = null,
            modifier = modifier
                .fillMaxWidth()
                .blurImage(),

            )
    }

}
