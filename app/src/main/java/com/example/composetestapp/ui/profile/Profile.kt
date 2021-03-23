package com.example.composetestapp.ui.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.R
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.H3Text
import com.example.composetestapp.ui.widgets.H5Text
import com.example.composetestapp.ui.widgets.TextBody
import com.example.composetestapp.ui.widgets.TextGray


@Composable
fun Profile() {

    Spacer(Modifier.padding(top = 12.dp))
    Column(modifier = Modifier.padding(start = 24.dp, end = 24.dp)) {
        ProfileToolBar()

        Row(
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                modifier = Modifier.height(80.dp),
                painter = painterResource(id = R.drawable.profile_avatar),
                contentDescription = null
            )
            Spacer(modifier = Modifier.padding(start = 16.dp))
            Column {

                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    H5Text(text = "Nick Evans", modifier = Modifier.padding())

                    Image(
                        painter = painterResource(id = R.drawable.ic_edit),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(color = Color.Red)
                    )
                }
                TextGray(text = "Potato Master", modifier = Modifier.padding())
                Row {
                    TextGray(text = "584 followers", modifier = Modifier.padding())

                    Image(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 10.dp, end = 10.dp),
                        painter = painterResource(id = R.drawable.ic_dot),
                        contentDescription = null
                    )
                    TextGray(text = "23k likes", modifier = Modifier.padding())
                }
            }

        }
    }

}

@Composable
fun ProfileToolBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        H3Text(
            text = "My Kitchen",
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Row(modifier = Modifier.align(Alignment.CenterVertically)) {
            Image(
                modifier = Modifier.align(Alignment.CenterVertically),
                painter = painterResource(id = R.drawable.ic_settings),
                contentDescription = null
            )
            Spacer(Modifier.padding(4.dp))
            TextBody(text = "Settings", modifier = Modifier.align(Alignment.CenterVertically))

        }
    }
}

@Preview
@Composable
fun previewProfile() {
    ComposeTestAppTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ) {
            Profile()
        }
    }
}