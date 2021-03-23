package com.example.composetestapp.ui.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.navigate
import com.example.composetestapp.R
import com.example.composetestapp.nunitoFamily
import com.example.composetestapp.onItemEvent

/**
 * Created by alirezarafeezadeh on 3/13/21.
 */


val onClicked  = { }

@Composable
fun ActionButton(text : String , modifier : Modifier , onClick : () -> Unit = onClicked) {

    Button(
        onClick = { onClick() },
        modifier = modifier
            .height(50.dp)
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp),
        shape = RoundedCornerShape(20),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = colorResource(id = R.color.jungle_green),

            )
    ) {
        Text(
            text = text,
            fontFamily =  nunitoFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
//                modifier = Modifier
//                    .width(200.dp),
//                    .background(color = colorResource(id = R.color.jungle_green)),
            color = colorResource(id = R.color.white)
        )
    }
}

@Composable
fun ClickableText(text : String, modifier : Modifier, onClick : onItemEvent) {

    OutlinedButton(
        border = BorderStroke(0.dp, Color.White),
        modifier = modifier,
        onClick = { onClick() }) {
        ButtonText(text, Modifier.padding(0.dp))
    }
}