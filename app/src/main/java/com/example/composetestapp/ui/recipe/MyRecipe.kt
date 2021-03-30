package com.example.composetestapp.ui.recipe

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.R
import com.example.composetestapp.onItemEvent
import com.example.composetestapp.ui.widgets.TextCardTitle

/**
 * Created by alirezarafeezadeh on 3/13/21.
 */


@Composable
fun MyRecipe(
    navController: NavHostController
) {
    ComposeTestAppTheme {

        Box(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxSize()
        ) {

            Column {

                MyToolbar(title = "My Recipes", showAction = true)
                RecipeFilter()
                Spacer(modifier = Modifier.padding(16.dp))

                LazyColumn(content = {
                    items(getMyRecipeData()) { item ->

                        Card(
                            elevation = 4.dp,
                            modifier = Modifier
                                .padding(start = 32.dp, end = 32.dp, bottom = 20.dp)
                                .fillMaxWidth(),
                            shape = RoundedCornerShape(size = 8.dp),
                        ) {
                            Column(modifier = Modifier.clickable {
                                navController.navigate("EditRecipe")
                            }) {

                                Image(
                                    painter = painterResource(id = item.image),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth(),
                                    contentScale = ContentScale.FillWidth
                                )

                                Spacer(modifier = Modifier.padding(8.dp))

                                TextCardTitle(
                                    text = item.name,
                                    modifier = Modifier.padding(start = 16.dp)
                                )

                                MyRecipeFooter(navController)
                                Spacer(modifier = Modifier.padding(16.dp))
                            }

                        }
                    }

                    item {
                        Spacer(modifier = Modifier.padding(top = 70.dp))
                    }
                })
            }
        }
    }
}

@Preview
@Composable
fun MyRecipePreview() {
    ComposeTestAppTheme {
        val nav = rememberNavController()
        MyRecipe(nav)
    }
}
