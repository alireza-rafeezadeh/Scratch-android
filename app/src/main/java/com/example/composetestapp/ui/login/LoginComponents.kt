package com.example.composetestapp.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetestapp.R
import com.example.composetestapp.nunitoFamily

/**
 * Created by alirezarafeezadeh on 3/12/21.
 */



@Composable
fun editableText(textState: MutableState<TextFieldValue>, title: String, isPassword: Boolean) {
    Text(
        text = title,
        fontFamily =  nunitoFamily,
        fontWeight = FontWeight.Light,
        color = colorResource(id = R.color.silver_chalice),
        modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)
    )

    var passVisual: VisualTransformation = VisualTransformation.None
    if (isPassword) {
        passVisual = PasswordVisualTransformation()
    }

    TextField(
        value = textState.value,
        onValueChange = { textState.value = it },
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
            .fillMaxWidth()
        ,

        singleLine = true,
        textStyle = TextStyle(fontSize = 16.sp,
            fontFamily =  nunitoFamily,
            fontWeight = FontWeight.Light
        ),
//        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        visualTransformation = passVisual,
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


@Composable
fun loginHeader() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Image(
            painter = painterResource(id = R.drawable.login_header),
            contentDescription = null,
            modifier = Modifier
                .height(240.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )

        Row(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(top = 30.dp, start = 24.dp)
        ) {

            Image(
                painter = painterResource
                    (id = R.drawable.ic_scratch_logo),
                contentDescription = null,
                Modifier
                    .height(26.dp)
                    .width(26.dp)

            )

            Spacer(modifier = Modifier.width(8.dp))

            Text(
                "scratch", fontSize = 20.sp,
                color = colorResource(id = R.color.text_color),
                fontFamily = nunitoFamily,
                fontWeight = FontWeight.Bold,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
        Text(
            text = "Welcome Back!",
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 24.dp, bottom = 32.dp),
            fontFamily = nunitoFamily,
            fontWeight = FontWeight.Bold,
            style = TextStyle(fontWeight = FontWeight.Bold),
            fontSize = 24.sp

        )

    }
}