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
import androidx.compose.ui.util.lerp
import com.b.alkhatib.cinematicketsreservations.modifier.calculateCurrentOffsetForPage
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState


@OptIn(ExperimentalPagerApi::class)
@Composable
fun FilmsCoverSlider(modifier: Modifier = Modifier, covers: List<Int>, pagerState: PagerState) {
    HorizontalPager(
        modifier = modifier.fillMaxSize(),
        state = pagerState,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalAlignment = Alignment.CenterVertically,
        itemSpacing = (-16).dp
    ) { index ->
        Box(
            Modifier
                .graphicsLayer {
                    val pageOffset = pagerState.calculateCurrentOffsetForPage(index)

                    lerp(
                        start = 0.90f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    ).also { scale ->
                        scaleX = scale
                        scaleY = scale
                    }
                    alpha = lerp(
                        start = 0.80f,
                        stop = 1f,
                        fraction = 1f - pageOffset.coerceIn(0f, 1f)
                    )

                }
                .aspectRatio(0.6f)
                .fillMaxSize()
                ) {
            RoundCornerImage(painter = painterResource(id = covers[index]))
        }
    }

}



//        Box(
//            modifier = Modifier
//                .padding(10.dp)
//                .background(Color.Blue)
//                .fillMaxWidth()
//                .aspectRatio(1f),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(text = page.toString(), fontSize = 32.sp)
//        }
/*

Card(
    colors = CardDefaults.cardColors(Color.Transparent),
    shape = RoundedCornerShape(10.dp),
    elevation = CardDefaults.cardElevation(0.dp),
    modifier = Modifier
        .graphicsLayer {
            val pageOffset = calculateCurrentOffsetForPage(page).absoluteValue

            lerp(
                start = 0.85f,
                stop = 1f,
                fraction = 1f - pageOffset.coerceIn(0f, 1f)
            ).also { scale ->
                scaleX = scale
                scaleY = scale
            }
            alpha = lerp(
                start = 0.5f,
                stop = 1f,
                fraction = 1f - pageOffset.coerceIn(0f, 1f)
            )
        }
    // .aspectRatio(0.5f)
){
    AsyncImage(
        model = Builder(LocalContext.current)
            .data(sliderList[page])
            .crossfade(true)
            .scale(FILL)
            .build(),
        contentDescription = null,
        modifier = Modifier
            .offset {
                // Calculate the offset for the current page from the
                // scroll position
                val pageOffset =
                    this@HorizontalPager.calculateCurrentOffsetForPage(page)
                // Then use it as a multiplier to apply an offset
                IntOffset(
                    x = (70.dp * pageOffset).roundToPx(),
                    y = 0,
                )
            }
    )
}
*/