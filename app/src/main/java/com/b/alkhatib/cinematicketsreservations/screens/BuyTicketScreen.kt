package com.b.alkhatib.cinematicketsreservations.screens

import CustomChips
import HistoryChips
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.composable.ButtonWithIcon
import com.b.alkhatib.cinematicketsreservations.composable.CancelButton
import com.b.alkhatib.cinematicketsreservations.composable.CinemaCarveImage
import com.b.alkhatib.cinematicketsreservations.composable.CinemaSeat
import com.b.alkhatib.cinematicketsreservations.composable.SpacerVertical
import com.b.alkhatib.cinematicketsreservations.composable.TextWithCircle
import com.b.alkhatib.cinematicketsreservations.ui.theme.BlackBackground
import com.b.alkhatib.cinematicketsreservations.ui.theme.CardBackground
import com.b.alkhatib.cinematicketsreservations.ui.theme.FilmTimeCardColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.Gray
import com.b.alkhatib.cinematicketsreservations.ui.theme.Orange
import com.b.alkhatib.cinematicketsreservations.ui.theme.PrimaryTextColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.Product
import com.b.alkhatib.cinematicketsreservations.ui.theme.ThirdTextColor

@Composable
fun BuyTicketScreen(
    navController: NavController
) {
    BuyTicketContent()
}
@Preview()
@Composable
fun BuyTicketContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = BlackBackground)
    ) {

        Column(
            modifier = Modifier
                .weight(3f)
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                .fillMaxWidth(),

            ) {

            CancelButton(containerColor = FilmTimeCardColor) {}

            CinemaCarveImage()


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(5f),
                horizontalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.33f)
                        .padding(top = 0.dp)
                ) {
                    CinemaSeat(
                        degrees = 6f,
                        painter = painterResource(id = R.drawable.ic_avaliable_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        degrees = 6f,
                        painter = painterResource(id = R.drawable.ic_avaliable_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        degrees = 6f,
                        painter = painterResource(id = R.drawable.ic_taken_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        degrees = 6f,
                        painter = painterResource(id = R.drawable.ic_avaliable_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        degrees = 6f,
                        painter = painterResource(id = R.drawable.ic_taken_seat),
                        modifier = Modifier.weight(1f)
                    )

                }
                Column(
                    modifier = Modifier
                        .weight(0.33f)
                        .padding(top = 8.dp),
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    CinemaSeat(
                        painter = painterResource(id = R.drawable.ic_avaliable_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        painter = painterResource(id = R.drawable.ic_selected_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        painter = painterResource(id = R.drawable.ic_selected_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        painter = painterResource(id = R.drawable.ic_taken_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        painter = painterResource(id = R.drawable.ic_taken_seat),
                        modifier = Modifier.weight(1f)
                    )

                }
                Column(
                    modifier = Modifier
                        .weight(0.33f)
                        .padding(top = 0.dp)
                ) {
                    CinemaSeat(
                        degrees = -6f,
                        painter = painterResource(id = R.drawable.ic_avaliable_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        degrees = -6f,
                        painter = painterResource(id = R.drawable.ic_avaliable_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        degrees = -6f,
                        painter = painterResource(id = R.drawable.ic_taken_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        degrees = -6f,
                        painter = painterResource(id = R.drawable.ic_avaliable_seat),
                        modifier = Modifier.weight(1f)
                    )
                    CinemaSeat(
                        degrees = -6f,
                        painter = painterResource(id = R.drawable.ic_avaliable_seat),
                        modifier = Modifier.weight(1f)
                    )

                }

            }


        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.End)
                .padding(top = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            TextWithCircle(
                text = stringResource(id = R.string.available),
                circleColor = CardBackground
            )
            TextWithCircle(text = stringResource(id = R.string.taken), circleColor = Gray)
            TextWithCircle(text = stringResource(id = R.string.selected), circleColor = Orange)
        }

        /*************************************************/
        SpacerVertical(space = 32)
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1.5f),
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
                    .padding(top = 16.dp)
                    .align(Alignment.CenterHorizontally)

            ) {
                HistoryChips()
                CustomChips()
                SpacerVertical(space = 16)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.Bottom
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = stringResource(id = R.string.usd100),
                            fontWeight = FontWeight.Normal,
                            fontSize = 28.sp,
                            textAlign = TextAlign.Start,
                            fontFamily = Product,
                            color = PrimaryTextColor,
                        )

                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = stringResource(id = R.string.four_tickets),
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp,
                            fontFamily = Product,
                            color = ThirdTextColor
                        )
                    }

                    ButtonWithIcon(
                        painter = painterResource(id = R.drawable.ic_ticket),
                        title = stringResource(id = R.string.buy_tickets),
                        modifier = Modifier.weight(1f)
                    ) {}
                }

            }
        }


    }

}
