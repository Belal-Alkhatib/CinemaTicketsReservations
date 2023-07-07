package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.b.alkhatib.cinematicketsreservations.ui.theme.Product
import com.b.alkhatib.cinematicketsreservations.ui.theme.ThirdTextColor

@Composable
fun DateStyle(date: String, day: String, dayColor: Color = ThirdTextColor) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(vertical = 16.dp)
    ) {
        Text(
            text = date,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            fontFamily = Product,
        )
        Text(
            text = day,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            fontFamily = Product,
            color = dayColor
        )
    }
}
