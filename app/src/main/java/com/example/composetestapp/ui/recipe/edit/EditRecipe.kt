package com.example.composetestapp.ui.recipe.edit

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.ui.theme.ComposeTestAppTheme


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