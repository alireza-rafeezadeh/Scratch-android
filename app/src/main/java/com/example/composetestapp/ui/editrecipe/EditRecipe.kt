package com.example.composetestapp.ui.editrecipe

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.R
import com.example.composetestapp.toggle
import com.example.composetestapp.ui.recipe.MyToolbar
import com.example.composetestapp.ui.widgets.*
import kotlinx.coroutines.launch


@ExperimentalMaterialApi
@Composable
fun EditRecipe() {
    ComposeTestAppTheme {

        val recipeTextState = remember { mutableStateOf(TextFieldValue()) }

        val bottomSheetScaffoldState = rememberBottomSheetScaffoldState(
            bottomSheetState = BottomSheetState(BottomSheetValue.Collapsed)
        )
        val coroutineScope = rememberCoroutineScope()
        BottomSheetScaffold(
            scaffoldState = bottomSheetScaffoldState,
            sheetContent = {
                Box(
                    Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .background(color = Color.Cyan)
                ) {
                    // TODO: This is the content of the bottom sheet
//                    Text(text = "Hello from sheet")
                }
            }, sheetPeekHeight = 0.dp
        ) {

            Column(
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxSize()
            ) {

                MyToolbar(stringResource(R.string.edit_recipes_title))

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
                            GalleryItem {
                                coroutineScope.launch {
                                    bottomSheetScaffoldState.bottomSheetState.toggle()
                                }
                            }
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
                            EditRecipesFooter()
                        }
                    })
            }

        }

    }

}


@ExperimentalMaterialApi
@Preview
@Composable
fun editRecipePreview() {
    ComposeTestAppTheme {
        EditRecipe()
    }

}
