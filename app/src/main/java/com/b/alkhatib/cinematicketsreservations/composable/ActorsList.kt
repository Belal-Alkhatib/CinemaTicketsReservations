package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.b.alkhatib.cinematicketsreservations.R

private val actorsImages = listOf<Int>(
    R.drawable.actor_cathreen,
    R.drawable.actor_eidi,
    R.drawable.actor_alison,
    R.drawable.actor_ezra,
    R.drawable.actor_john,
    R.drawable.actor_jod,
    R.drawable.actor_mads,

)
@Preview
@Composable
fun ActorsList() {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(4.dp),
    contentPadding = PaddingValues(horizontal = 24.dp)
    ) {
        items(actorsImages) {
            ActorImage(id = it)
        }
    }
}

@Composable
private fun ActorImage(id: Int, size: Int = 72, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id),
        contentDescription = stringResource(R.string.actor_image),
        modifier = modifier
            .clip(CircleShape)
            .size(size.dp)
            .aspectRatio(1/2f),

    )
}