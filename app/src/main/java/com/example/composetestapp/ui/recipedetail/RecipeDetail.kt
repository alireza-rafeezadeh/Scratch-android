package com.example.composetestapp.ui.recipedetail

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetestapp.R
import com.example.composetestapp.ui.profile.ProfilePagerCategory
import com.example.composetestapp.ui.profile.ProfileRecipes
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.H3Text
import com.example.composetestapp.ui.widgets.TextBody
import com.example.composetestapp.ui.widgets.TextLead

@Composable
fun RecipeDetail() {

    val state = remember { mutableStateOf(ProfilePagerCategory.Recipes) }

//    private val selectedCategory = MutableStateFlow(ProfilePagerCategory.Recipes)
//    val selectedIndex = MutableStateFlow(0)
    val selectedIndex = remember { mutableStateOf(0) }

    ComposeTestAppTheme {

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

                Box {
                    Image(
                        painter = painterResource(id = R.drawable.recipe_detail_header),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(340.dp),
                        contentScale = ContentScale.Crop
                    )

                    Box(
                        modifier =
                        Modifier
                            .background(color = colorResource(id = R.color.back_40_opacity))
                            .fillMaxWidth()
                            .height(340.dp),
                    )

                }
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


                H3Text(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(bottom = 16.dp, start = 24.dp),
                    text = "Engine-Cooked Honey \n Orange Pancake",
                    color = Color.White
                )


            }

            Spacer(modifier = Modifier.padding(top = 24.dp))

            Column(modifier = Modifier.padding(start = 24.dp, end = 24.dp)) {


                Row(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Surface(
                        modifier = Modifier
                            .weight(1f)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.recipe_detail_item_1),
                            contentDescription = null,
                            modifier = Modifier
                                .clickable {

                                },
                            contentScale = ContentScale.Crop
                        )
                    }

                    Spacer(modifier = Modifier.padding(start = 8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.recipe_detail_item_2),
                        contentDescription = null,
                        modifier = Modifier
//                        .height(80.dp)
                            .weight(1f),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.padding(start = 8.dp))

                    Image(
                        painter = painterResource(id = R.drawable.recipe_detail_item_3),
                        contentDescription = null,
                        modifier = Modifier
//                        .height(80.dp)
                            .weight(1f),
                        contentScale = ContentScale.Crop
                    )
                }

            }


            ScrollableTabRow(
                selectedTabIndex = selectedIndex.value,
                indicator = { tabPositions ->
                    TabRowDefaults.Indicator(
                        modifier =
                        Modifier
                            .tabIndicatorOffset(tabPositions[selectedIndex.value]),
                        color = colorResource(id = R.color.jungle_green)
//                    Modifier.background(color = Color.Blue)

                    )
                },
                contentColor = Color.White,
                backgroundColor = Color.White,
                modifier = Modifier.height(55.dp)
            ) {
                Tab(state.value == ProfilePagerCategory.Recipes,
//            unselectedContentColor = Color.White,
                    onClick = {
//                selectedCategory = ProfilePagerCategory.Recipes
                        state.value = ProfilePagerCategory.Recipes
                        selectedIndex.value = 0
                    }) {
                    TextLead(
                        text = "Ingredients",
                        modifier = Modifier.padding(
                            top = 8.dp,
                            bottom = 8.dp,
                            start = 16.dp,
                            end = 16.dp
                        )
                    )
//                state.value = ProfilePagerCategory.Recipes
                }


                Tab(state.value == ProfilePagerCategory.Saved, onClick = {
//                selectedCategory = ProfilePagerCategory.Saved
                    state.value = ProfilePagerCategory.Saved
                    selectedIndex.value = 1

                }) {
//                Text(text = "Saved")
                    TextLead(
                        text = "How to Cook",
                        modifier = Modifier.padding(
                            top = 8.dp,
                            bottom = 8.dp,
                            start = 16.dp,
                            end = 16.dp
                        )
                    )
                }



                Tab(state.value == ProfilePagerCategory.Following, onClick = {
//                selectedCategory = ProfilePagerCategory.Saved
                    state.value = ProfilePagerCategory.Following
                    selectedIndex.value = 2

                }) {
//                Text(text = "Saved")
                    TextLead(
                        text = "Additional Info",
                        modifier = Modifier.padding(
                            top = 8.dp,
                            bottom = 8.dp,
                            start = 16.dp,
                            end = 16.dp
                        )
                    )
                }

            }

            when (state.value) {
                ProfilePagerCategory.Recipes -> {
                    IngredientsContent()
                }

                ProfilePagerCategory.Saved -> {
                    Text(text = "Saved")
                }

                ProfilePagerCategory.Following -> {
                    Text(text = "following")
                }
            }

        }
    }

}


@Composable
fun IngredientsContent() {

    LazyColumn(content = {
        item {
            Spacer(modifier = Modifier.padding(top = 24.dp))
        }

        items(getIngredients()) { item ->
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp, bottom = 16.dp)) {
                Image(
                    painter = painterResource(id = item.image),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .height(50.dp)
                )
                TextBody(
                    text = item.name,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 16.dp)
                )

            }
        }
    })

}


@Preview
@Composable
fun RecipeDetailPreview() {
    ComposeTestAppTheme {
        RecipeDetail()
    }
}
