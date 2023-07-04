package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.ui.theme.Orange

@Composable
fun ActiveButton(
    painterIcon: Painter,
    buttonColor: Color = Orange,
    iconColor: Color = Color.White,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {

    FloatingActionButton(
        onClick = { onClick() },
        contentColor = Color.White,
        containerColor = buttonColor,
        elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 0.dp),
        shape = CircleShape,
        modifier = modifier
            .size(60.dp)
            .padding(4.dp)
    ) {
        Icon(
            painter = painterIcon,
            contentDescription = stringResource(id = R.string.play),
            tint = iconColor
        )

    }

}