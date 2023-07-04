package com.b.alkhatib.cinematicketsreservations.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.b.alkhatib.cinematicketsreservations.ui.theme.Orange
import com.b.alkhatib.cinematicketsreservations.ui.theme.Product

@Composable
fun NormalButton(title: String, modifier: Modifier = Modifier, containerColor: Color = Orange, strokeColor: Color = Orange, onClick: () -> Unit) {
    Button(
        onClick = { onClick() },
        shape = RoundedCornerShape(24.dp),
        elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 0.dp),
        colors = ButtonDefaults.buttonColors(contentColor = Color.White, containerColor = containerColor),
        border = BorderStroke(1.dp, strokeColor),
        modifier = modifier.height(40.dp)
    ) {
        Text(
            text = title,
            modifier = Modifier.align(Alignment.CenterVertically),
            color = Color.White,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            fontFamily = Product,
        )
    }
}

@Preview
@Composable
fun tess() {
    NormalButton(title = "coming soon") {
        
    }
}