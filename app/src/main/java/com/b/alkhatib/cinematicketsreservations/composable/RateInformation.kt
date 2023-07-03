package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.ui.theme.PrimaryTextColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.Product
import com.b.alkhatib.cinematicketsreservations.ui.theme.ThirdTextColor

@Composable
fun RateInformation(title: String, rate: String, rateOf: String = stringResource(id = R.string.of10)) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Text(
                text = rate,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                fontFamily = Product,
                color = PrimaryTextColor
            )
            Text(
                text = rateOf,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                fontFamily = Product,
                color = ThirdTextColor
            )

        }
        Text(
            text = title,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            fontFamily = Product,
            color = ThirdTextColor
        )
    }
}
