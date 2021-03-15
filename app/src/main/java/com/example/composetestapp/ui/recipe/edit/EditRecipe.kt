package com.example.composetestapp.ui.recipe.edit

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.TextLead
import com.example.composetestapp.R
import com.example.composetestapp.ui.widgets.TextBody


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
                    GalleryItem()
                    Spacer(modifier = Modifier.padding(16.dp))
                }

                item {
                    IngredientsItem()
                    Spacer(modifier = Modifier.padding(16.dp))
                }

                item {

                    Card(
                        elevation = 24.dp,
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 24.dp, end = 24.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 16.dp, end = 16.dp)
                        ) {

                            Row {

                                Box(
                                    modifier = Modifier
                                        .width(24.dp)
                                        .height(24.dp)
                                        .border(
                                            width = 1.dp, color = colorResource(
                                                id = R.color.jungle_green,
                                            ), shape = RoundedCornerShape(50)
                                        )
                                ) {
                                    Text(
                                        fontSize = 11.sp,
                                        modifier = Modifier.align(Alignment.Center),
                                        text = "1", color = colorResource(
                                            id = R.color.jungle_green
                                        )
                                    )
                                }

                                Spacer(Modifier.padding(16.dp))

                                TextBody(
                                    text = "Heat a Belgian waffle iron.",
                                    modifier = Modifier.padding()
                                )
                            }


                            Row {

                                Box(
                                    modifier = Modifier
                                        .width(24.dp)
                                        .height(24.dp)
                                        .border(
                                            width = 1.dp, color = colorResource(
                                                id = R.color.jungle_green,
                                            ), shape = RoundedCornerShape(50)
                                        )
                                ) {
                                    Text(
                                        fontSize = 11.sp,
                                        modifier = Modifier.align(Alignment.Center),
                                        text = "1", color = colorResource(
                                            id = R.color.jungle_green
                                        )
                                    )
                                }

                                Spacer(Modifier.padding(16.dp))

                                TextBody(
                                    text = "Mix the flour, sugar, and baking powder together in a mixing bowl. Stir in 1 cup eggnog, butter, and the egg until well blended. Add more eggnog if needed to make a pourable batter.",
                                    modifier = Modifier.padding()
                                )
                            }

                        }
                    }

                    Spacer(modifier = Modifier.padding(16.dp))
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