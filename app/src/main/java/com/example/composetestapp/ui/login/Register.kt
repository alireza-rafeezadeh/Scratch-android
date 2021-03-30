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
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.*

/**
 * Created by alirezarafeezadeh on 3/11/21.
 */


@Composable
fun Register(navController: NavHostController) {

    val nameTextState = remember { mutableStateOf(TextFieldValue()) }
    val emailTextState = remember { mutableStateOf(TextFieldValue()) }
    val passwordTextState = remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(Color.White)
            .fillMaxSize()
    ) {

        loginHeader(
            "Start\nfrom Scratch"
        )
        Spacer(modifier = Modifier.height(16.dp))

        TextGray(text = "Please login to continue.", modifier = Modifier.padding(start = 16.dp))
        Spacer(modifier = Modifier.height(48.dp))

        LoginEditableText(nameTextState, "Full Name")
        Spacer(modifier = Modifier.height(24.dp))

        LoginEditableText(emailTextState, "Email")
        Spacer(modifier = Modifier.height(24.dp))

        LoginEditableText(passwordTextState, "Password", true)
        Spacer(modifier = Modifier.height(24.dp))


        ActionButton(
            text = "Create Account",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(32.dp))

        TextSublte(
            text = "Already have an account?",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(8.dp))
        ClickableText(
            text = "Login Here",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = { navController.navigate("Login") })

        // This should be at the end for the scrollview to work
        Spacer(modifier = Modifier.height(100.dp))


    }

}


@Preview(showBackground = true)
@Composable
fun RegisterDefaultPreview() {
    ComposeTestAppTheme {
        rememberNavController().also {
            Register(it)
        }
    }
}
