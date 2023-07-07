import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.ui.theme.CardBackground
import com.b.alkhatib.cinematicketsreservations.ui.theme.PrimaryTextColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.SelectedCardColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.TimeChipBorderColor

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun CustomChips() {
    val chipTitles =
        listOf(
            stringResource(id = R.string.time10),
            stringResource(id = R.string.time12),
            stringResource(id = R.string.time15),
            stringResource(id = R.string.time18),
            stringResource(id = R.string.time21),
            )
    val selectedChipIndex = remember { mutableStateOf(0) }

    val borderChipColor = AssistChipDefaults.assistChipBorder(borderColor = TimeChipBorderColor)
    val selectedChipColor = AssistChipDefaults.assistChipColors(
        containerColor = SelectedCardColor,
        labelColor = Color.White
    )

    val unSelectedChipColor = AssistChipDefaults.assistChipColors(
        containerColor = CardBackground,
        labelColor = PrimaryTextColor
    )

    LazyRow(modifier = Modifier.padding(8.dp)) {
        item(1) {
            for (index in chipTitles.indices) {
                AssistChip(
                    modifier = Modifier.padding(end = 8.dp),
                    label = { Text(text = chipTitles[index], modifier = Modifier.padding(vertical = 12.dp)) },
                    onClick = { selectedChipIndex.value = index },
                    colors = if (index == selectedChipIndex.value) selectedChipColor else unSelectedChipColor,
                    shape = CircleShape
                    )
            }
        }
    }

}
