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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ipca.example.calculator.ui.theme.CalculatorTheme
import ipca.example.calculator.ui.theme.Orange40


@Composable
fun CalculatorView(modifier: Modifier = Modifier) {

    var display by remember {mutableStateOf("")}

    Column(modifier = modifier){
        Text(text = display)
        Row() {

            Button(onClick = {display = ""}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.Gray)})
            {
                Text(text = "AC")
            }
            Button(onClick = {display += "-"}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.Gray)})
            {
                Text(text = "+/-")
            }
            Button(onClick = {display += ""}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.Gray)})
            {
                Text(text = "%")
            }
            Button(onClick = {display = ""}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Orange40)})
            {
                Text(text = "/")
            }
        }
        Row() {

            Button(onClick = {display += "7"}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.DarkGray)})
            {
                Text(text = "7")
            }
            Button(onClick = {display += "8"}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.DarkGray) })
            {
                Text(text = "8")
            }
            Button(onClick = {display += "9"}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.DarkGray) })
            {
                Text(text = "9")
            }
            Button(onClick = {display = "*"}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Orange40)})
            {
                Text(text = "X")
            }
        }
        Row() {

            Button(
                onClick = {display += "7"},
                modifier = Modifier
                    .weight(1f)
                    .aspectRatio(1f)
                    .padding(4.dp),
                    colors = ButtonDefaults.run { buttonColors(Color.DarkGray)})
            {
                Text(text = "4")
            }
            Button(onClick = {display += "8"}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.DarkGray)})
            {
                Text(text = "5")
            }
            Button(onClick = {display += "9"}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.DarkGray)})
            {
                Text(text = "6")
            }
            Button(onClick = {display = ""}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Orange40)})
            {
                Text(text = "-")
            }
        }
        Row() {

            Button(onClick = {display += "1"}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.DarkGray)})
            {
                Text(text = "1")
            }
            Button(onClick = {display += "2"}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.DarkGray)})
            {
                Text(text = "2")
            }
            Button(onClick = {display += "3"}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.DarkGray)})
            {
                Text(text = "3")
            }
            Button(onClick = {display = "-"}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Orange40)})
            {
                Text(text = "+")
            }
        }
        Row() {

            Button(onClick = {display += "0"}, modifier = Modifier
                .weight(0.7f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.DarkGray)})
            {
                Text(text = "0")
            }
            Button(onClick = {display += "."}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Color.DarkGray)})
            {
                Text(text = ",")
            }
            Button(onClick = {display += ""}, modifier = Modifier
                .weight(1f)
                .aspectRatio(1f)
                .padding(4.dp),
                colors = ButtonDefaults.run { buttonColors(Orange40)})
            {
                Text(text = "=")
            }

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