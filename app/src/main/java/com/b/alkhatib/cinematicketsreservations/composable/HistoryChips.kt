import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.b.alkhatib.cinematicketsreservations.R
import com.b.alkhatib.cinematicketsreservations.composable.DateStyle
import com.b.alkhatib.cinematicketsreservations.ui.theme.CardBackground
import com.b.alkhatib.cinematicketsreservations.ui.theme.PrimaryTextColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.SelectedCardColor
import com.b.alkhatib.cinematicketsreservations.ui.theme.TimeChipBorderColor

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HistoryChips() {
    val chipTitles =
        listOf(
            Pair(stringResource(id = R.string.history14), "Thu"),
            Pair(stringResource(id = R.string.history15), "Fri"),
            Pair(stringResource(id = R.string.history16), "Sut"),
            Pair(stringResource(id = R.string.history17), "Sun"),
            Pair(stringResource(id = R.string.history18), "Mon"),
            Pair(stringResource(id = R.string.history19), "Tue"),
            Pair(stringResource(id = R.string.history20), "Wed"),
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
                    label = {
                        if (index == selectedChipIndex.value) {
                            DateStyle(
                                date = chipTitles[index].first,
                                day = chipTitles[index].second,
                                dayColor = Color.White
                            )
                        } else {
                            DateStyle(
                                date = chipTitles[index].first,
                                day = chipTitles[index].second
                            )
                        }
                    },
                    onClick = { selectedChipIndex.value = index },
                    colors = if (index == selectedChipIndex.value) selectedChipColor else unSelectedChipColor,
                    shape = RoundedCornerShape(16.dp)
                )

            }
        }
    }

}
