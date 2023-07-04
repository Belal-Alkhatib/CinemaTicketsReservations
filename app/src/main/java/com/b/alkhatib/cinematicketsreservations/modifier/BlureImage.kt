package com.b.alkhatib.cinematicketsreservations.modifier

import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.unit.dp

fun Modifier.blurImage() = then(Modifier.aspectRatio(6/8.9f).blur(16.dp))
