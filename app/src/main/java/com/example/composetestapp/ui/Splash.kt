package com.example.composetestapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.composetestapp.R
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import java.util.logging.Handler


@Composable
fun Splash() {

    Box(
        Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        Row(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(bottom = 160.dp)
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

        Box(modifier = Modifier.align(Alignment.BottomCenter)) {

            Image(
                painter = painterResource(id = R.drawable.splash_image),
                contentDescription = null,
                modifier = Modifier
                    .alpha(0.8f)
                    .height(370.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(4.dp))
                    .align(Alignment.Center),
                contentScale = ContentScale.FillWidth
            )
            Box(
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
            )

            Box(
                modifier = Modifier
                    .height(140.dp)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.linearGradient(
                            colors =
                            listOf(Color.White, colorResource(id = R.color.blank)),
                            start = Offset(0.0f, 0.0f),
                            end = Offset(0.0f, 400.0f)
                        )
                    )
            )

        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestAppTheme {
        Splash()
    }
}