package com.example.customui

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun MyValue() {
    var animationvalue by remember{ mutableStateOf(true)}
/*
   */
/**//*
 val alpha: Float by animateFloatAsState(if (animationvalue) 1f else 0f, animationSpec = tween(4000))
*/
    val number:Int by animateIntAsState(targetValue = if(animationvalue)100 else 10, animationSpec = tween(10000))
    Box(
        Modifier.fillMaxSize()
/*
            .graphicsLayer(alpha = alpha)
*/
            .background(Color.Red)
    ){

        Column (horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement = Arrangement.Center){

            Text(text = "$number",
                style = MaterialTheme.typography.h6)
            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = { animationvalue=!animationvalue }) {
            Text("ColorChanger")
        }


        }

    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMyValue(){
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        MyValue()
    }
}