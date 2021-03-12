package com.example.composetestapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetestapp.R
import com.example.composetestapp.nunitoFamily
import com.example.composetestapp.ui.login.editableText
import com.example.composetestapp.ui.theme.ComposeTestAppTheme

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
                    .height(240.dp)
                    .fillMaxWidth()
            ,contentScale = ContentScale.FillWidth
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
                    fontFamily =  nunitoFamily,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }
            Text(
                text = "Welcome Back!",
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 24.dp , bottom = 32.dp),
                fontFamily =  nunitoFamily,
                fontWeight = FontWeight.Bold,
                style = TextStyle(fontWeight = FontWeight.Bold),
                fontSize = 24.sp

            )

        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Please login to continue.",
            color = colorResource(id = R.color.scorpion),
            modifier = Modifier.padding(start = 16.dp)
        )

        Spacer(modifier = Modifier.height(48.dp))
        editableText(emailTextState, "Email Address", false)

        Spacer(modifier = Modifier.height(32.dp))
        editableText(passwordTextState, "Password", true)

        Spacer(modifier = Modifier.height(32.dp))



        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .padding(start = 16.dp,end = 16.dp)
                .align(Alignment.CenterHorizontally),
            shape = RoundedCornerShape(20),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = colorResource(id = R.color.jungle_green),

                )
        ) {
            Text(
                text = "Login",
                fontFamily =  nunitoFamily,
                fontWeight = FontWeight.Light,
//                modifier = Modifier
//                    .width(200.dp),
//                    .background(color = colorResource(id = R.color.jungle_green)),
                color = colorResource(id = R.color.white)
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "New to Scratch?",
            fontFamily =  nunitoFamily,
            fontWeight = FontWeight.Light,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = colorResource(id = R.color.silver_chalice)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Create Account Here",
            fontFamily =  nunitoFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 17.sp,
//            font =  FontFamily(Font(R.font.nunito_regular)),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            color = colorResource(id = R.color.jungle_green)
        )


        // This should be at the end for the scrollview to work
        Spacer(modifier = Modifier.height(100.dp))


    }

}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestAppTheme {
        login()
    }
}
