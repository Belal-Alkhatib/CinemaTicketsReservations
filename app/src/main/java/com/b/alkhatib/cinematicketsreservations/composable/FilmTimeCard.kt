package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.ui.theme.GrayIconColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.Product
import com.b.alkhatib.cinematicketsreservations.ui.theme.SecondaryTextColor

@Composable
fun FilmTimeCard(
    time: String,
    contentColor: Color = SecondaryTextColor,
    containerColor: Color = Color.White,
) {
    Card(
        shape = RoundedCornerShape(50f),
        colors = CardDefaults.cardColors(
            contentColor = contentColor,
            containerColor = containerColor
        ),
    ) {
        Row(
            modifier = Modifier
                .width(100.dp)
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_time),
                contentDescription = stringResource(id = R.string.time),
                tint = GrayIconColor,
                modifier = Modifier.size(20.dp)
            )

            Text(
                text = time,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                fontFamily = Product,
                color = contentColor,
                textAlign = TextAlign.Center,
            )
        }
    }
}