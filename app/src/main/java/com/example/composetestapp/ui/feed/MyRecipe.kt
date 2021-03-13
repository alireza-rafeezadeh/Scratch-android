package com.example.composetestapp.ui.feed

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.R
import com.example.composetestapp.ui.widgets.TextButton
import com.example.composetestapp.ui.widgets.TextCardTitle
import com.example.composetestapp.ui.widgets.TextGray

/**
 * Created by alirezarafeezadeh on 3/13/21.
 */


@Composable
fun MyRecipe() {

    val list = (0..60).toList()

    Box(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
    ) {
        LazyColumn(content = {
            items(list) { item ->


                Card(elevation = 4.dp,
                    modifier = Modifier
//                        .height(270.dp)
                        .padding(start = 32.dp, end = 32.dp, bottom = 16.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(size = 8.dp),
                ) {
                    Column(
//                        modifier = Modifier
////                        .height(270.dp)
//                            .padding(start = 32.dp, end = 32.dp, bottom = 16.dp)
//                            .fillMaxWidth()
                    ) {
                        /* Image(
                             painter = painterResource(id = R.drawable.scrach_logo),
                             contentDescription = null
                         )*/


                        Image(
                            painter = painterResource(id = R.drawable.reciper_card1),
                            contentDescription = null,
                            modifier = Modifier
//                            .height(20.dp)
                                .fillMaxWidth(),
                            contentScale = ContentScale.FillWidth
                        )

                        TextCardTitle(
                            text = "Cooked Coconut Mussels",
                            modifier = Modifier.padding(start = 16.dp)
                        )

                        Row(
                            horizontalArrangement = Arrangement.SpaceAround,
                            modifier = Modifier
                                .padding(bottom = 16.dp)
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

                }
            }
        })

    }

}


@Preview
@Composable
fun MyRecipePreview() {
    ComposeTestAppTheme {
        MyRecipe()
    }
}
