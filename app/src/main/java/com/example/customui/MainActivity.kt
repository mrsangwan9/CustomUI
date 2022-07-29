package com.example.customui

import CustomComponent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.customui.ui.theme.CustomUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                MyApp()                }
            }
        }
    }

    @Composable
    fun MyApp() {

        var textFieldValue by remember{ mutableStateOf(0)}
        Box(contentAlignment = Alignment.BottomCenter,modifier=Modifier.size(300.dp).padding(bottom = 8.dp)){
            TextField(value = textFieldValue.toString(), onValueChange = {
                textFieldValue=it.toInt()  },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
        }
        CustomComponent(maxIndicatorValue = textFieldValue)
        }



    @Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CustomUITheme {
      MyApp()
    }
}
}