package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.ui.theme.CancelButtonBackground

@Composable
fun CancelButton(modifier: Modifier = Modifier, onClick: () -> Unit) {

    FloatingActionButton(
        onClick = { onClick() },
        contentColor = Color.White,
        containerColor = CancelButtonBackground,
        shape = CircleShape,
        modifier = modifier.size(36.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_cancel),
            contentDescription = stringResource(id = R.string.cancel),
            tint = Color.White
        )
    }

}
