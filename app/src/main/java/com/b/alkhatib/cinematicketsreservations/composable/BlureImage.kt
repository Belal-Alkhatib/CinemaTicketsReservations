package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.modifier.blurImage
import com.b.alkhatib.cinematicketsreservations.ui.theme.CardBackground
@Composable
fun BlurImage(resourceId: Int, modifier: Modifier = Modifier) {
    val isVisible by remember { mutableStateOf(true) }
    val opacity by animateFloatAsState(
        targetValue = if (isVisible) 1f else 0f,
        animationSpec = tween(durationMillis = 1000)
    )

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
        Crossfade(targetState = isVisible) { targetVisible ->
            if (targetVisible) {
                Image(
                    painter = painterResource(id = resourceId),
                    contentDescription = null,
                    modifier = modifier
                        .fillMaxWidth()
                        .blurImage()
                        .alpha(opacity),
                )
            }
        }
    }
}
