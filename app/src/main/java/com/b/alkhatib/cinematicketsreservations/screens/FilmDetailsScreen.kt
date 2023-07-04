package com.b.alkhatib.cinematicketsreservations.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.composable.ActorsList
import com.b.alkhatib.cinematicketsreservations.composable.BigTitle
import com.b.alkhatib.cinematicketsreservations.composable.ButtonWithIcon
import com.b.alkhatib.cinematicketsreservations.composable.CancelButton
import com.b.alkhatib.cinematicketsreservations.composable.ContentDescription
import com.b.alkhatib.cinematicketsreservations.composable.FilmDetailsCoverImage
import com.b.alkhatib.cinematicketsreservations.composable.FilmTimeCard
import com.b.alkhatib.cinematicketsreservations.composable.ActiveButton
import com.b.alkhatib.cinematicketsreservations.composable.RateInformation
import com.b.alkhatib.cinematicketsreservations.composable.SpacerHorizontal
import com.b.alkhatib.cinematicketsreservations.composable.SpacerVertical
import com.b.alkhatib.cinematicketsreservations.composable.TextWithRoundedBorder
import com.b.alkhatib.cinematicketsreservations.ui.theme.CardBackground
import com.b.alkhatib.cinematicketsreservations.ui.theme.FilmTimeCardColor

@Preview(backgroundColor = 0xFFFDFDFD)
@Composable
fun FilmDetailsScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(2f)
                .padding(vertical = 16.dp)
        ) {

            FilmDetailsCoverImage(
                painter = painterResource(id = R.drawable.booking_cover),
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(4 / 5.95f),
            )

            ActiveButton(
                modifier = Modifier.align(Alignment.Center),
                painterIcon = painterResource(id = R.drawable.ic_play)
            ) {}

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                CancelButton {}
                FilmTimeCard(
                    time = stringResource(id = R.string.film_time),
                    contentColor = Color.White,
                    containerColor = FilmTimeCardColor
                )
            }

        }



        SpacerVertical(space = 32)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(4f),
            colors = CardDefaults.cardColors(containerColor = CardBackground),
            shape = RoundedCornerShape(
                topStart = 32.dp,
                topEnd = 32.dp,
                bottomStart = 0.dp,
                bottomEnd = 0.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
            ) {

                SpacerVertical(space = 32)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    RateInformation(
                        title = stringResource(R.string.imdb),
                        rate = stringResource(R.string.rate6_10)
                    )
                    RateInformation(
                        title = stringResource(R.string.rotten_tomatoes),
                        rate = stringResource(R.string.rate63_100),
                        rateOf = stringResource(id = R.string.percentile)
                    )
                    RateInformation(
                        title = stringResource(R.string.ign),
                        rate = stringResource(R.string.rate4_10)
                    )
                }


                SpacerVertical(space = 24)
                BigTitle(title = stringResource(R.string.film_name))


                SpacerVertical(space = 16)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    TextWithRoundedBorder(title = stringResource(R.string.fantasy))
                    SpacerHorizontal(space = 4)
                    TextWithRoundedBorder(title = stringResource(R.string.adventure))
                }


                SpacerVertical(space = 24)
                ActorsList()


                SpacerVertical(space = 24)
                ContentDescription(title = stringResource(R.string.filme_description))


                Spacer(modifier = Modifier.weight(1f))

                ButtonWithIcon(
                    painter = painterResource(id = R.drawable.ic_ticket),
                    title = stringResource(id = R.string.booking),
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {}

                SpacerVertical(space = 32)

            }
        }


    }
}