package com.example.composetestapp.ui.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.*

/**
 * Created by alirezarafeezadeh on 3/11/21.
 */


@Composable
fun login(onNavigationClicked: () -> Unit, navController: NavHostController) {

    val emailTextState = remember { mutableStateOf(TextFieldValue()) }
    val passwordTextState = remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .background(Color.White)
            .fillMaxSize()
    ) {

        loginHeader("Welcome Back!")

        Spacer(modifier = Modifier.height(16.dp))

        TextGray(text = "Please login to continue.", modifier = Modifier.padding(start = 16.dp))

        Spacer(modifier = Modifier.height(48.dp))

        LoginEditableText(emailTextState, "Email Address", false)

        Spacer(modifier = Modifier.height(24.dp))

        LoginEditableText(passwordTextState, "Password", true)

        Spacer(modifier = Modifier.height(24.dp))

        ActionButton(
            text = "Login",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = {
                navController.navigate("AppNavigator")
            }
        )

        Spacer(modifier = Modifier.height(32.dp))

        TextSublte(
            text = "New to Scratch?", modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(8.dp))

        ClickableText(
            text = "Create Account Here",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            onClick = {  navController.navigate("Register") })

        // This should be at the end for the scrollview to work
        Spacer(modifier = Modifier.height(100.dp))


    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestAppTheme {
//        login { }
    }
}
