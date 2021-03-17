package com.example.composetestapp.ui.recipe.detail

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.R
import com.example.composetestapp.ui.theme.ComposeTestAppTheme

@Composable
fun RecipeDetail() {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(340.dp),
        ) {

            Image(
                painter = painterResource(id = R.drawable.recipe_detail_header),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(340.dp),
                contentScale = ContentScale.Crop
            )

            OutlinedButton(
                modifier = Modifier
                    .padding(top = 8.dp, end = 24.dp)
                    .align(Alignment.TopEnd),
                colors = ButtonDefaults.textButtonColors(
                    backgroundColor =
                    colorResource(id = R.color.back_40_opacity),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(8.dp),
                onClick = { /*TODO*/ }, border = BorderStroke(1.dp, Color.White)
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.ic_play_white),
                        contentDescription = null,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )

                    Spacer(modifier = Modifier.padding(start = 8.dp))
                    Text(
                        "Cook Now",
                        color = Color.White,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        }
    }


}


@Preview
@Composable
fun RecipeDetailPreview() {
    ComposeTestAppTheme {
        RecipeDetail()
    }
}
