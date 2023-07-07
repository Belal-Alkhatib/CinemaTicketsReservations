package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.b.alkhatib.cinematicketsreservations.ui.theme.Orange
import com.b.alkhatib.cinematicketsreservations.ui.theme.Product
import com.b.alkhatib.cinematicketsreservations.ui.theme.ThirdTextColor


@Composable
fun TextWithCircle(
    text: String,
    circleColor: Color,
    textColor: Color = ThirdTextColor,
    modifier: Modifier = Modifier,
    circleSize: Dp = 14.dp,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Box(
            modifier = Modifier
                .size(circleSize)
                .background(color = circleColor, shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {}

        Text(
            text = text,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            fontFamily = Product,
            color = textColor
        )
    }
}

@Preview
@Composable
fun test() {
    TextWithCircle(text = "Taken", circleColor = Orange, textColor = ThirdTextColor)
}
