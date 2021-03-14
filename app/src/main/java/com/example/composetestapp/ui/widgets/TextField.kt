package com.example.composetestapp.ui.widgets

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetestapp.R
import com.example.composetestapp.nunitoFamily


@Composable
fun EditableText(textState: MutableState<TextFieldValue>, hint: String = "") {

    TextField(
        value = textState.value,
        onValueChange = { textState.value = it },
        modifier = Modifier
//            .padding(start = 16.dp, end = 16.dp)
            .fillMaxWidth(),

        singleLine = true,
        textStyle = TextStyle(
            fontSize = 16.sp,
            fontFamily = nunitoFamily,
            fontWeight = FontWeight.Light
        ),
//        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//        visualTransformation = passVisual,
//        shape = MaterialTheme.shapes.small.copy(bottomEnd = ZeroCornerSize, bottomStart = ZeroCornerSize)
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.White,
            textColor = colorResource(id = R.color.midnight_moss),
            cursorColor = colorResource(id = R.color.midnight_moss),
            focusedIndicatorColor = colorResource(
                id = R.color.silver
            )
        )
    )

}