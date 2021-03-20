package com.example.composetestapp.ui.widgets

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetestapp.R
import com.example.composetestapp.nunitoFamily

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