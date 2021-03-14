package com.example.composetestapp.ui.recipe.edit

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.H5Text
import com.example.composetestapp.R


@Composable
fun EditRecipe() {

    val recipeTextState = remember { mutableStateOf(TextFieldValue()) }



    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxWidth(),
            content = {

                item {
                    RecipeNameItem(recipeTextState)
                    Spacer(modifier = Modifier.padding(20.dp))
                }

                item {

                    Card(
                        elevation = 24.dp,
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 24.dp, end = 24.dp)
                    )
                    {
                        Column(modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 16.dp, end = 16.dp)) {

                            Spacer(Modifier.padding(8.dp))

                            Row(
                                modifier = Modifier
//                                    .padding(start = 24.dp, end = 24.dp)
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                H5Text(
                                    text = "Gallery", modifier = Modifier
                                        .padding(0.dp)
                                        .align(
                                            Alignment.CenterVertically
                                        )
                                )

                                Image(
                                    modifier = Modifier.align(Alignment.CenterVertically),
                                    painter = painterResource(id = R.drawable.ic_edit),
                                    contentDescription = null,
                                    contentScale = ContentScale.FillWidth
                                )
                            }


                            Spacer(modifier = Modifier.padding(20.dp))

                            Image(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(125.dp),
                                painter = painterResource(id = R.drawable.recipe1),
                                contentDescription = null,
                                contentScale = ContentScale.FillWidth
                            )

                            Spacer(modifier = Modifier.padding(4.dp))

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
//                                    .height(120.dp),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {

                                Image(
                                    modifier = Modifier
                                        .weight(1f)
                                        ,
                                    painter = painterResource(id = R.drawable.recipe2),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop
                                )

                                Spacer(modifier = Modifier.padding(4.dp))

                                Image(
                                    modifier = Modifier
//                                    .padding(start = 4.dp,end = 4.dp)
                                        .weight(1f)
                                        ,
                                    painter = painterResource(id = R.drawable.recipe3),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop
                                )
                                Spacer(modifier = Modifier.padding(4.dp))
                                Image(
                                    modifier = Modifier
                                        .weight(1f)
                                        ,
                                    painter = painterResource(id = R.drawable.recipe4),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop
                                )
                            }

                            Spacer(modifier = Modifier.padding(8.dp))
                        } // end of column2 for item2
                    } // end of card

                    Spacer(modifier = Modifier.padding(40.dp))

                }



            })
    } // end of column

}


@Preview
@Composable
fun editRecipePreview() {
    ComposeTestAppTheme {
        EditRecipe()
    }

}