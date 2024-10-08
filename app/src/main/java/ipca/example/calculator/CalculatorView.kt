package ipca.example.calculator

import android.text.Layout.Alignment
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ipca.example.calculator.ui.theme.CalculatorTheme
import ipca.example.calculator.ui.theme.Orange40


@Composable
fun CalculatorView(modifier: Modifier = Modifier ){

    var display by remember { mutableStateOf("0") }

    val onNumPress : (String) -> Unit = { num ->
        if (display.length <= 8) {

            if (display == "0") {
                display = num
            } else {
                display += num
            }
        }
    }

    Column (modifier = modifier){
        Text(
            modifier = Modifier.fillMaxSize(),
            text = display,
            textAlign = TextAlign.End,
            style = MaterialTheme.typography.displayLarge)
        Row{
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "7",
                onButtonPress = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "8",
                onButtonPress = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "9",
                onButtonPress = onNumPress
            )
            CalcButton(
                modifier = Modifier.weight(1f),
                label = "+",
                isOperation = true,
                onButtonPress = {display = "0" }
            )

        }


    }

}

@Preview(showBackground = true)
@Composable
fun CalculatorPreview() {
    CalculatorTheme {
        CalculatorView()
    }
}