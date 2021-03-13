package com.example.composetestapp.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.*

/**
 * Created by alirezarafeezadeh on 3/11/21.
 */


@Composable
fun Register() {

    val emailTextState = remember { mutableStateOf(TextFieldValue()) }
    val passwordTextState = remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(Color.White)
            .fillMaxSize()
    ) {

        loginHeader()
        Spacer(modifier = Modifier.height(16.dp))

        TextGray(text = "Please login to continue.", modifier = Modifier.padding(start = 16.dp))
        Spacer(modifier = Modifier.height(48.dp))

        editableText(emailTextState, "Email Address", false)
        Spacer(modifier = Modifier.height(32.dp))

        editableText(passwordTextState, "Password", true)
        Spacer(modifier = Modifier.height(32.dp))

        ActionButton(text = "Login", modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(32.dp))

        TextSublte(
            text = "New to Scratch?", modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(8.dp))

        TextButton("Create Account Here", Modifier.align(Alignment.CenterHorizontally))

        // This should be at the end for the scrollview to work
        Spacer(modifier = Modifier.height(100.dp))


    }

}


@Preview(showBackground = true)
@Composable
fun RegisterDefaultPreview() {
    ComposeTestAppTheme {
        Register()
    }
}
