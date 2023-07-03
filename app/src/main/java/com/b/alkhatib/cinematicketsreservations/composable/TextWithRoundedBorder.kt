package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.b.alkhatib.cinematicketsreservations.ui.theme.BorderCardColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.CardBackground
import com.b.alkhatib.cinematicketsreservations.ui.theme.Product
import com.b.alkhatib.cinematicketsreservations.ui.theme.SecondaryTextColor

@Composable
fun TextWithRoundedBorder(title: String) {

    Surface(
        shape = RoundedCornerShape(50),
        border = BorderStroke(1.dp, BorderCardColor),
        color = CardBackground,
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            color = SecondaryTextColor,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            fontFamily = Product,
        )
    }

}