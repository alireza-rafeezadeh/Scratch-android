package com.example.composetestapp.ui.recipe

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.R
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.ButtonText
import com.example.composetestapp.ui.widgets.H3Text
import com.example.composetestapp.ui.widgets.TextGray
import com.example.composetestapp.ui.widgets.TextLead


@Composable
fun MyRecipeFooter() {

    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
//            .padding(bottom = 16.dp)
            .fillMaxWidth()
    ) {
        Row(modifier = Modifier.align(Alignment.CenterVertically)) {
            TextGray(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(end = 16.dp),
                text = "± 5 mins"
            )
            TextGray(
                text = "4 ingredients", modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(end = 16.dp)
            )
        }

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color.White
            ),
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = colorResource(id = R.color.jungle_green),
                    shape = RoundedCornerShape(20)
                )
        ) {


            Row {
                Image(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(end = 8.dp),
                    painter = painterResource(id = R.drawable.ic_play),
                    contentDescription = null
                )
                Text(
                    modifier = Modifier.align(Alignment.CenterVertically),
                    text = "cook",
                    color = colorResource(id = R.color.jungle_green)
//                            ,shape = RoundedCornerShape(20)
                )
            }
        }
    }
}

@Composable
fun MyToolbar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, end = 32.dp, top = 8.dp, bottom = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        H3Text(
            text = "My Recipes",
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(start = 16.dp, top = 12.dp, bottom = 12.dp)
        )

        Row(
            modifier = Modifier
                .align(Alignment.CenterVertically)
        ) {

            Image(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
//                    .padding(end = 2.dp)
            )

            ButtonText(
                text = "Add New",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 16.dp, top = 12.dp, bottom = 12.dp)
            )

        }


    }
}


@Composable
fun RecipeFilter() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 24.dp, end = 24.dp, top = 8.dp, bottom = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        TextLead(
            text = "Western (5)",
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(start = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_arrow_down),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .padding(end = 16.dp)
        )


    }
}

@Preview
@Composable
fun recipeHeaderPreview() {
    ComposeTestAppTheme {
        Box(modifier = Modifier.background(color = Color.White)) {
            MyRecipeFooter()
        }
    }
}


@Preview
@Composable
fun myToolbarPreview() {
    ComposeTestAppTheme() {
        Box(modifier = Modifier.background(color = Color.White)) {
            MyToolbar()
        }
    }
}


@Preview
@Composable
fun reciperFilterPreview() {
    ComposeTestAppTheme() {
        Box(modifier = Modifier.background(color = Color.White)) {
            RecipeFilter()
        }
    }
}