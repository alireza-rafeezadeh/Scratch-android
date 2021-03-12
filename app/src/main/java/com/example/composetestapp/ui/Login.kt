package com.example.composetestapp.ui

import android.widget.HorizontalScrollView
import android.widget.ScrollView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetestapp.R
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import kotlin.math.sin

/**
 * Created by alirezarafeezadeh on 3/11/21.
 */


@Composable
fun login() {

    val emailTextState = remember { mutableStateOf(TextFieldValue()) }
    val passwordTextState = remember { mutableStateOf(TextFieldValue()) }





    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(Color.White)
            .fillMaxSize()
    ) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {


            Image(
                painter = painterResource(id = R.drawable.login_header), contentDescription = null,
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth()
            )

            Row(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(top = 30.dp, start = 30.dp)
            ) {

                Image(
                    painter = painterResource
                        (id = R.drawable.ic_scratch_logo),
                    contentDescription = null,
                    Modifier
                        .height(48.dp)
                        .width(48.dp)

                )

                Text(
                    "Scratch", fontSize = 21.sp,
                    color = colorResource(id = R.color.text_color),
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
            Text(
                text = "Welcome Back!",
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 16.dp),

                style = TextStyle(fontWeight = FontWeight.Bold),
                fontSize = 21.sp

            )

        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Please login to continue.",
            color = colorResource(id = R.color.scorpion),
            modifier = Modifier.padding(start = 16.dp)
        )

//        Spacer(modifier = Modifier.height(56.dp))
        editableText(emailTextState, "Email Address", false)

        Spacer(modifier = Modifier.height(16.dp))
        editableText(passwordTextState, "Password", true)

        Spacer(modifier = Modifier.height(16.dp))



        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(50.dp)
                .width(300.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(20),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = colorResource(id = R.color.jungle_green),

                )
        ) {
            Text(
                text = "Login",
//                modifier = Modifier
//                    .width(200.dp),
//                    .background(color = colorResource(id = R.color.jungle_green)),
                color = colorResource(id = R.color.white)
            )
        }

        Text(
            text = "Already have an account?",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = colorResource(id = R.color.silver_chalice)
        )

        Text(
            text = "Login Here", fontSize = 17.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = colorResource(id = R.color.jungle_green)
        )


        // This should be at the end for the scrollview to work
        Spacer(modifier = Modifier.height(100.dp))


    }

}


@Composable
fun editableText(textState: MutableState<TextFieldValue>, title: String, isPassword: Boolean) {
    Text(
        text = title,
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
            .fillMaxWidth(),
        singleLine = true,
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


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestAppTheme {
        login()
    }
}
