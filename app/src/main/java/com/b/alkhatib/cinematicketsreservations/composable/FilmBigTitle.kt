package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.b.alkhatib.cinematicketsreservations.ui.theme.PrimaryTextColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.Product

@Composable
fun BigTitle(title: String, modifier: Modifier = Modifier, textAlign: TextAlign = TextAlign.Center) {
    Text(
        text = title,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,
        fontFamily = Product,
        color = PrimaryTextColor,
        textAlign = textAlign,
        modifier = modifier.padding(horizontal = 8.dp),
    )
}