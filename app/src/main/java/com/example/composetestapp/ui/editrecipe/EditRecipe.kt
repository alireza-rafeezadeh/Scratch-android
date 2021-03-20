package com.example.composetestapp.ui.editrecipe

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.R
import com.example.composetestapp.ui.recipe.MyToolbar
import com.example.composetestapp.ui.widgets.*


@Composable
fun EditRecipe() {

    val recipeTextState = remember { mutableStateOf(TextFieldValue()) }



    Column(
        modifier = Modifier
            .background(color = Color.White)
            .fillMaxSize()
    ) {

        MyToolbar("Edit Recipes")

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
                    GalleryItem()
                    Spacer(modifier = Modifier.padding(16.dp))
                }

                item {
                    IngredientsItem()
                    Spacer(modifier = Modifier.padding(16.dp))
                }

                item {
                    HowToCookItem()
                    Spacer(modifier = Modifier.padding(16.dp))
                }

                item {
                    AdditionalInfoItem()
                    Spacer(modifier = Modifier.padding(16.dp))
                }

                item {

                    Column(
                        modifier = Modifier
                            .padding(start = 24.dp, end = 24.dp)
                            .fillMaxWidth()
                    ) {

                        TextGray(text = "Save To", modifier = Modifier.padding())

                        Spacer(modifier = Modifier.padding(8.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {

                            Spacer(modifier = Modifier.padding(start = 16.dp))

                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier
                                    .weight(5f)
                                    .align(Alignment.CenterVertically)
                            ) {
                                TextLead(
                                    text = "Western (5)",
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                )

                                Image(
                                    modifier = Modifier
                                        .padding(0.dp)
                                        .align(Alignment.CenterVertically),
                                    painter = painterResource(id = R.drawable.ic_arrow_down_gray),
                                    contentDescription = null
                                )
                            }

                            Spacer(modifier = Modifier.padding(start = 32.dp))

                            OutlinedButton(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .weight(4f)
                                    .height(50.dp),
                                onClick = { /*TODO*/ },
                                shape = RoundedCornerShape(8.dp),
                                border = BorderStroke(
                                    width = 2.dp, color = colorResource(
                                        id = R.color.jungle_green
                                    )
                                )
                            ) {
                                ButtonText(
                                    text = "Save Recipe", modifier = Modifier.padding(0.dp),
                                )
                            }
                        }

                        Spacer(modifier = Modifier.padding(24.dp))

                        ActionButton(text = "Post To Feed", modifier = Modifier.padding())
                        Spacer(modifier = Modifier.padding(16.dp))


                        Row(Modifier.align(Alignment.CenterHorizontally)) {

                            Image(
                                modifier = Modifier.align(Alignment.CenterVertically) ,
                                painter = painterResource(id = R.drawable.ic_trash),
                                contentDescription = null
                            )

                            Spacer(modifier = Modifier.padding(8.dp))

                            TextBody(
                                modifier = Modifier.align(Alignment.CenterVertically),
                                text = "Remove from Cookbook",
                            )
                        }

                        Spacer(modifier = Modifier.padding(40.dp))
                    }
                }
            })
    }

}


@Preview
@Composable
fun editRecipePreview() {
    ComposeTestAppTheme {
        EditRecipe()
    }

}