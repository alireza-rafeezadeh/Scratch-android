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

        val list = (0..60).toList()
        Box(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxSize()
        ) {

            Column {


                /*Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp, end = 32.dp, top = 24.dp, bottom = 32.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    H3Text(
                        text = "My Recipes",
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 16.dp, top = 12.dp, bottom = 12.dp)
                    )

                    Row(modifier = Modifier
                        .align(Alignment.CenterVertically)) {

                        Image(
                            painter = painterResource(id = R.drawable.ic_add),
                            contentDescription = null,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(end = 16.dp)
                        )

                        ButtonText(
                            text = "Add New",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(start = 16.dp, top = 12.dp, bottom = 12.dp)
                        )

                    }


                }*/


                MyToolbar(title = "My Recipes", showAction = true)

                RecipeFilter()

                Spacer(modifier = Modifier.padding(16.dp))

                /*Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 24.dp, end = 24.dp, top = 32.dp, bottom = 24.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    TextLead(
                        text = "Western (5)",
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 16.dp, top = 12.dp, bottom = 12.dp)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.ic_arrow_down),
                        contentDescription = null,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(end = 16.dp)
                    )
                }*/


                LazyColumn(content = {
                    items(getMyRecipeData()) { item ->

                        Card(
                            elevation = 4.dp,
                            modifier = Modifier
//                        .height(270.dp)
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
//                            .height(20.dp)
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
