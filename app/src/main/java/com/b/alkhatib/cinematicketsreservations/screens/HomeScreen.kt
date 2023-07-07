package com.b.alkhatib.cinematicketsreservations.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.composable.ActiveButton
import com.b.alkhatib.cinematicketsreservations.composable.BigTitle
import com.b.alkhatib.cinematicketsreservations.composable.BlurImage
import com.b.alkhatib.cinematicketsreservations.composable.FilmTimeCard
import com.b.alkhatib.cinematicketsreservations.composable.FilmsCoverSlider
import com.b.alkhatib.cinematicketsreservations.composable.IconButton
import com.b.alkhatib.cinematicketsreservations.composable.NormalButton
import com.b.alkhatib.cinematicketsreservations.composable.SpacerHorizontal
import com.b.alkhatib.cinematicketsreservations.composable.SpacerVertical
import com.b.alkhatib.cinematicketsreservations.composable.TextWithRoundedBorder
import com.b.alkhatib.cinematicketsreservations.ui.theme.CardBackground
import com.b.alkhatib.cinematicketsreservations.ui.theme.FullOpacetyColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.NormalButtonStrokeColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.SecondaryTextColor
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState


@OptIn(ExperimentalPagerApi::class)
@Preview(backgroundColor = 0xFFFDFDFD)
@Composable
fun HomeScreen() {

    val covers = listOf<Int>(
        R.drawable.secrets_of_dumbledore_posters1,
        R.drawable.secrets_of_dumbledore_posters2,
        R.drawable.secrets_of_dumbledore_posters3,
        R.drawable.secrets_of_dumbledore_posters4,
        R.drawable.secrets_of_dumbledore_posters5,
        R.drawable.secrets_of_dumbledore_posters6,
        R.drawable.secrets_of_dumbledore_posters7,
        R.drawable.secrets_of_dumbledore_posters8,
        R.drawable.secrets_of_dumbledore_posters9,
        R.drawable.secrets_of_dumbledore_posters10,
    )

    val pagerState = rememberPagerState(covers.size)


    Column(modifier = Modifier.fillMaxSize()) {
        //todo: viewPager
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .weight(5f)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color.White),
                        startY = 0f,
                        endY = Float.POSITIVE_INFINITY
                    )
                )
        ) {

            BlurImage(
                resourceId = covers[pagerState.currentPage],
                modifier = Modifier.height(100.dp)
            )

            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 32.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    NormalButton(
                        title = stringResource(R.string.new_showing),
                    ) {}
                    SpacerHorizontal(space = 4)
                    NormalButton(
                        title = stringResource(R.string.coming_soon),
                        containerColor = FullOpacetyColor,
                        strokeColor = NormalButtonStrokeColor
                    ) {}
                    SpacerVertical(space = 32)

                }

                Row {
                    FilmsCoverSlider(pagerState = pagerState, covers = covers)
                }
            }
        }

        //todo: film info
        Row(
            modifier = Modifier
                .fillMaxSize()
                .weight(2f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(CardBackground)
            ) {
                FilmTimeCard(
                    time = stringResource(id = R.string.film_time),
                    contentColor = SecondaryTextColor,
                    containerColor = CardBackground,
                )

                SpacerVertical(space = 16)
                BigTitle(title = stringResource(R.string.film_name), modifier = Modifier.height(100.dp) )

                SpacerVertical(space = 16)
                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
                ) {
                    TextWithRoundedBorder(title = stringResource(R.string.fantasy))
                    SpacerHorizontal(space = 4)
                    TextWithRoundedBorder(title = stringResource(R.string.adventure))
                }
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(CardBackground)
                .padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround

        ) {
            ActiveButton(painterIcon = painterResource(id = R.drawable.ic_play)) {}
            IconButton(painter = painterResource(id = R.drawable.ic_search))
            IconButton(painter = painterResource(id = R.drawable.ic_my_ticket))
            IconButton(painter = painterResource(id = R.drawable.ic_profile))
        }


    }

}