package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.ui.theme.Black40
import com.b.alkhatib.cinematicketsreservations.ui.theme.CardBackground

@Composable
fun CinemaCarveImage() {
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
    ) {
        Image(
            painter = painterResource(id = R.drawable.but_ticet_cover),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth().height(80.dp)
                .clip(CinemaCerve()),
            colorFilter = ColorFilter.tint(Black40, blendMode = BlendMode.Darken)

        )
    }
}

class CinemaCerve : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path().apply {
            val curveHeight = size.height / 4f

            moveTo(0f, curveHeight)
            cubicTo(
                size.width / 2f, 0f,
                size.width * 3 / 4f, 0f,
                size.width, curveHeight
            )
            lineTo(size.width, size.height - curveHeight)
            cubicTo(
                size.width * 3 / 4f, size.height,
                size.width / 4f, size.height,
                0f, size.height - curveHeight
            )
            close()
        }
        return Outline.Generic(path = path)
    }
}