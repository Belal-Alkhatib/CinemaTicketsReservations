package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.b.alkhatib.cinematicketsreservations.ui.theme.Product
import com.b.alkhatib.cinematicketsreservations.ui.theme.SecondaryTextColor

@Composable
fun ContentDescription(title: String) {
    Text(
        text = title,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        fontFamily = Product,
        color = SecondaryTextColor,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(horizontal = 32.dp)
    )
}
