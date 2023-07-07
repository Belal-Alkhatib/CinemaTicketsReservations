package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.b.alkhatib.cinematicketsreservations.modifier.calculateCurrentOffsetForPage
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import kotlin.math.absoluteValue

@OptIn(ExperimentalPagerApi::class)
@Composable
fun FilmsCoverSlider(modifier: Modifier = Modifier, covers: List<Int>, pagerState: PagerState) {
    HorizontalPager(
        modifier = modifier.fillMaxSize(),
        state = pagerState,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalAlignment = Alignment.CenterVertically,
        itemSpacing = (-70).dp
    ) { index ->
        val pageOffset = pagerState.calculateCurrentOffsetForPage(index)

        Box(
            Modifier
                .graphicsLayer {
                    scaleX = 1f - pageOffset.coerceIn(-0.33f, 0.33f).absoluteValue
                    scaleY = 1f - pageOffset.coerceIn(-0.33f, 0.33f).absoluteValue
                    alpha = 1f - pageOffset.coerceIn(-0.33f, 0.33f).absoluteValue
                }
                .aspectRatio(0.8f)
                .fillMaxSize()
        ) {
            RoundCornerImage(painter = painterResource(id = covers[index]))
        }
    }
}


