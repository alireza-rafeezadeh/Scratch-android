package com.example.composetestapp.ui.profile

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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.composetestapp.R
import com.example.composetestapp.ui.search.ImageItem
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.widgets.*
import com.example.composetestapp.util.getProfileRecipes


@Composable
fun Profile(navHostController: NavHostController) {
//    var selectedCategory: ProfilePagerCategory = ProfilePagerCategory.Recipes
    val state = remember { mutableStateOf(ProfilePagerCategory.Recipes) }
    val selectedIndex = remember { mutableStateOf(0) }

    ComposeTestAppTheme {

        Spacer(Modifier.padding(top = 12.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 24.dp, end = 24.dp)
        ) {
            ProfileToolBar()

            Spacer(modifier = Modifier.padding(top = 32.dp))

            ProfileInfo()

            Spacer(modifier = Modifier.padding(top = 24.dp))
            TabRow(
                selectedTabIndex = selectedIndex.value,
                indicator = { tabPositions ->
                    TabRowDefaults.Indicator(
                        modifier =
                        Modifier
                            .tabIndicatorOffset(tabPositions[selectedIndex.value]),
                        color = colorResource(id = R.color.jungle_green)
                    )
                },
                contentColor = Color.White,
                backgroundColor = Color.White,
                modifier = Modifier.height(55.dp)
            ) {
                Tab(state.value == ProfilePagerCategory.Recipes,
                    onClick = {
                        state.value = ProfilePagerCategory.Recipes
                        selectedIndex.value = 0
                    }) {
                    TextLead(text = "Recipes", modifier = Modifier.padding(0.dp))
                }

                Tab(state.value == ProfilePagerCategory.Saved, onClick = {
                    state.value = ProfilePagerCategory.Saved
                    selectedIndex.value = 1
                }) {
                    TextLead(text = "Saved", modifier = Modifier.padding(0.dp))
                }

                Tab(state.value == ProfilePagerCategory.Following, onClick = {
                    state.value = ProfilePagerCategory.Following
                    selectedIndex.value = 2
                }) {
                    TextLead(text = "Following", modifier = Modifier.padding(0.dp))
                }
            }

            when (state.value) {
                ProfilePagerCategory.Recipes -> {
                    ProfileRecipes(navHostController)
                }

                ProfilePagerCategory.Saved -> {
                    Text(text = "Saved")
                }

                ProfilePagerCategory.Following -> {
                    Text(text = "Following")
                }
            }

        }

    }

}

@Composable
fun ProfileToolBar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        H3Text(
            text = "My Kitchen",
            modifier = Modifier.align(Alignment.CenterVertically)
        )
        Row(modifier = Modifier.align(Alignment.CenterVertically)) {
            Image(
                modifier = Modifier.align(Alignment.CenterVertically),
                painter = painterResource(id = R.drawable.ic_settings),
                contentDescription = null
            )
            Spacer(Modifier.padding(4.dp))
            TextBody(text = "Settings", modifier = Modifier.align(Alignment.CenterVertically))

        }
    }
}

@Composable
fun ProfileInfo() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier.height(80.dp),
            painter = painterResource(id = R.drawable.profile_avatar),
            contentDescription = null
        )
        Spacer(modifier = Modifier.padding(start = 16.dp))
        Column {

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                H5Text(text = "Nick Evans", modifier = Modifier.padding())

                Image(
                    modifier = Modifier.align(Alignment.CenterVertically),
                    painter = painterResource(id = R.drawable.ic_edit),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(color = colorResource(id = R.color.cape_cod))
                )
            }
            Spacer(modifier = Modifier.padding(top = 4.dp))

            TextGray(text = "Potato Master", modifier = Modifier.padding())
            Spacer(modifier = Modifier.padding(top = 12.dp))

            Row {
                TextGray(text = "584 followers", modifier = Modifier.padding())

                Image(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 10.dp, end = 10.dp),
                    painter = painterResource(id = R.drawable.ic_dot),
                    contentDescription = null
                )
                TextGray(text = "23k likes", modifier = Modifier.padding())
            }
        }

    }
}


@Composable
fun ProfileRecipes(navHostController: NavHostController) {

    //TODO: Despite being unstable Rewrite this LazyColumn with LazyVerticalGrid ...
//    LazyVerticalGrid(cells = , content = { /*TODO*/ })

    LazyColumn(modifier = Modifier.fillMaxHeight(), content = {

        item {
            Spacer(modifier = Modifier.padding(top = 24.dp))
        }

        items(getProfileRecipes()) { item ->
            ProfileRecipeItem(item, navHostController)
            Spacer(Modifier.padding(top = 16.dp))
        }

        item {
            Spacer(modifier = Modifier.padding(top = 72.dp))
        }

    })
}


@Composable
fun ProfileRecipeItem(item: Pair<ImageItem, ImageItem>, navHostController: NavHostController) {
    Row {

        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .clickable(onClick = {
                        navHostController.navigate("MyRecipe")
                    }),
            ) {
                Image(
                    painter = painterResource(id = item.first.image),
                    contentDescription = null
                )

                TextLead(
                    text = item.first.name,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 8.dp, bottom = 8.dp)
                )
            }

        }

        Spacer(modifier = Modifier.padding(start = 16.dp))

        Card(
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .clickable(onClick = {
                        navHostController.navigate("MyRecipe")
                    }),
            ) {
                Image(
                    painter = painterResource(id = item.second.image),
                    contentDescription = null
                )

                TextLead(
                    text = item.second.name,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 8.dp, bottom = 8.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun previewProfile() {
    ComposeTestAppTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ) {
            rememberNavController().also {
                Profile(it)
            }
        }
    }
}


